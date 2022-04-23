package com.n.model;


import java.sql.*;
import java.util.Objects;

public class Repository implements AutoCloseable {
    private final Connection connection ;

    public Repository() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3011","a","a12345");
        connection.setAutoCommit(false);
    }

    public void updateRepo(Entity e, String car) throws SQLException {

        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO `classi`.`orders` (`name`, `car`) VALUES (?, ?);");
        preparedStatement.setString(1, e.getName());
        preparedStatement.setString(2, car);
        preparedStatement.executeUpdate();
        connection.commit();
    }
    @Override
    public void close() throws Exception {
        connection.close();
    }
}
