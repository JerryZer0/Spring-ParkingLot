package com.oocl.SpringParkingLot.database;

import com.oocl.SpringParkingLot.core.ParkingBoy;

import java.util.ArrayList;
import java.util.List;

public class ParkingBoyRepository {
    private List<ParkingBoy> parkingLots = new ArrayList<>();

    public List<ParkingBoy> getParkingLots() {
        return parkingLots;
    }

    public void setParkingLots(List<ParkingBoy> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public void add(ParkingBoy parkingBoy){
        parkingLots.add(parkingBoy);
    }

    public void update(ParkingBoy parkingBoy,String boyId){
        for (ParkingBoy boy : parkingLots) {
            if(boy.getId().equals(boyId)){
                parkingLots.remove(boy);
                parkingLots.add(parkingBoy);
                break;
            }
        }
    }

    public void delete(ParkingBoy parkingBoy){
        parkingLots.remove(parkingBoy);
    }
}
