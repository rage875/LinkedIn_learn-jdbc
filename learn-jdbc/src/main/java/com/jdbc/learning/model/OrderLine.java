package com.jdbc.learning.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderLine {
    private int quantity;
    private String productCode;
    private String productName;
    private int productSize;
    private String productVariety;
    private BigDecimal productPrice;

    @Override
    public String toString() {
        return "OrderLine{" +
            "quantity=" + quantity +
            ", productCode='" + productCode + '\'' +
            ", productName='" + productName + '\'' +
            ", productSize=" + productSize +
            ", productVariety='" + productVariety + '\'' +
            ", productPrice=" + productPrice +
            '}';
    }
}
