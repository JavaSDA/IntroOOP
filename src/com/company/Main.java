package com.company;

import java.util.concurrent.RecursiveAction;

public class Main {

    public static void main(String[] args) {

        // OOP
        // A paradigm is a way of view things
        // Car
        // A class is a blueprint for creating objects.
        // Features of a car: Color, noOfTires, price, model (Fields/class variables)
        // Behaviour or actions of a car: Switching engine on, switching engine off, moving forward
        // moving backward, turning left or right. (methods)

        // Inheritance
        // This is a mechanism that allows us to share behaviour between classes.
        // A class that inherits from another class is the child class. while the inherited class is the parent class.
        // Mercedes,
        // convertible, kompressor engine, color: chrome
        //

        // Encapsulation
        // Encapsulation is the process of hiding data and methods from the "outside world" meaning
        // from public access.
        // public, private
        // typically we use getters and setters to access such values

        // Abstraction
        // Abstraction is a mechanism that is focused on hiding implementation details from
        // the user. The user does not need to know how it was done, they just need to know that
        // it works.

        // Polymorphism
        // This is the ability of an object to return different responses to the same request/method call.
        // Number<decimal> = new Double(5.6);
        // Number<integer> = new Integer(3);


        // Calling the car object
//        Car car = new Car();
//        System.out.println(car.getColor());
//        car.setColor("Blue");
//        System.out.println(car.getColor());
//
//        car.setNoOfTires(8);
//        car.setBrand("BMW limousine");
//
//        System.out.println(car.getNoOfTires());
//        System.out.println(car.getBrand());

//        System.out.println(Car.color);
//        System.out.println(Car.noOfTires);
//        System.out.println(Car.brand);

//        car.startEngine(true);

        // Create a new class name Bird
        // bird should have color, noOfWings, noOfLegs(private & fields)
        // bird should be able to fly, walk, and sing. (public & methods)

        // Use getters and setters on your fields.

//        Bird barry = new Bird();
//
//        barry.setNoOfLegs(2); // set no of legs
//        barry.setNoOfWings(1); // set on of wings
//
//        barry.fly(); // call the fly method
//        barry.walk();
//        barry.sing();

//        System.out.println("Barry has " + barry.getNoOfLegs() + " legs");
//        System.out.println("Barry has " + barry.getNoOfWings() + " wings");


        // Assignment
        // Create a class that models a person
        // features of the person class: height, gender, complexion, age
        // actions: walking, talking, eat, and run.

        // Instantiating our person class.
//        Person person = new Person();
        // set the properties of the person class.
//        person.setAge(1);
//        person.setHeight(0.5f);
//        person.setGender("Male");
//        person.setComplexion("Fair");
//
//        person.walk(false);
//        person.eat(true);
//        person.run(true);

        // Instantiate our rectangle class.
//        Rectangle rectangle = new Rectangle(5, 10);

//        Rectangle rectangle1 = new Rectangle();

//        rectangle1.setLength(12);
//        rectangle1.setBreadth(7);

        // Set the length and breadth
//        rectangle.setBreadth(5);
//        rectangle.setLength(10);

        // output the area
//        System.out.println("Area rectangle1: " + rectangle1.getArea());
//        System.out.println("Area: " + rectangle.getArea());

        // output the perimeter
//        System.out.println("Perimeter: " + rectangle.getPerimeter());
//        System.out.println("Perimeter rectangle1: " + rectangle1.getPerimeter());

        // Calculator
        Calculator calculator = new Calculator();
        int sum = calculator.addValues(2, 4, 8, 9, 10, 11, 23, 25);

//        System.out.println(sum);
//        System.out.println(calculator.addValues(22, 11, 4));
        int difference, product;
        float quotient, average;

        difference = calculator.subtractValues(60, 30);
        product = calculator.multiplyValues(3, 4, 2, 5);
        quotient = calculator.divideValues(40, 20);
        average = calculator.averageOfValues(2, 3, 8, 19, 29, 30);


        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Average: " + average);
    }
}
