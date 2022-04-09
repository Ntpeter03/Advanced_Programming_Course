package com.n;

public class Pride implements Car{
    @Override
    public void start() {
        System.out.println("pride start");
    }

    @Override
    public void engine() {
        System.out.println("pride engine");
    }

    @Override
    public void color() {
        System.out.println("blue");
    }
}
