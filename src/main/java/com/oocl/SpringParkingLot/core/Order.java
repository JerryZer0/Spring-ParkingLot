package com.oocl.SpringParkingLot.core;

import java.util.Map;

public class Order {
    private String id;
    private boolean status;
    //private Receipt receipt;
//    private Map

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Order(){
        this.id = "23333";
        this.status = true;
        //this.receipt = receipt;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
