package com.icuxika.twenty.fourtwonine;

import jdk.incubator.concurrent.ScopedValue;

import java.time.Duration;
import java.time.Instant;

public class ScopedValuesDemo {

    public void run() {
        ScopedValue<String> KEY = ScopedValue.newInstance();
        Runnable task = () -> System.out.println(KEY.isBound() ? KEY.get() : "Not bound");
        ScopedValue.where(KEY, "A").run(task);
        ScopedValue.where(KEY, "B").run(task);
        task.run();
    }

    public void run1() {
        Instant begin = Instant.now();
        TravelPage travelPage = null;
        try {
            travelPage = ScopedValue.where(Quotation.LICENSE, "License A")
                    .call(TravelPage::readTravelPage);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Instant end = Instant.now();
        System.out.println("travelPage = " + travelPage);
        System.out.println("Time is = " + Duration.between(begin, end).toMillis() + "ms");
    }
}
