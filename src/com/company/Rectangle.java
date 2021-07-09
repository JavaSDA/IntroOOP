package com.company;

public class Rectangle {

    // A rectangle typically has 4 sides.
    // A rectangle has opposite sides equal.
    // A rectangle has a length and a breadth.
    // A rectangle has an area and a perimeter.

    // Properties/Attributes of a rectangle.
    private int breadth;
    private int length;

    // A constructor is used to create objects of a class.
    // Constructor overloading: this is creating multiple constructors
    // while differentiating them with the number of parameters passed in.

    public Rectangle() {

    }

    public Rectangle(int breadth, int length) {
        // set the fields to the properties of
        // the parameters passed in
        this.breadth = breadth;
        this.length = length;
    }

    public int getBreadth() {
        return this.breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    public int getArea() {
        // Area of a rectangle is l * b
        return this.length * this.breadth;
    }

    public int getPerimeter() {
        // Perimeter of a rectangle is 2 * (l + b)
        return 2 * (this.length + this.breadth);
    }
}
