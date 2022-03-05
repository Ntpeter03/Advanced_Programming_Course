package com.navidtandas;

import java.util.Scanner;

public class Main {
    public static int a = 0;
    public static void main(String[] args) {

        while (a!=1){
            Scanner sc = new Scanner(System.in);
            AverageScore averageScore=new AverageScore();
            int action;
            System.out.println();
            System.out.println("choose your action :");
            System.out.println("1:add new course");
            System.out.println("2:calculate the average");
            System.out.println("3:quite");
            System.out.println();
            action = sc.nextInt();
            switch (action){
                case 1:{
                    averageScore.addScore();
                    break;
                }
                case 2:{
                    averageScore.average();
                    break;
                }
                case 3: {
                a=1;
                break;
                }
                }
            }
        }
    }
 class AverageScore {
     Scanner sc = new Scanner(System.in);
    public static float totalScore;
    public static int totalCredit;
    public static float average;
    public void addScore(){

        System.out.println("please provide the credit of the course : ");
        int temp = sc.nextInt();
        totalCredit += temp;
        System.out.println("please provide the score of this course : ");
        totalScore = totalScore + (sc.nextFloat() * temp);
  }
    public void average(){
       // System.out.println(totalCredit + "  " + totalScore);
        average = totalScore/totalCredit;
        System.out.println("your average score : "+ average);
        if (average< 13)
            System.out.println("you didn't make it this time :(");
        else
            System.out.println("all good");
    }
}