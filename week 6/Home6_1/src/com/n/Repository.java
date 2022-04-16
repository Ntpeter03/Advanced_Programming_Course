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
            preparedStatement = connection.prepareStatement("INSERT INTO classi.users (account_id, age, user_name, password, email, education) values(?,?,?,?,?,?);");
            preparedStatement.setInt(1, e.getId());
            preparedStatement.setInt(2, e.getAge());
            preparedStatement.setString(3, e.getUserName());
            preparedStatement.setString(4, e.getPassword());
            preparedStatement.setString(5, e.getEmail());
            preparedStatement.setString(6, e.getEducation());
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
    public int getId(String username) throws SQLException {
        preparedStatement = connection.prepareStatement("SELECT account_id FROM classi.users where user_name= ?;");
        preparedStatement.setString(1, username);
        ResultSet rs = preparedStatement.executeQuery();
        int account_id = 0;
        while (rs.next()){
            account_id = rs.getInt(1);
        }
        return account_id;
    }
    public void editUser(int id, Entity edit) throws SQLException {
        try {
            preparedStatement = connection.prepareStatement("UPDATE classi.users SET User_name = ? , email = ? , password = ? , age = ? \n" +
                    " , education = ?  WHERE account_id = ?;");
            preparedStatement.setString(1, edit.getUserName());
            preparedStatement.setString(2, edit.getEmail());
            preparedStatement.setString(3, edit.getPassword());
            preparedStatement.setInt(4, edit.getAge());
            preparedStatement.setString(5, edit.getEducation());
            preparedStatement.setInt(6, id);
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
