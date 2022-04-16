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
            preparedStatement = connection.prepareStatement("INSERT INTO classi.karmand (name, code, fathername, role, income, history) values(?,?,?,?,?,?);");
            preparedStatement.setString(1, e.getName());
            preparedStatement.setString(2, e.getCode());
            preparedStatement.setString(3, e.getFatherName());
            preparedStatement.setString(4, e.getRole());
            preparedStatement.setString(5, e.getIncome());
            preparedStatement.setString(6, e.getHistory());
            preparedStatement.executeUpdate();
            connection.commit();

        } catch (SQLException ex) {
            System.out.println("Error");
            ex.printStackTrace();
            throw ex;
        }
    }


        public void delete(int customerID) throws SQLException {
            preparedStatement = connection.prepareStatement("DELETE FROM classi.karmand WHERE id = ?;");
            preparedStatement.setInt(1, customerID);
            preparedStatement.executeUpdate();
            connection.commit();
        }

    }
