package com.n;

public class Class1 implements MyInteger{


    @Override
    public void isEven(int a) {
        if (a % 2 == 0)
            System.out.println("The Number is Even.");
    }

    @Override
    public void isOdd(int a) {
        if (a % 2 != 0)
            System.out.println("The Number is Odd");
    }

    @Override
    public void isPositive(int a) {
        if (a > 0)
            System.out.println("The Number is Positive");
    }

    @Override
    public void isNegative(int a) {
        if (a < 0 )
            System.out.println("The Number is Negative");
    }

    @Override
    public void isZero(int a) {
        if (a == 0)
            System.out.println("The Number is Zero");
    }
}
