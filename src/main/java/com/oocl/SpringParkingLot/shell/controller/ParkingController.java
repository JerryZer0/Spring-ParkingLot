package com.oocl.SpringParkingLot.shell.controller;

import com.oocl.SpringParkingLot.core.Car;
import com.oocl.SpringParkingLot.core.Order;
import com.oocl.SpringParkingLot.core.ParkingBoy;
import com.oocl.SpringParkingLot.core.Receipt;
import com.oocl.SpringParkingLot.shell.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ParkingController {

    @Autowired
    private ParkingService service;

    @PostMapping("receipts")
    public Receipt parkCar(@RequestBody Car car){
        Receipt receipt = service.parkCar(car);
        return receipt;
    }

    @PutMapping("parkingBoys/{id}/orders")
    public void catchOrder(@PathVariable int id, @RequestBody Order order){
        service.catchOrder(id,order);
    }

    @PostMapping("cars")
    public Car getOutCar(@RequestBody Receipt receipt){
        Car car = service.getOutCar(receipt);
        System.out.println(car.getPlateNumber());
        return car;
    }
}
