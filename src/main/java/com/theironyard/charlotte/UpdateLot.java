package com.theironyard.charlotte;

public class UpdateLot {
    private int iD;
    private double capacity;
    private double rate;

    public UpdateLot(int iD, double capacity, double rate) {
        this.iD = iD;
        this.capacity = capacity;
        this.rate = rate;
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
}
