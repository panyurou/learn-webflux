package com.webflux.stream;

import java.util.stream.IntStream;

public class ParallelStream {
    public static void main(String[] args) {
        IntStream.range(1, 10)
                .parallel().peek(ParallelStream::debugger)
                .sequential().peek(ParallelStream::debugger2)
                .count();
    }

    private static void debugger2(int i) {
        System.err.println("debugger2: " + i);
    }

    private static void debugger(int i) {
        System.out.println("debugger1: " + i);
    }
}
