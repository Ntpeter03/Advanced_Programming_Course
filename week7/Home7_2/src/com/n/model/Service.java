package com.n.model;

import java.sql.SQLException;

public class Service {
    //singleton class
    private static final Service service = new Service();
    public static Service getInstance() {return service;}
    private Service(){}

    public void update(Entity e, String car, int price) throws SQLException {
        Repository repository = new Repository();
        Entity n = new Entity();
        n.setName(e.getName());
        int cash = e.getCash();
        if(cash - price >=0) {
            n.setCash(cash - price);
            repository.updateRepo(n,car);
        }
        else{
            System.out.println("not enough cash");
        }
    }
}
