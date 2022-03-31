package com.n;

public class Main {

    public static void main(String[] args) {
        User user = new User();
        user.name = "na";
        user.family = "fa";
        user.userName = "nafa";
        user.pass = "nafapass";
        user.age = 18;
        try {
            User clone1 = user.clone();
            System.out.println("clone1 is a success");
        } catch (CloneNotSupportedException e) {
            System.out.println("clone1 failed");
            e.printStackTrace();
        }
        try {
            User clone2 = user.clone();
            System.out.println("clone2 is a success");
        } catch (CloneNotSupportedException e) {
            System.out.println("clone2 failed");
            e.printStackTrace();
        }try {
            User clone3 = user.clone();
            System.out.println("clone3 is a success");
        } catch (CloneNotSupportedException e) {
            System.out.println("clone3 failed");
            e.printStackTrace();
        }
    }
}

