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

            // Create Customer info
            Customer customer = new Customer();
            customer.setFirstName("First name dummy");
            customer.setLastName("Last name dummy");
            customer.setEmail("email@dummy.com");
            customer.setPhone("(111) 111-6543");
            customer.setAddress("Address dummy");
            customer.setCity("City dummy");
            customer.setState("State dummy");
            customer.setZipcode("11111");

            // Call insert to database
            customerDao.create(customer);
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
