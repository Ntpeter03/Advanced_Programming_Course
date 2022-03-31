package com.n;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Student student = new Student();
    List<Integer> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

        System.out.println("name: " );
    student.name = sc.nextLine();
        System.out.println("father name: ");
        student.father = sc.nextLine();
        System.out.println("Student Number: ");
        student.sNum = sc.nextInt();

        System.out.println("5 scores");
        for (int i = 1;i <= 5;i++){
            System.out.print(i+": ");
            list.add(sc.nextInt());
        }
        student.scores=list;
        for (Object integer : (ArrayList) student.getScores()){
            System.out.println(integer);
        }
        System.out.println("name : "+student.getName());
        System.out.println("fatherName: "+student.getFather());
        System.out.println("number :"+student.getsNum());
    }
}
