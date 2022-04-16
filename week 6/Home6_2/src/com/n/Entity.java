package com.n;

public class Entity {
    private String name;
    private String code;
    private String fatherName;
    private String role;
    private String income;
    private String history;

    public Entity() {
    }

    public Entity(String name, String code, String fatherName, String role, String income, String history) {
        this.name = name;
        this.code = code;
        this.fatherName = fatherName;
        this.role = role;
        this.income = income;
        this.history = history;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }
}
