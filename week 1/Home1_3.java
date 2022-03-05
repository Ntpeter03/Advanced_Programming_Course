package com.navidtandas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float x, y, a, b, c, d, e, f;
        System.out.println("ax+by=e & cx+dy=f");
        System.out.println("Enter ");
        System.out.print("a : ");
        a = sc.nextFloat();
        System.out.print("b : ");
        b = sc.nextFloat();
        System.out.print("e : ");
        e = sc.nextFloat();
        System.out.print("c : ");
        c = sc.nextFloat();
        System.out.print("d : ");
        d = sc.nextFloat();
        System.out.print("f : ");
        f = sc.nextFloat();

        if ((a/c)==(b/d)&&(a/c)!=(e/f)){
            System.out.println("Error.");
        }
        else {
            x = ( (e*d)-(b*f) ) / ( (a*d)-(b*c) );
            y = ( (a*f)-(e*c) ) / ( (a*d)-(b*c) );
            System.out.println("x = "+ x +"  & y = "+ y);

        }
        }


    }

