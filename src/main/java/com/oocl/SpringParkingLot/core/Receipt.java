package com.oocl.SpringParkingLot.core;

public class Receipt {
    private String receiptID;

    Receipt(){}

    Receipt(String receiptID){
        this.receiptID = receiptID;
    }

    public String getReceiptID() {
        return receiptID;
    }

    public void setReceiptID(String receiptID) {
        this.receiptID = receiptID;
    }
}
