package com.n;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {
        //database : classi      table: users       columns :   User_name    password     age      email
        //     account_id(PK)        education
        //you should import mysql j8 connector library to run
            int r = 1;
            int id = 1;
            Scanner sc = new Scanner(System.in);

            Repository repository = new Repository();

            while (r != 0) {
                System.out.println("""
                        1:sign up
                        2:edit
                        3:exit""");
                int a = sc.nextInt();
                switch (a) {
                    case 1: {
                        System.out.println("id = " + id);
                        System.out.println("enter user name");
                        String username = sc.next();
                        System.out.println("enter pass");
                        String pass = sc.next();
                        System.out.println("enter email");
                        String email = sc.next();
                        System.out.println("enter age");
                        int age = sc.nextInt();
                        System.out.println("enter education");
                        String edu = sc.next();
                        Entity signup = new Entity(id,age,username, pass, email,edu);
                        try {
                            repository.addUser(signup);
                        } catch (Exception e) {
                            System.out.println("Error signing up");
                        }
                        break;
                    }
                    case 2: {
                        System.out.println("username : ");
                        String userName = sc.next();

                        Entity entity = new Entity();
                        entity.setUserName(userName);
                        if (!userName.equals("")) {
                            if (repository.userNameExistence(entity)) {
                                int idE = repository.getId(userName);
                                System.out.println("id = " + idE);
                                System.out.println("enter user name");
                                String username = sc.next();
                                System.out.println("enter pass");
                                String pass = sc.next();
                                System.out.println("enter email");
                                String email = sc.next();
                                System.out.println("enter age");
                                int age = sc.nextInt();
                                System.out.println("enter education");
                                String edu = sc.next();
                                Entity edit = new Entity(id,age,username, pass, email,edu);
                                repository.editUser(idE,edit);
                            } else {
                                System.out.println("Wrong userID");
                            }
                        } else {
                            System.out.println("Please Provide a userID");
                        }
                        break;
                    }
                    case 3:
                        r = 0;
                        break;
                }
            }
        }
    }
