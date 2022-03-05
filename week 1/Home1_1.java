package com.navidtandas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("What is your Shape ? ");
        System.out.println("1:square");
        System.out.println("2:Circle");
        Scanner sc = new Scanner(System.in);
        int shape = sc.nextInt();
        Shape shape1 = new Shape();
        switch (shape){
            case 1:{
              shape1.square();
                break;
            }
            case 2:{
                shape1.circle();
                break;
            }
        }

    }
}
 class Shape {
    public static float r;
    public static float a;

    public void circle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide Radius : ");
        float r = sc.nextFloat();
        float pi = 3.14f;
        float Circle_S = r * r * pi;
        float Circle_P = 2 * r * pi;
        System.out.println("area = " + Circle_S);
        System.out.println("Perimeter = " + Circle_P);

    }

    public void square() {
        System.out.println("Please provide Side Size : ");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float Square_S = a * a;
        float Square_P = 4 * a;
        System.out.println("area = " + Square_S);
        System.out.println("Perimeter = " + Square_P);
    }

}