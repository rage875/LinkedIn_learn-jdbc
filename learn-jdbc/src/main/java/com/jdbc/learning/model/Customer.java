package com.jdbc.learning.model;

import com.jdbc.learning.util.DataTransferObject;
import lombok.Data;

@Data
public class Customer implements DataTransferObject {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zipcode;
}

