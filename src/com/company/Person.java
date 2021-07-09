package com.company;

public class Person {

    // Create instance fields to model the features or attributes
    private float height;
    private String gender;
    private String complexion;
    private int age;

    // Create getter and setters to get and set respectively
    // the person's features or attributes.
    public float getHeight() {
        return this.height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getComplexion() {
        return this.complexion;
    }

    public void setComplexion(String complexion) {
        this.complexion = complexion;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Create methods or a method to describe
    // or define the person's behaviour

    public void walk(boolean canWalk) {
        if (canWalk) {
            System.out.println("Person is walking");
        } else {
            System.out.println("Person is probably ill or a toddler");
        }
    }

    public void talk(boolean canTalk) {
        if (canTalk) {
            System.out.println("Person is talking");
        } else {
            System.out.println("Person is probably ill or a toddler");
        }
    }

    public void eat(boolean canEat) {
        if (canEat) {
            System.out.println("Person is eating");
        } else {
            System.out.println("Person is probably ill or a toddler");
        }
    }

    public void run(boolean canRun) {
        if (canRun) {
            System.out.println("Person is running");
        } else {
            System.out.println("Person is probably ill or a toddler");
        }
    }


}
