package com.n;

import com.n.model.Entity;
import com.n.model.Service;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    //database : classi      table: users       columns :   username    password     cash      net
    //you should import mysql j8 connector library to run
    public static void main(String[] args) throws SQLException {
        int r = 1;
        Scanner sc= new Scanner(System.in);


        while ( r!=0){
            System.out.println("""
                    1:sign in
                    2:exit
                    """);
            int a = sc.nextInt();
            switch (a) {
                case 1 -> {
                    System.out.println("username : ");
                    String userName = sc.next();
                    System.out.println("pass : ");
                    String password = sc.next();
                    Entity loginEntity = new Entity();
                    loginEntity.setUserName(userName);
                    loginEntity.setPassword(password);
                    if (!userName.equals("")) {
                        if (Service.getInstance().userNameExistence(loginEntity)) {
                            if (!password.equals("")) {
                                if (Service.getInstance().password(loginEntity)) {
                                    System.out.println("ok");
                                    shop(loginEntity);
                                } else {
                                    System.out.println("Wrong Password");
                                }
                            } else {
                                System.out.println("Please Provide a Password");
                            }
                        } else {
                            System.out.println("Wrong userID");
                        }
                    } else {
                        System.out.println("Please Provide a userID");
                    }
                }
                case 2 -> r = 0;
            }
        }
    }
    public static void shop(Entity loginEntity) throws SQLException {
        int r = 1;
        Scanner sc= new Scanner(System.in);
        while ( r!=0){

            System.out.println("""
                    1:shop
                    2:sign out
                    """);
            int a = sc.nextInt();
            try{
               Service.getInstance().getInfo(loginEntity);
            } catch (SQLException e) {
                System.out.println("error");
                a = 2;
            }
            switch (a) {
                case 1 -> {
                    System.out.println("""
                            1: 2GB : 1000t
                            2: 4GB : 2000t
                            3: 10GB : 5000t
                            4: 25GB : 10000t
                            """);
                    int b = sc.nextInt();
                    switch (b) {
                        case 1 -> {
                            Service.getInstance().update(loginEntity, 2, 1000);
                        }
                        case 2 -> {
                            Service.getInstance().update(loginEntity, 4, 2000);
                        }
                        case 3 -> {
                            Service.getInstance().update(loginEntity, 10, 5000);
                        }
                        case 4 -> {
                            Service.getInstance().update(loginEntity, 25, 10000);
                        }
                    }
                }
                case 2 -> r = 0;
            }
        }









    }
}
