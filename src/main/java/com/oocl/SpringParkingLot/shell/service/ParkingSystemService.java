package com.oocl.SpringParkingLot.shell.service;

import com.oocl.SpringParkingLot.core.ParkingBoy;
import com.oocl.SpringParkingLot.core.ParkingLot;
import com.oocl.SpringParkingLot.database.ParkingBoyRepository;
import com.oocl.SpringParkingLot.database.ParkingLotRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ParkingSystemService {
    private ParkingBoyRepository parkingBoyRepository = new ParkingBoyRepository();
    private ParkingLotRepository parkingLotRepository = new ParkingLotRepository();

    public List<ParkingBoy> showParkingBoys() {
        List<ParkingBoy> parkingBoyList = parkingBoyRepository.getParkingBoys();
        return parkingBoyList;
    }

    public ParkingBoy addParkingBoy(ParkingBoy parkingBoy) {
        int size = parkingBoyRepository.getCounts();
        parkingBoy.setId("D"+size);
        parkingBoyRepository.add(parkingBoy);
        return parkingBoy;
    }

    public ParkingLot addParkingLot(ParkingLot parkingLot) {
        int size = parkingLotRepository.getCounts();
        parkingLot.setId("L"+size);
        parkingLotRepository.add(parkingLot);
        return parkingLot;
    }

    public List<ParkingLot> showParkingLots() {
        List<ParkingLot> parkingLotList = parkingLotRepository.getParkingLots();
        return parkingLotList;
    }

//    public ParkingBoy addParkingBoyParkingLot(ParkingLot parkingLot) {
//
//    }

    public ParkingBoy findById(String id) {
        List<ParkingBoy> parkingBoyList = parkingBoyRepository.getParkingBoys();
        ParkingBoy parkingBoy = new ParkingBoy();
        for (ParkingBoy boy :
                parkingBoyList) {
            if(boy.getId().equals(id)){
                parkingBoy = boy;
                break;
            }

        }
        return parkingBoy;
    }
}
