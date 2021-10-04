package com.webflux;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.Supplier;

public class MethodReferenceDemo {
    static class Dog {
        private String name = "啸天犬";

        public Dog() {

        }

        @Override
        public String toString() {
            return this.name;
        }

        public Dog(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Supplier<Dog> supplier = Dog::new;
        System.out.println(supplier.get());

        Function<String,Dog> function2 =  Dog::new;;
        System.out.println(function2.apply("小杂毛"));
    }
}