package com.oocl.SpringParkingLot.database;

import com.oocl.SpringParkingLot.core.ParkingBoy;
import com.oocl.SpringParkingLot.core.ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingBoyRepository {
    private List<ParkingBoy> parkingBoys = new ArrayList<>();

    ParkingBoy parkingBoy = new ParkingBoy(1, "停车小弟jj");
    ParkingLotRepository parkingLotRepository = new ParkingLotRepository();

    public ParkingBoyRepository() {
        parkingBoy.setParkingLotList(parkingLotRepository.getParkingLots());
        parkingBoys.add(parkingBoy);
    }

    public List<ParkingBoy> getParkingBoys() {
        return parkingBoys;
    }

    public void setParkingBoys(List<ParkingBoy> parkingBoys) {
        this.parkingBoys = parkingBoys;
    }

    public void add(ParkingBoy parkingBoy) {
        parkingBoys.add(parkingBoy);
    }

    public ParkingBoy findById(int id) {
        ParkingBoy parkingBoy = new ParkingBoy();
        for (ParkingBoy boy : parkingBoys) {
            if (boy.getId() == id) {
                parkingBoy = boy;
                break;
            }
        }
        return parkingBoy;
    }

    public void update(ParkingBoy parkingBoy, int boyId) {
        for (ParkingBoy boy : parkingBoys) {
            if (boy.getId() == boyId) {
                parkingBoys.remove(boy);
                parkingBoys.add(parkingBoy);
                break;
            }
        }
    }

    public void delete(ParkingBoy parkingBoy) {
        parkingBoys.remove(parkingBoy);
    }

    public int getCounts() {
        return parkingBoys.size();
    }
}
