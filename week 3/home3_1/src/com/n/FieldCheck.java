package com.n;

public class FieldCheck {
    public String[] string = new String[3];

    public void fieldCh(String s1, String s2, String s3) throws FieldError {
        string = new String[]{"navidtandas"/*name*/, "adprnavid"/*username*/, "navid123"/*password*/};
        if (!string[0].equals(s1)) {
            throw new FieldError("Name doesn't match");
        }

        if (!string[1].equals(s2)) {
            throw new FieldError("UserName doesn't match");

        }
        if (!string[2].equals(s3)) {
            throw new FieldError("password doesn't match");

        }


    }
}
