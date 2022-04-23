package com.n.model;


public class Entity {
    private String userName;
    private String password;
    private int cash;
    private int net;
    public Entity() {
        this.userName = "";
        this.password = "";
        this.cash = 0;
        this.net = 0;
    }

    public Entity (String userName, String password, int cash, int net) {
        this.userName = userName;
        this.password = password;
        this.cash = cash;
        this.net = net;
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

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int getNet() {
        return net;
    }

    public void setNet(int net) {
        this.net = net;
    }
}