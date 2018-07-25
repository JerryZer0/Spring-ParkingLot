package com.oocl.SpringParkingLot.shell.service;

import com.oocl.SpringParkingLot.core.Car;
import com.oocl.SpringParkingLot.core.Order;
import com.oocl.SpringParkingLot.core.Receipt;
import com.oocl.SpringParkingLot.database.CarRepository;
import org.springframework.stereotype.Service;

@Service
public class ParkingService {

    private CarRepository repository = new CarRepository();


    public Receipt parkCar(Car car) {

        Receipt receipt = new Receipt("6WBW2VEPDXDZI36L");
        //Receipt receipt = new Receipt();
        Order order = new Order(receipt);
        repository.add(order,car);
        return receipt;
    }
}
