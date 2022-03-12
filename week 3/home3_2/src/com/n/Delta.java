package com.n;

public class Delta {

    public int deltaCal(int a, int b,int c) throws DeltaError {
        int delta = b*b - 4*(a * c);
        if (delta<0){
            throw new DeltaError("delta is a negative number");
        }
       return delta ;
    }
}
