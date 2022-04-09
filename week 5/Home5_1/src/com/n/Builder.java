package com.n;

public class Builder {
    private String userName ;
    private String name;
    private String pass;
    private int Age;
    private  String address;
    private String phone;
    private String education;

    public Builder(String userName, String name, String pass, int age, String address, String phone, String education) {
        this.userName = userName;
        this.name = name;
        this.pass = pass;
        this.Age = age;
        this.address = address;
        this.phone = phone;
        this.education = education;
    }

    public Builder() {
    }

    public String getUserName() {
        return userName;
    }

    public Builder setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getName() {
        return name;
    }

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public String getPass() {
        return pass;
    }

    public Builder setPass(String pass) {
        this.pass = pass;
        return this;
    }

    public int getAge() {
        return Age;
    }

    public Builder setAge(int age) {
        Age = age;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Builder setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Builder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getEducation() {
        return education;
    }

    public Builder setEducation(String education) {
        this.education = education;
        return this;
    }
}
