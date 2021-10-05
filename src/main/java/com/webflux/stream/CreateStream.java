package com.webflux.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {
        //从集合创建
        ArrayList arrayList = new ArrayList();
        arrayList.stream();
        arrayList.parallelStream();

        //从数组创建
        Arrays.stream(new int[]{1,2,3});

        //从数字创建
        IntStream.of(1,2,3);
        IntStream.rangeClosed(1,10);

        //Stream.generate
        Stream.generate(()-> "stream").limit(5);

    }
}
