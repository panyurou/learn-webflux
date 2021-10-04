package com.webflux;

public class Test {
    public static void main(String[] args) {
      new Thread(new Runnable() {
          @Override
          public void run() {
              System.out.println("正常创建一个线程");
          }
      }).start();
      new Thread(()-> System.out.println("Lambda创建一个线程")).start();
    }
}
