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
    private ParkingBoyRepository parkingBoyRepository;
    private ParkingLotRepository parkingLotRepository;

    private List<ParkingBoy> parkingBoyList = new ArrayList<>();

    public ParkingSystemService() {

        ParkingBoyRepository parkingBoyRepository = new ParkingBoyRepository();
        ParkingLot parkingLot = new ParkingLot("D1","停车小弟第一个",2,"1");
        ParkingBoy parkingBoy = new ParkingBoy("1","停车场jj");
        parkingBoy.addParkingLot(parkingLot);
        parkingBoyList.add(parkingBoy);

    }

    public List<ParkingBoy> showParkingBoys() {
        //List<ParkingBoy> parkingBoys = parking
        return parkingBoyList;
    }
}
