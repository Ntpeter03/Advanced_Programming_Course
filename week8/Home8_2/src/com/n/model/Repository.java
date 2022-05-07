package com.n.model;


import java.sql.*;
import java.util.Objects;

public class Repository implements AutoCloseable {
    private final Connection connection ;
    private PreparedStatement preparedStatement;

    public Repository() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306","a","a33443");
        connection.setAutoCommit(false);
    }
    public boolean userNameExistenceRepo(Entity e) throws SQLException {
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

    @Override
    public void close() throws Exception {
        connection.close();
    }

    public void editRepo(Entity editA) throws SQLException {
        try {
            preparedStatement = connection.prepareStatement("UPDATE classi.users SET name = ? , password = ? , email = ?  WHERE user_name = ?;");
            preparedStatement.setString(1, editA.getName());
            preparedStatement.setString(2, editA.getPassword());
            preparedStatement.setString(3, editA.getEmail());
            preparedStatement.setString(4,editA.getUserName());
            preparedStatement.executeUpdate();
            connection.commit();

        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }


    }
}
