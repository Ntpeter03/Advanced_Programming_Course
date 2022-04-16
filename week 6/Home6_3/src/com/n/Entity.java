package com.n;

public class Entity {
    private String code;
    private String name;
    private String year;
    private String score;

    public Entity() {
    }

    public Entity(String code, String name, String year, String score) {
        this.code = code;
        this.name = name;
        this.year = year;
        this.score = score;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
