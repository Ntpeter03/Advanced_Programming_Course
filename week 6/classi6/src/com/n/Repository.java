package com.n;

import java.sql.*;
import java.util.Objects;

public class Repository {
    private final Connection connection ;
    private PreparedStatement preparedStatement;

    public Repository() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306","admin","admin123");
        connection.setAutoCommit(false);
    }
    public void addUser(Entity e) throws SQLException {
        try {
            preparedStatement = connection.prepareStatement("INSERT INTO classi.users (name, user_name, password, email) values(?,?,?,?);");
            preparedStatement.setString(1, e.getName());
            preparedStatement.setString(2, e.getUserName());
            preparedStatement.setString(3, e.getPassword());
            preparedStatement.setString(4, e.getEmail());
            preparedStatement.executeUpdate();
            connection.commit();

        } catch (SQLException ex) {
            System.out.println("Error");
            ex.printStackTrace();
            throw ex;
        }
    }
    public boolean userNameExistence(Entity e) throws SQLException {
        preparedStatement = connection.prepareStatement("SELECT user_name FROM classi.users WHERE EXISTS \n" +
                "(SELECT user_name FROM classi.users WHERE user_name = ?) and user_name = ?;");
        preparedStatement.setString(1, e.getUserName());
        preparedStatement.setString(2, e.getUserName());
        ResultSet rs = preparedStatement.executeQuery();
        boolean result;
        result = rs.next();
        return result;
    }
    public boolean passwordCheck(Entity e) throws SQLException {
        preparedStatement = connection.prepareStatement("SELECT password FROM classi.users where user_name = ?;");
        preparedStatement.setString(1, e.getUserName());
        ResultSet rs = preparedStatement.executeQuery();
        boolean result;
        String  p=null;
        while (rs.next()){
            p = rs.getString(1);
        }
        result = Objects.equals(p, e.getPassword());
        return result;
    }
}
