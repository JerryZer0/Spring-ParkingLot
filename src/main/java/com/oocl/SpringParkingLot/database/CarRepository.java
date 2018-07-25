package com.oocl.SpringParkingLot.database;

import com.oocl.SpringParkingLot.core.Car;
import com.oocl.SpringParkingLot.core.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarRepository {
    private Map<Order, Car> cars = new HashMap<>();

    public CarRepository() {
    }

    public void add(Order order,Car car){
        cars.put(order,car);
    }

//    public void update(Car car,String plateNumber){
//        for (Car c : cars) {
//            if(c.getPlateNumber().equals(plateNumber)){
//                cars.remove(c);
//                cars.add(car);
//                break;
//            }
//        }
//    }

    public void delete(Order order){
        cars.remove(order);
    }

    public Car checkCarIn(Order order){
        Car car = cars.get(order);
        return car;
    }
}
