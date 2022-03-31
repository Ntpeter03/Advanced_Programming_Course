package com.n;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("please provide your name");
        String name = sc.nextLine();
        System.out.println("please provide your student number");
        String sNum = String.valueOf(sc.nextInt());
        System.out.println("please provide your score");
        String score = String.valueOf(sc.nextInt());
        map.put("name",name);
        map.put("sNum",sNum);
        map.put("score",score);
        for(String s: map.keySet()){
            String mapName = s.toString();
            String mapValue = map.get(mapName);
            System.out.println("mapName: "+mapName+" & value: "+mapValue);
        }
    }
}
