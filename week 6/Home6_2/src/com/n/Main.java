package com.n;

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
                    2:delete
                    3:exit""");
            int a = sc.nextInt();
            switch (a){
                case 1:{
                    System.out.println("enter name");
                    String name = sc.next();
                    System.out.println("enter code");
                    String code = sc.next();
                    System.out.println("enter father name");
                    String fatherName = sc.next();
                    System.out.println("enter role");
                    String role = sc.next();
                    System.out.println("enter income");
                    String income = sc.next();
                    System.out.println("enter history");
                    String history = sc.next();
                    Entity signup = new Entity(name, code, fatherName, role, income, history);
                    try{
                        repository.addUser(signup);}
                    catch (Exception e){
                        System.out.println("Error signing up");
                    }
                    break;
                }
                case 2:{
                    System.out.println("enter id : ");
                    int id = sc.nextInt();
                    repository.delete(id);
                    break;
                }
                case 3:
                    r=0;
                    break;
            }
        }
    }
}
