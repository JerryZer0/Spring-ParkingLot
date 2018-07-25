package com.oocl.SpringParkingLot.shell.controller;

import com.oocl.SpringParkingLot.core.ParkingBoy;
import com.oocl.SpringParkingLot.shell.service.ParkingSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ParkingSystemController {

    @Autowired
    private ParkingSystemService service;

    @GetMapping("receipts")
    public List<ParkingBoy> showParkingBoys(ParkingBoy parkingBoy){
        List<ParkingBoy> parkingBoyList = service.showParkingBoys();
        return parkingBoyList;
    }


    @PostMapping("parkingBoys")
    public ParkingBoy addParkingBoy(@RequestBody ParkingBoy parkingBoy){
        ParkingBoy boy = service.addParkingBoy(parkingBoy);
        return boy;
    }
}
