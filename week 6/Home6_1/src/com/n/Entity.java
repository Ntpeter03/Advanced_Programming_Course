package com.n;

public class Entity {
    private int id;
    private int age;
    private String userName;
    private String password;
    private String email;
    private String education;

    public Entity() {
    }

    public Entity(int id, int age, String userName, String password, String email, String education) {
        this.id = id;
        this.age = age;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.education = education;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}
