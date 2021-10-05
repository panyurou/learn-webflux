package com.webflux.stream;

import java.util.stream.Stream;

public class CommonlyUsedMethod {
    public static void main(String[] args) {
        // filter
        System.out.println("filter--------");
        Stream.of(1,2,3).filter(i -> i>2).forEach(System.out::println);

        // map
        System.out.println("map--------");
        Stream.of("张三","李四","王麻子").map(String::length).forEach(System.out::println);

        // limit
        System.out.println("limit--------");
        Stream.of("张三","李四","王麻子").limit(2).forEach(System.out::println);

        // skip
        System.out.println("skip--------");
        Stream.of("张三","李四","王麻子").skip(2).forEach(System.out::println);

        // peek
        System.out.println("peek--------");
        Stream.of("张三","李四","王麻子").peek(System.out::println).forEach(System.out::println);
    }
}
