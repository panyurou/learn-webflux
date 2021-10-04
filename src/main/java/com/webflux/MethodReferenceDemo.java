package com.webflux;

import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReferenceDemo {
    static class Dog {
        private String name = "啸天犬";
        private int food_weight = 10;

        public static void bark(Dog dog) {
            System.out.println(dog + "狗叫了");
        }

        public int eat(int weight) {
            System.out.println("小狗吃了" + weight + "斤狗粮");
            this.food_weight -= weight;
            return this.food_weight;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }

    public static void main(String[] args) {
//方法引用
//Consumer<String> consumer = s -> System.out.println(s); 输出的参数和输入的参数一致，可以缩写
// 实例中我们将 System.out::println 方法作为静态方法来引用。


        Consumer<String> consumer = System.out::println;
        consumer.accept("接受的数据");
//静态方法
        Dog dog = new Dog();
        Consumer<Dog> consumer2 = Dog::bark;
        consumer2.accept(dog);

        Function<Integer,Integer> function = dog::eat;
        int weight = function.apply(3);
        System.out.println("还剩余"+weight+"斤狗粮");
    }

}
