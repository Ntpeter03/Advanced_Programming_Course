package com.n;

import com.n.model.Entity;
import com.n.model.Repository;
import com.n.model.Service;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    //database : classi      table: users       columns :   user_name    password     name      email
    //you should import mysql j8 connector library to run
    public static void main(String[] args) throws SQLException {
        int r = 1;
        Scanner sc= new Scanner(System.in);

        Repository repository = new Repository();

        while ( r!=0){
            System.out.println("""
                    1:sign up
                    2:sign in
                    3:exit""");
            int a = sc.nextInt();
            switch (a){
                case 1:{
                    System.out.println("enter user name");
                    String username = sc.next();
                    System.out.println("enter pass");
                    String pass = sc.next();
                    System.out.println("enter name");
                    String name = sc.next();
                    System.out.println("enter email");
                    String email = sc.next();
                    Entity signup = new Entity(name, username, pass, email);
                    try{
                        Service.getInstance().signIn(signup);}
                    catch (Exception e){
                        System.out.println("Error signing up");
                    }
                    break;
                }
                case 2:{
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
                                }
                                else {System.out.println("Wrong Password");}
                            } else {System.out.println("Please Provide a Password");}
                        } else {System.out.println("Wrong userID");}
                    } else {System.out.println("Please Provide a userID");}
                    break;
                }
                case 3:
                    r=0;
                    break;
            }
        }
    }
}
