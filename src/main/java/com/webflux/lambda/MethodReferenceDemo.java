package com.webflux.lambda;

import java.util.function.Function;

public class MethodReferenceDemo {
    static class Dog {
        private String name = "啸天犬";

        public Dog(String name) {
            this.name = name;
        }
        @Override
        public String toString() {
            return this.name;
        }
    }

    public static void main(String[] args) {
        Function<String,Dog> function2 =  Dog::new;;
        System.out.println(function2.apply("小杂毛"));
    }
}