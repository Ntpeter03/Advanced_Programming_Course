package com.navidtandas;

import java.util.Scanner;

public class Main {
    public static int a = 0;
    public static void main(String[] args) {

        while (a!=1){
            Scanner sc = new Scanner(System.in);
            Library library1 = new Library();
            int action;
            System.out.println();
            System.out.println("choose your action :");
            System.out.println("1:Package Arrival");
            System.out.println("2:Checkup");
            System.out.println("3:Borrowing");
            System.out.println("4:Returning");
            System.out.println("5:quite");
            System.out.println();
            action = sc.nextInt();
            switch (action){
                case 1:{
                    library1.packageArrival();
                    break;
                }
                case 2:{
                    library1.infoCheck();
                    break;
                }
                case 3:{
                    library1.borrowingBook();
                    break;
                }
                case 4:{
                    library1.returningBook();
                    break;
                }
                case 5: {
                a=1;
                break;
                }
                }
            }
        }
    }
 class Library {
     Scanner sc = new Scanner(System.in);
  public static int booksTotal ;
  public static int booksIn;
  public static int booksOut;
    public void packageArrival(){
        System.out.println("provide the number of books in package : ");
        booksTotal= booksTotal + sc.nextInt();
    }
     public void borrowingBook(){
         System.out.println("provide the number of borrowed books : ");
         int borrowed = sc.nextInt();
         booksOut+=borrowed;
         booksIn = booksTotal - booksOut;
     }
     public void returningBook(){
         System.out.println("provide the number of returned books : ");
         int returned = sc.nextInt();
         booksOut-=returned;
         booksIn = booksTotal - booksOut;
     }
     public void infoCheck(){
         System.out.println("total books : " + booksTotal);
         System.out.println("books in the library : "+booksIn);
         System.out.println("borrowed books : "+ booksOut);
         if (booksIn < 0 || booksOut <0 )
             System.out.println("WARNING the info seems to be wrong.");
     }
}