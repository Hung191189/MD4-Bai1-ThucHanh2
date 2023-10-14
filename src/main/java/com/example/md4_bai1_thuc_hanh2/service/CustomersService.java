package com.example.md4_bai1_thuc_hanh2.service;

import com.example.md4_bai1_thuc_hanh2.model.Customers;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomersService {
    protected Connection getConnection() {
        Connection connection = null;
        try {
            java.lang.Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/customers?useSSL=false", "root", "123456");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
    public void create(Customers customers){
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("insert into customers (name, email, address) values (?, ?, ?)")){
            preparedStatement.setString(1, customers.getName());
            preparedStatement.setString(2, customers.getEmail());
            preparedStatement.setString(3, customers.getAddress());
            preparedStatement.executeUpdate();
            System.out.println(preparedStatement);
        } catch (SQLException e) {
        }
    }
    public List<Customers> displayAll() {
        List<Customers> customersList = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("select * from customers")){
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("idCustomers");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String address = rs.getString("address");
                customersList.add(new Customers(id, name, email, address));
            }
        } catch (SQLException e) {
        }
        return customersList;
    }
}
