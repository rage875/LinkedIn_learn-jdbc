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

            // Create a new Customer
            Customer customer = new Customer();
            customer.setFirstName("John");
            customer.setLastName("Adams");
            customer.setEmail("jadams.wh.gov");
            customer.setAddress("1234 Main St");
            customer.setCity("Arlington");
            customer.setState("VA");
            customer.setPhone("(555) 555-9845");
            customer.setZipcode("01234");

            Customer dbCustomer = customerDao.create(customer);
            System.out.println(dbCustomer);

            // Read the created Customer
            dbCustomer = customerDao.findById(dbCustomer.getId());

            // Update the created Customer
            dbCustomer.setEmail("john.adams@wh.gov");
            dbCustomer = customerDao.update(dbCustomer);
            System.out.println(dbCustomer);

            // Delete the created Customer
            customerDao.delete(dbCustomer.getId());

        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
