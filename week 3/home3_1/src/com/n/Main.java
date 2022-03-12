package com.n;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // name: navidtandas
        // username: adprnavid
        // password: navid123
	FieldCheck fieldCheck = new FieldCheck();
    String s1, s2, s3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Login");
        System.out.println("please enter your full name(without spaces)");
        s1 = sc.nextLine().toLowerCase();
        System.out.println("please enter your UserName");
        s2 = sc.nextLine().toLowerCase();
        System.out.println("please enter your password");
        s3 = sc.nextLine().toLowerCase();
            try{
                fieldCheck.fieldCh(s1,s2,s3);
                System.out.println("you have successfully logged in");
          }
            catch (Exception e){
                System.out.println(e);
         }
    }
}
