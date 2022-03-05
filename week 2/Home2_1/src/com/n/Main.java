package com.n;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println(" + - * / ");
        String action = sc.nextLine();
        switch (action){
            case "+":{
                calculator.sum();
                break;
            }
            case "-":{
                System.out.println("a-b = ");
                calculator.subtraction1();
                System.out.println("b-a = ");
                calculator.subtraction2();
                break;
            }
            case "*":{
                calculator.multiplication();
                break;
            }
            case "/":{
                System.out.println("a/b = ");
                calculator.divide1();
                System.out.println("b/a = ");
                calculator.divide2();
                break;
            }
        }//switch
    }//main
}//Main1
