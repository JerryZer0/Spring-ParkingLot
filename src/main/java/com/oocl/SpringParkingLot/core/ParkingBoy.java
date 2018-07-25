package com.oocl.SpringParkingLot.core;

import java.util.ArrayList;
import java.util.List;

public class ParkingBoy {
    private String id;
    private String name;
    private List<ParkingLot> parkingLotList= new ArrayList<>();

    public ParkingBoy() {
    }

    public ParkingBoy(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ParkingLot> getParkingLotList() {
        return parkingLotList;
    }

    public void setParkingLotList(List<ParkingLot> parkingLotList) {
        this.parkingLotList = parkingLotList;
    }

    public void addParkingLot(ParkingLot parkingLot){
        parkingLotList.add(parkingLot);
    }
}
