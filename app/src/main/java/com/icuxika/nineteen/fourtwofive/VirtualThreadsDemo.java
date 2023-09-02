package com.icuxika.nineteen.fourtwofive;

import jdk.internal.vm.Continuation;
import jdk.internal.vm.ContinuationScope;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

/**
 * 虚拟线程
 * <a href="https://openjdk.org/jeps/425">JEP 425: Virtual Threads (Preview)</a>
 * <p>
 * <a href="https://github.com/JosePaumard/JDK20_2023-Loom-Lab/blob/master/src/main/java/org/paumard/loom/A_virtualthread/E_HowManyPlatformThreads.java">E_HowManyPlatformThreads.java</a>
 * <p>
 * <a href="https://www.youtube.com/watch?v=QxxG66eQoTc&ab_channel=IntelliJIDEAbyJetBrains">Virtual Threads and Structured Concurrency in Java 21 With Loom</a>
 */
public class VirtualThreadsDemo {

    public void run() {
        // 通过 Executors.newVirtualThreadPerTaskExecutor() 与通过 Thread.ofVirtual() 来创建虚拟线程似乎没有区别，都会运行在ForkJoinPool上的平台线程上
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            IntStream.range(0, 10_000).forEach(i -> {
                executor.submit(() -> {
                    System.out.println(Thread.currentThread());
                    Thread.sleep(Duration.ofSeconds(1));
                    return i;
                });
            });
        }

        try {
            var pThread = Thread.ofPlatform().unstarted(() -> System.out.println("ofPlatform===============" + Thread.currentThread()));
            pThread.start();
            pThread.join();

            // 从 VirtualThread[#10058]/runnable@ForkJoinPool-1-worker-15 来看虚拟线程的运行必定会需要ForkJoinPool提供一个平台线程
            var vThread = Thread.ofVirtual().unstarted(() -> System.out.println("ofVirtual===============" + Thread.currentThread()));
            vThread.start();
            vThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // 虚拟线程可以从一个平台线程跳到另一个平台线程
        var threads = IntStream.range(0, 10)
                .mapToObj(index -> Thread.ofVirtual().unstarted(() -> {
                    if (index == 0) {
                        // irtualThread[#10059]/runnable@ForkJoinPool-1-worker-15
                        System.out.println(Thread.currentThread());
                    }
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (index == 0) {
                        // VirtualThread[#10059]/runnable@ForkJoinPool-1-worker-1
                        System.out.println(Thread.currentThread());
                    }
                })).toList();
        threads.forEach(Thread::start);
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        {
            ContinuationScope scope = new ContinuationScope("scope");
            Continuation continuation = new Continuation(scope, () -> {
                System.out.println("Running");
            });
            System.out.println("Start");
            continuation.run();
            System.out.println("Done");
        }

        {
            ContinuationScope scope = new ContinuationScope("scope");
            Continuation continuation = new Continuation(scope, () -> {
                System.out.println("Running");
                // 会暂停 continuation的运行，直到下一次continuation.run()的调用
                Continuation.yield(scope);
                System.out.println("Still Running");
            });
            System.out.println("Start");
            continuation.run();
            System.out.println("Done");
        }
        {
            ContinuationScope scope = new ContinuationScope("scope");
            Continuation continuation = new Continuation(scope, () -> {
                System.out.println("Running");
                Continuation.yield(scope);
                System.out.println("Still Running");
            });
            System.out.println("Start");
            continuation.run();
            System.out.println("Back");
            // 再次调用后，continuation接着没有运行完的代码继续运行
            continuation.run();
            System.out.println("Done");
        }

    }

    public void run1() {
        Set<String> poolNames = ConcurrentHashMap.newKeySet();
        Set<String> pThreadNames = ConcurrentHashMap.newKeySet();

        var threads = IntStream.range(0, 1_000_000)
                .mapToObj(i ->
                        Thread.ofVirtual().unstarted(() -> {
                            String poolName = readPoolName();
                            poolNames.add(poolName);
                            String workerName = readWorkerName();
                            pThreadNames.add(workerName);
                        })
                ).toList();

        Instant begin = Instant.now();
        threads.forEach(Thread::start);
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        Instant end = Instant.now();
        System.out.println("Time = " + Duration.between(begin, end).toMillis() + "ms");
        System.out.println("# cores = " + Runtime.getRuntime().availableProcessors());
        System.out.println("# Pools: " + poolNames.size()); // VirtualThread[#30]/runnable@ForkJoinPool-1-worker-9 中的 ForkJoinPool-1
        System.out.println("# Platform threads: " + pThreadNames.size()); // VirtualThread[#30]/runnable@ForkJoinPool-1-worker-9 中的 worker-9
    }

    static long counter = 0;
    static final Object lock = new Object();

    public void run2() {
        Set<String> pThreadNames = ConcurrentHashMap.newKeySet();
        ChronoUnit delay = ChronoUnit.MICROS;
//        final Object lock = new Object();

        var threads = IntStream.range(0, 100)
                .mapToObj(index -> Thread.ofVirtual().unstarted(() -> {
                    try {
                        if (index == 0) {
                            System.out.println(Thread.currentThread());
                        }
                        pThreadNames.add(readWorkerName());

                        // Loom 知道synchronized同步的锁使用的是栈上的一个东西，会把虚拟线程固定到一个平台线程上
                        // 从第二次打印开始，如果worker变了，后面的就不会了
                        // VirtualThread[#29]/runnable@ForkJoinPool-1-worker-1
                        // VirtualThread[#29]/runnable@ForkJoinPool-1-worker-16
                        // VirtualThread[#29]/runnable@ForkJoinPool-1-worker-16
                        // VirtualThread[#29]/runnable@ForkJoinPool-1-worker-16
                        synchronized (lock) {
                            Thread.sleep(Duration.of(1, delay));
                            counter++;
                        }
                        if (index == 0) {
                            System.out.println(Thread.currentThread());
                        }
                        pThreadNames.add(readWorkerName());

                        synchronized (lock) {
                            Thread.sleep(Duration.of(1, delay));
                            counter++;
                        }
                        if (index == 0) {
                            System.out.println(Thread.currentThread());
                        }
                        pThreadNames.add(readWorkerName());

                        synchronized (lock) {
                            Thread.sleep(Duration.of(1, delay));
                            counter++;
                        }
                        if (index == 0) {
                            System.out.println(Thread.currentThread());
                        }
                        pThreadNames.add(readWorkerName());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                })).toList();
        threads.forEach(Thread::start);
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        synchronized (lock) {
            System.out.println("# counter = " + counter);
        }
        System.out.println("# Platform threads: = " + pThreadNames.size());
    }

    public void run3() {
        Set<String> pThreadNames = ConcurrentHashMap.newKeySet();
        ChronoUnit delay = ChronoUnit.MICROS;
        ReentrantLock reentrantLock = new ReentrantLock();

        var threads = IntStream.range(0, 100)
                .mapToObj(index -> Thread.ofVirtual().unstarted(() -> {
                    try {
                        if (index == 0) {
                            System.out.println(Thread.currentThread());
                        }
                        pThreadNames.add(readWorkerName());

                        // 把 synchronized 锁换成 ReentrantLock，可以发现，虚拟线程在不同平台之间跳来跳去了，可以尝试用这个改善性能
                        // VirtualThread[#29]/runnable@ForkJoinPool-1-worker-1
                        // VirtualThread[#29]/runnable@ForkJoinPool-1-worker-7
                        // VirtualThread[#29]/runnable@ForkJoinPool-1-worker-13
                        // VirtualThread[#29]/runnable@ForkJoinPool-1-worker-14
                        reentrantLock.lock();
                        try {
                            Thread.sleep(Duration.of(1, delay));
                            counter++;
                        } finally {
                            reentrantLock.unlock();
                        }
                        if (index == 0) {
                            System.out.println(Thread.currentThread());
                        }
                        pThreadNames.add(readWorkerName());

                        reentrantLock.lock();
                        try {
                            Thread.sleep(Duration.of(1, delay));
                            counter++;
                        } finally {
                            reentrantLock.unlock();
                        }
                        if (index == 0) {
                            System.out.println(Thread.currentThread());
                        }
                        pThreadNames.add(readWorkerName());

                        reentrantLock.lock();
                        try {
                            Thread.sleep(Duration.of(1, delay));
                            counter++;
                        } finally {
                            reentrantLock.unlock();
                        }
                        if (index == 0) {
                            System.out.println(Thread.currentThread());
                        }
                        pThreadNames.add(readWorkerName());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                })).toList();
        threads.forEach(Thread::start);
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        synchronized (lock) {
            System.out.println("# counter = " + counter);
        }
        System.out.println("# Platform threads: = " + pThreadNames.size());
    }

    private String readPoolName() {
        String name = Thread.currentThread().toString();
        Matcher poolMatcher = Pattern.compile("ForkJoinPool-\\d+").matcher(name);
        if (poolMatcher.find()) {
            return poolMatcher.group();
        }
        return "pool not found";
    }

    private String readWorkerName() {
        String name = Thread.currentThread().toString();
        Matcher workerMatcher = Pattern.compile("worker-\\d+").matcher(name);
        if (workerMatcher.find()) {
            return workerMatcher.group();
        }
        return "worker not found";
    }
}
