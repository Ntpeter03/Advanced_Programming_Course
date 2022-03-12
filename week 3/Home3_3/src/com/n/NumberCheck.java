package com.n;

public class NumberCheck {
    public void NumberChecking(String[] str) throws NumberError {
        for (int i = 0;i<10;i++){

            if (parseIntMethod(str,i)){
                throw new NumberError("This string contains an integer.");
            }

        }
    }


    public static boolean parseIntMethod(String[] str, int i) {

        try {
            int temp = Integer.parseInt(str[i]);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}