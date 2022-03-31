package com.n;

public class User <Name, Family, UserName, Pass, Age> implements Cloneable{
    public Name name ;
    public Family family;
    public  UserName userName;
    public Pass pass;
    public Age age;

    @Override
    public User clone() throws CloneNotSupportedException {
            return (User) super.clone();
        }
    }

