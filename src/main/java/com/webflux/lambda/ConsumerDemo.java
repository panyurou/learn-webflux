package com.webflux.lambda;

import java.util.function.Consumer;

public class ConsumerDemo {

    public void printName(String name, Consumer<String> consumer) {
        consumer.accept(name);
    }

    public static void main(String[] args) {
        ConsumerDemo consumerDemo = new ConsumerDemo();
        consumerDemo.printName("张三", (String name) -> System.out.println("姓名为 : " + name));
    }
}
