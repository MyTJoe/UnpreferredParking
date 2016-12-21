package com.theironyard.charlotte;

import java.util.ArrayList;

public class Lot {
    private int iD;
    private String currentCars;
    private double capacity;
    private double rate;
    private static ArrayList<Car> addCar = new ArrayList();

    public Lot(int iD, String currentCars, double capacity, double rate) {
        this.iD = iD;
        this.currentCars = currentCars;
        this.capacity = capacity;
        this.rate = rate;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getCurrentCars() {
        return currentCars;
    }

    public void setCurrentCars(String currentCars) {
        this.currentCars = currentCars;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
