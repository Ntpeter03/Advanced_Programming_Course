package com.n;

import java.sql.*;

public class Repository {
    private final Connection connection ;
    private PreparedStatement preparedStatement;

    public Repository() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3000","a2","a2345");
        connection.setAutoCommit(false);
    }
    public void addUser(Entity e) throws SQLException {
        try {
            preparedStatement = connection.prepareStatement("INSERT INTO classi.student (code, name, year, score) values(?,?,?,?);");
            preparedStatement.setString(1, e.getCode());
            preparedStatement.setString(2, e.getName());
            preparedStatement.setString(3, e.getYear());
            preparedStatement.setString(4, e.getScore());
            preparedStatement.executeUpdate();
            connection.commit();

        } catch (SQLException ex) {
            System.out.println("Error");
            ex.printStackTrace();
            throw ex;
        }
    }


    public void delete(int customerID) throws SQLException {
        preparedStatement = connection.prepareStatement("DELETE FROM classi.student WHERE id = ?;");
        preparedStatement.setInt(1, customerID);
        preparedStatement.executeUpdate();
        connection.commit();
    }

    public void editUser(int id, Entity edit) throws SQLException {
        try {
            preparedStatement = connection.prepareStatement("UPDATE classi.student SET code = ? , name = ? , year = ? , score = ? " +
                    "WHERE id = ?");
            preparedStatement.setString(1, edit.getCode());
            preparedStatement.setString(2, edit.getName());
            preparedStatement.setString(3, edit.getYear());
            preparedStatement.setString(4, edit.getCode());
            preparedStatement.setInt(5, id);
            preparedStatement.executeUpdate();
            connection.commit();

        } catch (SQLException e) {
            System.out.println("Error");
            System.out.println(e);
            e.printStackTrace();
            throw e;
        }


    }
}
