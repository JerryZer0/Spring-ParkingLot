package com.oocl.SpringParkingLot.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingBoy {
    private int id;
    private String name;
    private List<ParkingLot> parkingLotList= new ArrayList<>();
    private List<Order> OrderList = new ArrayList<>();

    public ParkingBoy() {
    }

    public ParkingBoy(int id, String name) {
        this.id = id;
        this.name = name;
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

    public List<ParkingLot> getParkingLotList() {
        return parkingLotList;
    }

    public void setParkingLotList(List<ParkingLot> parkingLotList) {
        this.parkingLotList = parkingLotList;
    }

    public void addParkingLot(ParkingLot parkingLot){
        parkingLotList.add(parkingLot);
    }

    public List<Order> getOrderList() {
        return OrderList;
    }

    public void setOrderList(List<Order> orderList) {
        OrderList = orderList;
    }

    public void addOrder(Order order){
        OrderList.add(order);
    }
}
