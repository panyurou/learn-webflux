package com.webflux;

import java.util.function.Supplier;

public class SupplierDemo {
    public String supplyName(Supplier<String> supplier) {
        return supplier.get();
    }
    public static void main(String[] args) {
        SupplierDemo supplierDemo = new SupplierDemo();
        String name = supplierDemo.supplyName(() -> "张三");
        System.out.println(name);
    }
}