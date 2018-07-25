package com.oocl.SpringParkingLot.shell.service;

import com.oocl.SpringParkingLot.core.Car;
import com.oocl.SpringParkingLot.core.Order;
import com.oocl.SpringParkingLot.core.ParkingBoy;
import com.oocl.SpringParkingLot.core.Receipt;
import com.oocl.SpringParkingLot.database.CarRepository;
import com.oocl.SpringParkingLot.database.ParkingBoyRepository;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ParkingService {

    private CarRepository repository = new CarRepository();
    private ParkingBoyRepository parkingBoyRepository = new ParkingBoyRepository();
    private ParkingBoy parkingBoy = new ParkingBoy();


    public Receipt parkCar(Car car) {

        Receipt receipt = new Receipt("6WBW2VEPDXDZI36L");
        //Receipt receipt = new Receipt();
        Order order = new Order();
        repository.addReceipt(receipt,order);
        repository.addOrder(order, car);
        return receipt;
    }

    public void getCarIn(Order order,ParkingBoy parkingBoy){
        parkingBoy.addOrder(order);
    }

    public void catchOrder(int id, Order order) {
        ParkingBoy parkingBoy = parkingBoyRepository.findById(id);
        parkingBoy.addOrder(order);
        //System.out.println(parkingBoy.getOrderList().get(0));
    }

//    public Car getOutCar(Receipt receipt) {
//        Order order = new Order(receipt);
//
//    }
}
