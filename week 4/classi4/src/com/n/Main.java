package com.n;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("na","fa","nafa","nafa2","student",18);
        System.out.println(student.getName());
        System.out.println(student.getFamily());
        System.out.println(student.getUserName());
        System.out.println(student.getPass());
        System.out.println(student.getAge());
        student.setName("ali");
        System.out.println(student.getName());
	// write your code here
    }
}
