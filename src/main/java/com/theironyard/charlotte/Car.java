package com.theironyard.charlotte;

public class Car {
    private String make;
    private String model;
    private int size;
    private double money;
    private int iD;

    public Car(String make, String model, int size, double money, int iD) {
        this.make = make;
        this.model = model;
        this.size = size;
        this.money = money;
        this.iD = iD;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }
}
