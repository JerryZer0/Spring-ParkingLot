package com.oocl.SpringParkingLot.core;

public class Order {
    private boolean status;
    private Receipt receipt;

    public Order(Receipt receipt){
        this.status = true;
        this.receipt = receipt;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
