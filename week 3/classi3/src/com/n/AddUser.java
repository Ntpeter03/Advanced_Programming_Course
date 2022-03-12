package com.n;

import java.util.Scanner;

public class AddUser {

    public void addUser () throws UserException{
    String[][] string = new String[2][3];
    string[0][0] = "navid";
    string[0][1] = "navid tandas";
    string[0][2] = "18";
    Scanner sc = new Scanner(System.in);
    System.out.println("please provide new users information");
    System.out.println("userID: ");
    string[1][0] = sc.nextLine();
    System.out.println("FullName: ");
    string[1][1] = sc.nextLine();
    System.out.println("age: ");
    string[1][2] = sc.nextLine();
    if (string[0][0].equals(string[1][0])){
        throw  new UserException("UserID is already used");
    }
    else{
        System.out.println("new user added");
    }


}
}
