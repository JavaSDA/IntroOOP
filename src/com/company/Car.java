package com.company;

public class Car {

    private String color = "Green";
    private int noOfTires = 4;
    private String brand = "BMW";

    public void startEngine(boolean key) {
        if (key) {
            System.out.println("Engine switched on!");
        } else {
            System.out.println("Please Insert the key");
        }
    }

    public void stopEngine() {
        System.out.println("Engine switched off!");
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNoOfTires() {
        return this.noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
