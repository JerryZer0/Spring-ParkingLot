package com.oocl.SpringParkingLot.database;

import com.oocl.SpringParkingLot.core.Car;
import com.oocl.SpringParkingLot.core.Order;
import com.oocl.SpringParkingLot.core.Receipt;

import java.util.HashMap;
import java.util.Map;

public class CarRepository {
    private Map<Order, Car> cars = new HashMap<>();
    private Map<Receipt,Order> orderMap = new HashMap<>();

    public CarRepository() {
    }

    public void addOrder(Order order,Car car){
        cars.put(order,car);
    }

    public void deleteOrder(Order order){
        cars.remove(order);
    }

    public void addReceipt(Receipt receipt,Order order){
        orderMap.put(receipt,order);
    }

    public void deleteReceipt(Receipt receipt){
        orderMap.remove(receipt);
    }

    public Car checkCarIn(Order order){
        Car car = cars.get(order);
        return car;
    }

    public Map<Order, Car> getCars() {
        return cars;
    }

    public void setCars(Map<Order, Car> cars) {
        this.cars = cars;
    }

    public Map<Receipt, Order> getOrderMap() {
        return orderMap;
    }

    public void setOrderMap(Map<Receipt, Order> orderMap) {
        this.orderMap = orderMap;
    }
}
