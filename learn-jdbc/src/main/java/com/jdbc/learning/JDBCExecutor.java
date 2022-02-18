package com.jdbc.learning;

import com.jdbc.learning.dao.CustomerDao;
import com.jdbc.learning.model.Customer;

import java.sql.Connection;
import java.sql.SQLException;

public class JDBCExecutor {

    public static void main(String... args){
        DatabaseConnectionManager dcm = new DatabaseConnectionManager("localhost",
            "hplussport", "postgres", "password");

        try {
            // Connection to database connection manager
            Connection connection = dcm.getConnection();

            // Create DAO for the Customer
            CustomerDao customerDao =  new CustomerDao(connection);

            // Read Customer
            Customer customer = customerDao.findById(1000);
            System.out.println(customer.getFirstName() + " " + customer.getLastName());

        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
