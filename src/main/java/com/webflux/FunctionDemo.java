package com.webflux;

@FunctionalInterface
interface MyFunctionalInterface {
    void doSth();
}

public class FunctionDemo {
    public void doSth2(MyFunctionalInterface demo) {
        System.out.println("MyFunctionalInterface");
        demo.doSth();
    }

    public static void main(String[] args) {
        FunctionDemo functionDemo = new FunctionDemo();
        functionDemo.doSth2(() -> System.out.println("do it"));
    }
}

