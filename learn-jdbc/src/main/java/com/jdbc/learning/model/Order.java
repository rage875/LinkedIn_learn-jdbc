package com.jdbc.learning.model;

import com.jdbc.learning.util.DataTransferObject;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class Order implements DataTransferObject {
    private long id;
    private String customerFirstName;
    private String customerLastLane;
    private String customerEmail;
    private Date creationDate;
    private BigDecimal totalDue;
    private String status;
    private String salespersonFirstName;
    private String salespersonLastName;
    private String salespersonEmail;
    private List<OrderLine> orderLines;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Order{" +
            "id=" + id +
            ", customerFirstName='" + customerFirstName + '\'' +
            ", customerLastLane='" + customerLastLane + '\'' +
            ", customerEmail='" + customerEmail + '\'' +
            ", creationDate=" + creationDate +
            ", totalDue=" + totalDue +
            ", status='" + status + '\'' +
            ", salespersonFirstName='" + salespersonFirstName + '\'' +
            ", salespersonLastName='" + salespersonLastName + '\'' +
            ", salespersonEmail='" + salespersonEmail + '\'' +
            ", orderLines=" + orderLines +
            '}';
    }
}
