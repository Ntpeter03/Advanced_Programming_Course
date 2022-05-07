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

    public void edit(Entity entity) throws SQLException {
        Repository repository = new Repository();
        repository.editRepo(entity);
    }
}
