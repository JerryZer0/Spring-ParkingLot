package com.oocl.SpringParkingLot.database;

import com.oocl.SpringParkingLot.core.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRepository {
    private List<Car> cars = new ArrayList<>();

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public void add(Car car){
        cars.add(car);
    }

    public void update(Car car,String plateNumber){
        for (Car c : cars) {
            if(c.getPlateNumber().equals(car.getPlateNumber())){
                cars.remove(c);
                cars.add(car);
                break;
            }
        }
    }

    public void delete(Car car){
        cars.remove(car);
    }
}
