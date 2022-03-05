package com.n;

import java.util.Scanner;

public class Main {
// it takes 2 numbers from the user and chooses + - * / using switch case
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.println("to add the numbers Enter 1.");
        System.out.println("to subtract the numbers Enter 2.");
        System.out.println("to multiply the numbers Enter 3.");
        System.out.println("to divide the numbers Enter 4.");
        int n = sc.nextInt();
        switch (n) {
            case 1: {
                System.out.println(a + b);
                break;
            }
            case 2: {
                if (a < b) {
                    System.out.println(b - a);
                    break;
                } else {
                    System.out.println(a - b);
                    break;
                }
            }
            case 3: {
                System.out.println(a * b);
                break;
            }
            case 4: {
                System.out.println("a/b: " + a / b + " or b/a: " + b / a);
                break;
            }
        }
    }
}
