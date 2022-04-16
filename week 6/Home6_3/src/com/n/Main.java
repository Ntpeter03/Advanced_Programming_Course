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
                    3:edit
                    4:exit""");
            int a = sc.nextInt();
            switch (a){
                case 1:{
                    System.out.println("enter name");
                    String name = sc.next();
                    System.out.println("enter code");
                    String code = sc.next();
                    System.out.println("enter year");
                    String year = sc.next();
                    System.out.println("enter score");
                    String score = sc.next();
                    Entity signup = new Entity(code, name, year, score);
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
                case 3:{
                    System.out.println("id : ");
                            int idE = sc.nextInt();
                            System.out.println("id = " + idE);
                            System.out.println("enter name");
                            String name = sc.next();
                            System.out.println("enter code");
                            String code = sc.next();
                            System.out.println("enter year");
                            String year = sc.next();
                            System.out.println("enter score");
                            String score = sc.next();
                            Entity edit = new Entity(code, name, year, score);
                            repository.editUser(idE,edit);

                    break;
                }
                case 4:{
                    r=0;
                    break;}
            }
        }
    }
}
