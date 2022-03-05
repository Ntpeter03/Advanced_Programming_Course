package com.n;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide an integer Number : ");
        int a = sc.nextInt();
        Class1 class1 = new Class1();
        class1.isEven(a);
        class1.isOdd(a);
        class1.isNegative(a);
        class1.isPositive(a);
        class1.isZero(a);
    }//main
}//Main1
