package com.oocl.SpringParkingLot.core;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private int id;
    private String name;
    private int size;
    //private String parkingBoyId;

    private List<Car> carList = new ArrayList<>();

    public ParkingLot() {
    }

    public ParkingLot(int id, String name, int size) {
        this.id = id;
        this.name = name;
        this.size = size;
        //this.parkingBoyId = parkingBoyId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

//    public String getParkingBoyId() {
//        return parkingBoyId;
//    }
//
//    public void setParkingBoyId(String parkingBoyId) {
//        this.parkingBoyId = parkingBoyId;
//    }
}
