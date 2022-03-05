package com.n;

import java.util.Scanner;

public class Main {
//searching for a number in an array
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int x = sc.nextInt();
        System.out.print("Enter The Number Of Your Array Elements: ");
        int n =sc.nextInt();
        System.out.println("Enter The Elements: ");
        int[] y=new int[100] ;
        for (int i =0 ; i<n;i++) {
            y[i] = sc.nextInt();
        }
        boolean u;
        u = search_Number(x,y);
        System.out.println(u);
    }
    public static boolean search_Number(int x,int[] y) {
        int t = 0;
        for(int i=0;i<18;i++){
            // System.out.println(".");
            if (x==y[i])
                t=t+1;
        }
        System.out.println(t);
        return t!=0;
    }
}