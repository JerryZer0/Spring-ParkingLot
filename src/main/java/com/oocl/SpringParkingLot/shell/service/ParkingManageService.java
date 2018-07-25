package com.oocl.SpringParkingLot.shell.service;

import com.oocl.SpringParkingLot.core.*;
import com.oocl.SpringParkingLot.database.CarRepository;
import com.oocl.SpringParkingLot.database.ParkingBoyRepository;
import com.oocl.SpringParkingLot.database.ParkingLotRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ParkingManageService {
    private ParkingBoyRepository parkingBoyRepository = new ParkingBoyRepository();
    private ParkingLotRepository parkingLotRepository = new ParkingLotRepository();

    public List<ParkingBoy> showParkingBoys() {
        List<ParkingBoy> parkingBoyList = parkingBoyRepository.getParkingBoys();
        return parkingBoyList;
    }

    public ParkingBoy addParkingBoy(ParkingBoy parkingBoy) {
        parkingBoyRepository.add(parkingBoy);
        int size = parkingBoyRepository.getCounts();
        parkingBoy.setId(size);
        return parkingBoy;
    }

    public ParkingLot addParkingLot(ParkingLot parkingLot) {
        parkingLotRepository.add(parkingLot);
        int size = parkingLotRepository.getCounts();
        parkingLot.setId(size);
        return parkingLot;
    }

    public List<ParkingLot> showParkingLots() {
        List<ParkingLot> parkingLotList = parkingLotRepository.getParkingLots();
        return parkingLotList;
    }

//    public ParkingBoy addParkingBoyParkingLot(ParkingLot parkingLot) {
//
//    }

    public ParkingBoy findById(int id) {
        List<ParkingBoy> parkingBoyList = parkingBoyRepository.getParkingBoys();
        ParkingBoy parkingBoy = new ParkingBoy();
        for (ParkingBoy boy :
                parkingBoyList) {
            if (boy.getId() == id) {
                parkingBoy = boy;
                break;
            }

        }
        return parkingBoy;
    }

    public void deleteParkingBoy(int id) {
        ParkingBoy parkingBoy = parkingBoyRepository.findById(id);
        parkingBoyRepository.delete(parkingBoy);
    }

    public void deleteParkingLot(int id) {
        ParkingLot parkingLot = parkingLotRepository.findById(id);
        parkingLotRepository.delete(parkingLot);
    }
}
