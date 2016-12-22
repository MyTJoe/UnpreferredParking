package com.theironyard.charlotte;

public class Car {
    private String make;
    private String model;
    private int size;
    private int money;
    private int lotId;

    public Car(String make, String model, int size, int money, int iD) {
        this.make = make;
        this.model = model;
        this.size = size;
        this.money = money;
        this.lotId = iD;
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

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;

    }

    public int getLotId() {
        return lotId;
    }

    public void setLotId(int lotId) {
        this.lotId = lotId;
    }
}

