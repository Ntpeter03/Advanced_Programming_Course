package com.n;

public class Student {
    private String name;
    private String family;
    private String userName;
    private String pass;
    private String job;
    private int age;

    public Student(String name, String family, String userName, String pass, String job, int age) {
        this.name = name;
        this.family = family;
        this.userName = userName;
        this.pass = pass;
        this.job = job;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
