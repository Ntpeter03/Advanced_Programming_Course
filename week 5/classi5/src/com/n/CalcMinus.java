package com.n;

public class CalcMinus implements Calculator {
    @Override
    public void calc(int a, int b) {
        System.out.println("a-b = "+ (a-b));
    }
}
