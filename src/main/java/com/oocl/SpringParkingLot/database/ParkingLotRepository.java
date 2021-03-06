package com.oocl.SpringParkingLot.database;

import com.oocl.SpringParkingLot.core.ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotRepository {
    private List<ParkingLot> parkingLots = new ArrayList<>();

    ParkingLot parkingLot = new ParkingLot(1, "停车场第一个", 2);

    public ParkingLotRepository(){
        parkingLots.add(parkingLot);
    }

    public List<ParkingLot> getParkingLots() {
        return parkingLots;
    }

    public void setParkingLots(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public void add(ParkingLot parkingLot){
        parkingLots.add(parkingLot);
    }

    public void update(ParkingLot parkingLot,int lotId){
        for (ParkingLot lot1 : parkingLots) {
            if(lot1.getId()==lotId){
                parkingLots.remove(lot1);
                parkingLots.add(parkingLot);
                break;
            }
        }
    }

    public void delete(ParkingLot parkingLot){
        parkingLots.remove(parkingLot);
    }

    public int getCounts(){
        return parkingLots.size();
    }

    public ParkingLot findById(int id) {
        ParkingLot parkingLot = new ParkingLot();
        for (ParkingLot lot : parkingLots) {
            if (lot.getId() == id) {
                parkingLot = lot;
                break;
            }
        }
        return parkingLot;
    }
}
