package com.webflux.stream;

import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

public class ParallelStream {
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool(20);
        forkJoinPool.submit(() -> IntStream.range(1, 10)
                .parallel().peek(ParallelStream::debugger)
                .count());
        forkJoinPool.shutdown();

        synchronized (forkJoinPool) {
            try {
                forkJoinPool.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    private static void debugger(int i) {
        System.out.println(Thread.currentThread().getName() + "debugger1: " + i);
    }
}
