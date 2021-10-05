package com.webflux.stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalMethod {
    public static void main(String[] args) {

        //count
        System.out.println("count--------");
        System.out.println(Stream.of("张三", "李四", "王麻子").count());

        //forEach
        System.out.println("forEach--------");
        Stream.of(1, 2, 3).forEach(System.out::println);

        //并行流
        System.out.println("并行流-----------------");
        String str = "my name is lisi";
        str.chars().parallel().forEach(i -> System.out.print((char) i));

        // collect 收集到list
        System.out.println("collect 收集到list------------------------------");
        List<String> list = Stream.of(str.split(" ")).collect(Collectors.toList());
        System.out.println("收集到list:"+list);

        //使用reduce拼接字符串
        System.out.println("使用reduce拼接字符串----------------");
        Optional<String> newStr = Stream.of(str.split("")).reduce((str1, str2) -> str1 + "-" + str2);
        System.out.println(newStr.orElse(""));

        System.out.println("使用reduce拼接字符串-+ 带有初始值---------------");
        String newStr2 = Stream.of(str.split("")).reduce("", (str1, str2) -> str1 + "-" + str2);
        System.out.println(newStr2);

        //使用reduce计算所有单词总长度
        System.out.println("用reduce计算所有单词总长度");
        Optional<Integer> length = Stream.of(str.split(" ")).map(s -> s.length()).reduce((len1, len2) -> len1 + len2);
        System.out.println("length:" + length.get());

        //max
        Optional<String> maxValue = Stream.of(str.split(" ")).max((str1, str2) -> str1.length() - str2.length());
        System.out.println("maxValue:" + maxValue.get());

        //findFirst
        Optional<String> firstValue = Stream.of(str.split(" ")).findFirst();
        System.out.println("firstValue:" + firstValue.get());
    }
}