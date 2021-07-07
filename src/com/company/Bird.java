package com.company;

public class Bird {

    private String color; // if there is no static keyword then it is an instance variable
    private int noOfWings;
    private int noOfLegs;

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNoOfWings() {
        return this.noOfWings;
    }

    public void setNoOfWings(int noOfWings) {
        this.noOfWings = noOfWings;
    }

    public int getNoOfLegs() {
        return this.noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public void fly() {
        if (this.noOfWings == 2) {
            System.out.println("Bird is flying");
        } else {
            System.out.println("Bird cannot fly");
        }
    }

    public void walk() {
        System.out.println("Bird is walking");
    }

    public void sing() {
        System.out.println("Bird is singing");
    }


}
