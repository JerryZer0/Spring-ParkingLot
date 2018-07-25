package com.oocl.SpringParkingLot.core;

public class Car {
    private String plateNumber;

    Car(){}

    Car(String plateNumber){
        this.plateNumber = plateNumber;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }
}
