package com.webflux;

import java.util.function.IntUnaryOperator;

public class MethodReferenceDemo {
    static class Dog {
        private int food_weight = 10;

//      JDk会默认把当前实例传入到非静态方法，参数名为this，位置是第一个
        public int eat(Dog this, int weight) {
            System.out.println("小狗吃了" + weight + "斤狗粮");
            this.food_weight -= weight;
            return this.food_weight;
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
//        Function<Integer, Integer> function = dog::eat;
//        UnaryOperator<Integer> function = dog::eat;
        IntUnaryOperator function = dog::eat;
        int weight = function.applyAsInt(3);
        System.out.println("还剩余" + weight + "斤狗粮");
    }
}