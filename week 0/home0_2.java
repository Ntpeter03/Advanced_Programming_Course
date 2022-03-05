package com.n;

import java.util.Scanner;

public class Main {
// finding the maximum number in an array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max;
        System.out.print("Please Enter The Number Of The Array Elements: ");
        int n = sc.nextInt();
        int[] a = new int[100] ;
        System.out.println("Please Enter The Numbers: ");
        for (int i=0; i<n ;i++){
            a[i] = sc.nextInt();
        }
        max = a[0];
        for (int j = 0;j<n;j++){
            if (a[j+1]>max){
                max = a[j+1];
            }
        }

        System.out.println("Max= " + max);
    }
}
