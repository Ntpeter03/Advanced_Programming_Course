package com.n.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Repository {
    private final Connection connection ;

    public Repository() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306","a","a33443");
        connection.setAutoCommit(false);
    }
    public void addRepo(Entity en) throws SQLException {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO classi.table (first_name, last_name, code, father_name, martial, spouse_name, field_study, university, address) values(?,?,?,?,?,?,?,?,?);");
            preparedStatement.setString(1, en.getFirstname());
            preparedStatement.setString(2, en.getLastname());
            preparedStatement.setString(3, en.getCode());
            preparedStatement.setString(4, en.getFatherName());
            preparedStatement.setString(5, en.getMartial());
            preparedStatement.setString(6, en.getSpouse());
            preparedStatement.setString(7, en.getFieldOfStudy());
            preparedStatement.setString(8, en.getUniversity());
            preparedStatement.setString(9, en.getAddress());

            preparedStatement.executeUpdate();
            connection.commit();

        } catch (SQLException e) {
            System.out.println("Error");
            e.printStackTrace();
            throw e;
        }

    }
}
