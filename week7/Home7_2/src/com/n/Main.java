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
        Scanner sc = new Scanner(System.in);


        while (r != 0) {
            System.out.println("""
                    1:shop
                    2:Exit
                    """);
            int a = sc.nextInt();
            switch (a) {
                case 1 -> {
                    Entity entity = new Entity();
                    System.out.println("your name : ");
                    String name = sc.next();
                    entity.setName(name);

                    System.out.println("""
                            1: pride : 190mt
                            2: 131 : 200mt
                            """);
                    int b = Integer.parseInt(sc.next());
                    switch (b) {
                        case 1 -> {
                            System.out.println("payment : give me yore cash :");
                            entity.setCash(sc.nextInt());
                            Service.getInstance().update(entity, "Pride",190);
                        }
                        case 2 -> {
                            System.out.println("payment : give me yore cash :");
                            entity.setCash(sc.nextInt());
                            Service.getInstance().update(entity, "131",2001);
                        }
                    }
                }
                case 2 -> r = 0;
            }
        }
    }
}
