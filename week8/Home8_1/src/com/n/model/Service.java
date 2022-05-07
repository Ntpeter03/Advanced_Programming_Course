package com.n.model;

import java.sql.SQLException;

public class Service {
    //singleton class
    private static final Service service = new Service();
    public static Service getInstance(){return service;}
    private Service(){}
    public void add(Entity e) throws SQLException {
        Repository repository = new Repository();
        repository.addRepo(e);
    }
}
