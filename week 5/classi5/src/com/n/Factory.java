package com.n;

public class Factory {
    public static Calculator calculate(String s){
        return switch (s) {
            case "+" -> new CalcPlus();
            case "-" -> new CalcMinus();
            default -> null;
        };
    }
}
