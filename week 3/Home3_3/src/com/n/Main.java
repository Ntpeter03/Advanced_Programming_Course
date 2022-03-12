package com.n;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NumberCheck numberCheck = new NumberCheck();
        Scanner sc = new Scanner(System.in);
        String[] string = new String[10];
        System.out.println("please provide Strings elements");
        for(int i =0;i<10;i++){
            System.out.print(i+1 +": ");
            string[i] = sc.nextLine();
        }
        try{
            numberCheck.NumberChecking(string);
            System.out.println("This string doesn't contain an integer and its length is "+ string.length);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
