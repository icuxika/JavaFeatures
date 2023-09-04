package com.icuxika.nineteen.fourtwofour;

import com.icuxika.nineteen.fourtwofour.jextract.LibffmpegRunDemo;

public class JextractDemo {

    public void runWithLibffmpeg(String[] args) {
        var exit = LibffmpegRunDemo.run(args);
        System.err.println("message: " + exit.message());
        System.err.println("exitCode: " + exit.exitCode());
    }

}
