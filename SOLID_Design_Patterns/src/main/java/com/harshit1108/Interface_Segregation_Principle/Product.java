package com.harshit1108.Interface_Segregation_Principle;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Product extends Entity {

    private LocalDateTime productPlacedOn;

    private BigDecimal totalPrice;

    public Product(LocalDateTime productPlacedOn, BigDecimal totalPrice) {
        this.productPlacedOn = productPlacedOn;
        this.totalPrice = totalPrice;
    }

    public LocalDateTime getProductPlacedOn() {
        return productPlacedOn;
    }

    public void setProductPlacedOn(LocalDateTime productPlacedOn) {
        this.productPlacedOn = productPlacedOn;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productPlacedOn=" + productPlacedOn +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
