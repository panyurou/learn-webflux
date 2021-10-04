package com.webflux;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.function.Function;


public class MoneyDemo {

    public final int money;

    public MoneyDemo(int money) {
        this.money = money;
    }

    public void printMoney(Function<Integer,String> moneyFormat){
        System.out.println(String.format("金额数为：" + moneyFormat.apply(this.money)));
    }

    public static void main(String[] args) {
        MoneyDemo moneyDemo = new MoneyDemo(999);
        Function<Integer, String> moneyFormat = i -> new DecimalFormat("#,##").format(i);
        moneyDemo.printMoney(moneyFormat.andThen(s->"人民币"+s));
    }
}
