package com.webflux.stream;

import java.util.stream.IntStream;

public class StreamDemo1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int num2 = IntStream.of(numbers).map(StreamDemo1::doubleNum).sum();
        System.out.println(num2);

        IntStream.of(numbers).map(StreamDemo1::doubleNum);
    }

    private static int doubleNum(int i) {
        System.out.println("执行了乘以2");
        return i * 2;
    }
}
