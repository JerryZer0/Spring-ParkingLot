package com.oocl.SpringParkingLot.shell.controller;

import com.oocl.SpringParkingLot.core.ParkingBoy;
import com.oocl.SpringParkingLot.core.ParkingLot;
import com.oocl.SpringParkingLot.shell.service.ParkingManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ParkingManageController {

    @Autowired
    private ParkingManageService service;

    @GetMapping("parkingBoys")
    public List<ParkingBoy> showParkingBoys(ParkingBoy parkingBoy){
        List<ParkingBoy> parkingBoyList = service.showParkingBoys();
        return parkingBoyList;
    }

    @GetMapping("parkingLots")
    public List<ParkingLot> showParkingLots(ParkingLot parkingLot){
        List<ParkingLot> parkingLotList = service.showParkingLots();
        return parkingLotList;
    }

    @PostMapping("parkingBoys")
    public ParkingBoy addParkingBoy(@RequestBody ParkingBoy parkingBoy){
        ParkingBoy boy = service.addParkingBoy(parkingBoy);
        return boy;
    }

    @PostMapping("parkingLots")
    public ParkingLot addParkingLot(@RequestBody ParkingLot parkingLot){
        ParkingLot lot = service.addParkingLot(parkingLot);
        return lot;
    }

    @PostMapping("parkingBoys/{id}/parkingLots")
    public ParkingBoy addParkingBoyParkingLot(@PathVariable int id, @RequestBody ParkingLot parkingLot){
        ParkingBoy boy = service.findById(id);
        boy.addParkingLot(parkingLot);
        return boy;
    }

    @DeleteMapping("parkingBoys/{id}")
    public void deleteParkingBoy(@PathVariable int id){
        service.deleteParkingBoy(id);
    }

    @DeleteMapping("parkingLots/{id}")
    public void deleteParkingLot(@PathVariable int id){
        service.deleteParkingLot(id);
    }
}
