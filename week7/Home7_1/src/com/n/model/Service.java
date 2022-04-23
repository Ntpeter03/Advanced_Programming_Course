package com.n.model;

import java.sql.SQLException;

public class Service {
    //singleton class
    private static final Service service = new Service();
    public static Service getInstance() {return service;}
    private Service(){}
    public boolean userNameExistence (Entity e) throws SQLException {
        Repository repository = new Repository();
        return repository.userNameExistenceRepo(e);
    }
    public boolean password (Entity e) throws SQLException {
        Repository repository = new Repository();
        return repository.passwordCheck(e);
    }
    public void getInfo (Entity e) throws SQLException {
        Repository repository = new Repository();
        repository.getInfoRepo(e);
    }
    public void update(Entity e, int net, int price) throws SQLException {
        Repository repository = new Repository();
        Entity n = new Entity();
        n.setUserName(e.getUserName());
        int cash = e.getCash();
        if(cash - price >=0) {
            n.setNet(e.getNet() + net);
            n.setCash(cash - price);
            repository.updateRepo(n);
        }
        else{
            System.out.println("not enough cash");
        }
    }
}
