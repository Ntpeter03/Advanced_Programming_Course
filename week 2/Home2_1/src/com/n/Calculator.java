package com.n;

import java.awt.desktop.PrintFilesEvent;
import java.util.Scanner;

public class Calculator {
    public double number_1;
    public double number_2;
    public double summery;

    public Calculator() {
        System.out.println("please provide your numbers :");
        Scanner sc = new Scanner(System.in);
        System.out.println("a : ");
        number_1 = sc.nextDouble();
        System.out.println("b : ");
        number_2 = sc.nextDouble();

    }
    public void multiplication (){
        summery = number_1 * number_2;
        System.out.println(summery);
    }

    public void sum() {
        summery = number_1 + number_2;
        System.out.println(summery);
    }
    public void subtraction1(){
        summery = number_1 - number_2;
        System.out.println(summery);
    }
    public void subtraction2(){
        summery = number_2 - number_1;
        System.out.println(summery);
    }
    public void divide1(){
        summery = number_1 / number_2;
        System.out.println(summery);
    }

    public void divide2(){
        summery = number_2 / number_1;
        System.out.println(summery);
    }
}

