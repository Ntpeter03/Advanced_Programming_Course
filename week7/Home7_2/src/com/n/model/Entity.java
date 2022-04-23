package com.n.model;


public class Entity {
    private String name;
    private int cash;

    public Entity() {
        this.name = "";
        this.cash = 0;
    }

    public Entity(String name, String family, int cash) {
        this.name = name;
        this.cash = cash;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }
}