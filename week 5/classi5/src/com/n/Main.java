package com.n;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide the desired operation");
        String s = sc.nextLine();
        String operation = "";
        int index = 0;

        if (s.contains("+")){
            operation = "+";
            index = s.indexOf("+");
        }
        if (s.contains("-")){
            operation = "-";
            index = s.indexOf("-");
        }

        int a = Integer.parseInt(s.substring(0,index));
        int b = Integer.parseInt(s.substring(index+1));

        if (s.contains("+")){

            Calculator calculator = Factory.calculate(operation);
            calculator.calc(a, b);
        }
        if (s.contains("-")){

            Calculator calculator = Factory.calculate(operation);
            calculator.calc(a, b);

        }
    }
}
