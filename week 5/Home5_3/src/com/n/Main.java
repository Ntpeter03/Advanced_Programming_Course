package com.n;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("please select a car\n" +
                "1: samand\n" +
                "2: pride");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Car car = Factory.getCar(num);
        car.start();
        car.color();
        car.engine();
    }
}
