package com.n;



public class Main {
//print a shape using stars and the for loop
    public static void main(String[] args) {
        int n = 4;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
