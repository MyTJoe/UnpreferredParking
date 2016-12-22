package com.theironyard.charlotte;

import java.util.ArrayList;

public class Lot {
    private int Id;
    private int capacity;
    private int rate;
    private ArrayList<Car> cars = new ArrayList();

    public Lot(int Id, int capacity, int rate, ArrayList<Car> cars) {
        this.Id = Id;
        this.capacity = capacity;
        this.rate = rate;
        this.cars = cars;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    @Override
    public String toString() {
        return "Lot{" +
                "Id=" + Id +
                ", capacity=" + capacity +
                ", rate=" + rate +
                ", cars=" + cars +
                '}';
    }
}
