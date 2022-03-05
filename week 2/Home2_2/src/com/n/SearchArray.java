package com.n;

public class SearchArray {
    public void find(String a,String[][] b){
        for (int i = 1;i<=7;i++){
            if (a.equals(b[i][0])){
                System.out.println("class Prerequisites: ");
                System.out.println(b[i][1]);
                System.out.println("class credit: ");
                System.out.println(b[i][2]);
                break;
            }//if
        }//for
    }//find
}//class
