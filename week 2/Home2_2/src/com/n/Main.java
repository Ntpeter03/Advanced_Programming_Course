package com.n;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] className = {{"not found","",""}, {"math2", "Math1", "3"}, {"physics2", "Physics2, Math1", "3"}, {"differential", "Math1, *Discrete Mathematics*", "3"}, {"discretemathematics", "Math1", "3"}, {"advancedprogramming", "Basic Programming", "3"}, {"foreignlanguage", "none", "2"}, {"imam'swills", "none", "1"}};
        System.out.println("please Enter The Class Name : ");
        String name = sc.nextLine();
        SearchArray searchArray = new SearchArray();
        searchArray.find(name, className);


    }
}
