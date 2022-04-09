package com.n;

public class CalcPlus implements Calculator {
    @Override
    public void calc(int a, int b) {
        System.out.println("a+b = "+ (a+b));
    }
}
