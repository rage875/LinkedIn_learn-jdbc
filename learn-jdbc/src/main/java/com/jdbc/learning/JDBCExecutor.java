package com.jdbc.learning;

import com.jdbc.learning.dao.CustomerDao;
import com.jdbc.learning.dao.OrderDAO;
import com.jdbc.learning.model.Customer;
import com.jdbc.learning.model.Order;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class JDBCExecutor {

    public static void main(String... args){
        DatabaseConnectionManager dcm = new DatabaseConnectionManager("localhost",
            "hplussport", "postgres", "password");

        try {
            // Connection to database connection manager
            Connection connection = dcm.getConnection();

            // Create DAO for the Customer
            CustomerDao customerDAO = new CustomerDao(connection);

            // Get paged
            System.out.println("Paged");
            for(int i=1;i<3;i++){
                System.out.println("Page number: " + i);
                customerDAO.findAllPaged(10, i).forEach(System.out::println);
            }

        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
