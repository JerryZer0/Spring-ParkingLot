package com.oocl.SpringParkingLot.core;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class Receipt {
    private String receiptID;
    private static final int LENGTH = 16;

    public Receipt(){
        generateReceiptId();
    }

    private void generateReceiptId(){
        String base = "QWERTYUIOPLKJHGFDSAZXCVBNM0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < LENGTH; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        this.receiptID = sb.toString();
    }

    public Receipt(String receiptID){
        this.receiptID = receiptID;
    }

    public String getReceiptID() {
        return receiptID;
    }

    public void setReceiptID(String receiptID) {
        this.receiptID = receiptID;
    }
}
