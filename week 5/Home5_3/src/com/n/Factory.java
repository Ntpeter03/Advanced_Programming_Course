package com.n;

public class Factory {
    public static Car getCar(int car){
        switch (car){
            case 1:
                return new Samand();

            case 2:
                return new Pride();

            default:
                return null;
        }

    }
}
