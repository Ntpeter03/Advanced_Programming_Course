package com.n;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AddUser addUser = new AddUser();
        try{
            addUser.addUser();
        } catch (UserException e) {
            System.out.println(e);
        }


    }
}
