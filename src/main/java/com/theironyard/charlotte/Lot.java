package com.theironyard.charlotte;

import java.util.ArrayList;

public class Lot {
    private int iD;
    private double capacity;
    private double rate;
    ArrayList<Car> addCar = new ArrayList();

    public Lot(int iD, double capacity, double rate, ArrayList<Car> addCar) {
        this.iD = iD;
        this.capacity = capacity;
        this.rate = rate;
        this.addCar = addCar;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
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

    public ArrayList<Car> getAddCar() {
        return addCar;
    }

    public void setAddCar(ArrayList<Car> addCar) {
        this.addCar = addCar;
    }
}
