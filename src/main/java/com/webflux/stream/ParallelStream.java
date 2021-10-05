package com.webflux.stream;

import java.util.stream.IntStream;

public class ParallelStream {
    public static void main(String[] args) {
        IntStream.range(1,100).parallel().peek(ParallelStream::debugger).count();
    }
    private static void debugger(int i) {
        System.out.println("debugger"+i);
    }
}
