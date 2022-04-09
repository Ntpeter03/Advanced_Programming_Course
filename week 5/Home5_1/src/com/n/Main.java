package com.n;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please provide following ");
        System.out.println("Username");
        String userName = sc.nextLine();

        System.out.println("Name");
        String name = sc.nextLine();

        System.out.println("Password");
        String pass = sc.nextLine();


        System.out.println("Address");
        String address = sc.nextLine();

        System.out.println("Phone Number");
        String phone = sc.nextLine();

        System.out.println("Education");
        String education = sc.nextLine();

        System.out.println("Age");
        int age  = sc.nextInt();


        Builder person = new Builder().setUserName(userName).setName(name).setAge(age)
                .setPass(pass).setAddress(address).setPhone(phone).setEducation(education);
        System.out.println(person.getName());
        System.out.println(person.getUserName());
        System.out.println(person.getPass());
        System.out.println(person.getAge());
        System.out.println(person.getAddress());
        System.out.println(person.getPhone());
        System.out.println(person.getEducation());
    }
}
