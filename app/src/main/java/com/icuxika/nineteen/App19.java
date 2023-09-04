package com.icuxika.nineteen;

import com.icuxika.nineteen.fourtwoeight.StructuredConcurrencyDemo;
import com.icuxika.nineteen.fourtwofour.JextractDemo;

public class App19 {

    public static void main(String[] args) {
        System.out.println("JDK 19");
//        VirtualThreadsDemo virtualThreadsDemo = new VirtualThreadsDemo();
//        virtualThreadsDemo.run3();
//        StructuredConcurrencyDemo structuredConcurrencyDemo = new StructuredConcurrencyDemo();
//        structuredConcurrencyDemo.run();
        JextractDemo jextractDemo = new JextractDemo();
        jextractDemo.runWithLibffmpeg(new String[]{"C:\\\\Users\\\\icuxika\\\\Desktop\\\\test.mp4"});
    }

}
