package com.oocl.SpringParkingLot.shell.controller;

import com.oocl.SpringParkingLot.core.Car;
import com.oocl.SpringParkingLot.core.Receipt;
import com.oocl.SpringParkingLot.shell.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParkingController {

    @Autowired
    private ParkingService service;

    @PostMapping("receipts")
    public Receipt parkCar(@RequestBody Car car){
        Receipt receipt = service.parkCar(car);
        return receipt;
    }
}
