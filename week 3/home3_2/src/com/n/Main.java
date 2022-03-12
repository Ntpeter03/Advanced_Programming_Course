package com.n;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Delta delta = new Delta();
        System.out.println("Please Provide ax^2 + bx + c = 0");
        System.out.println("a= ");
        int a = scanner.nextInt();
        System.out.println("b= ");
        int b = scanner.nextInt();
        System.out.println("c= ");
        int c = scanner.nextInt();
        try {
            int del = delta.deltaCal(a, b, c);
            if ( del == 0 ){
                System.out.println("x= "+ (-b)/(2*a));
            }
            else {
                double del_sqrt = Math.sqrt(del);
                System.out.println("x1= "+(-b + del_sqrt)/(2*a) );
                System.out.println("x2= "+(-b - del_sqrt)/(2*a) );
            }
        }
        catch (Exception e){
            System.out.println(e);

        }

    }
}
