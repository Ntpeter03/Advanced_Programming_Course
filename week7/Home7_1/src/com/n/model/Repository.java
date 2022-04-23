package com.n.model;


import java.sql.*;
import java.util.Objects;

public class Repository implements AutoCloseable {
    private final Connection connection ;
    private PreparedStatement preparedStatement;

    public Repository() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3011","a","a12345");
        connection.setAutoCommit(false);
    }
    public boolean userNameExistenceRepo(Entity e) throws SQLException {
        preparedStatement = connection.prepareStatement("SELECT username FROM classi.users WHERE EXISTS \n" +
                "(SELECT username FROM classi.users WHERE username = ?) and username = ?;");
        preparedStatement.setString(1, e.getUserName());
        preparedStatement.setString(2, e.getUserName());
        ResultSet rs = preparedStatement.executeQuery();
        boolean result;
        result = rs.next();
        return result;
    }
    public boolean passwordCheck(Entity e) throws SQLException {
        preparedStatement = connection.prepareStatement("SELECT password FROM classi.users where username = ?;");
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
    public void getInfoRepo(Entity e) throws SQLException {
        preparedStatement = connection.prepareStatement("SELECT * FROM classi.users where username = ?;");
        preparedStatement.setString(1, e.getUserName());
        e.setUserName(e.getUserName());
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()){
            e.setCash(rs.getInt(4));
            e.setNet(rs.getInt(5));
        }
    }
    public void updateRepo(Entity e) throws SQLException {

        preparedStatement = connection.prepareStatement("UPDATE `classi`.`users` SET `cash` = ?, `net` = ? WHERE (username = ?);");
        preparedStatement.setInt(1, e.getCash());
        preparedStatement.setInt(2, e.getNet());
        preparedStatement.setString(3, e.getUserName());
        preparedStatement.executeUpdate();
        connection.commit();
    }
    @Override
    public void close() throws Exception {
        connection.close();
    }
}
