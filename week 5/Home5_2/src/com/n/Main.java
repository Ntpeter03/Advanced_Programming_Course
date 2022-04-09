package com.n;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("please provide following ");
        System.out.println("Username");
        String userName = sc.nextLine();
        User.getInstance().setUserName(userName);

        System.out.println("Name");
        String name = sc.nextLine();
        User.getInstance().setName(name);

        System.out.println("Password");
        String pass = sc.nextLine();
        User.getInstance().setPass(pass);

        System.out.println("Address");
        String address = sc.nextLine();
        User.getInstance().setAddress(address);

        System.out.println("Phone Number");
        String phone = sc.nextLine();
        User.getInstance().setPhone(phone);

        System.out.println("The user info is \n" +
                "name "+User.getInstance().getName() +
                "\nphone "+User.getInstance().getPhone()+
                "\nusername "+User.getInstance().getUserName()+
                "\npassword "+User.getInstance().getPass()+
                "\naddress "+User.getInstance().getAddress()
        );

    }
}
