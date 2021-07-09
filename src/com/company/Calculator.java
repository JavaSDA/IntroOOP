package com.company;

public class Calculator {

    // method to add values.
    // varargs
    // int...
    public int addValues(int... numbers) {
        // Initialize a variable to hold the sum of
        // the numbers
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // the same as sum = sum + numbers[i]
        }

        return sum;
    }

    // subtraction method
    public int subtractValues(int biggerNumber, int smallerNumber) {
        return biggerNumber - smallerNumber;
    }

    // Multiplication method
    public int multiplyValues(int... numbers) {
        // Initialize a variable to hold all the product
        // of the numbers
        int product = 1; // initialize to one in order not to get a product of 1

        for (int i = 0; i < numbers.length; i++) {
            product *= numbers[i]; // product = product * numbers[i]
        }

        return product;
    }

    // Division method
    public float divideValues(float biggerNumber, float smallerNumber) {
        // In order to avoid the user from sending 0 as a divisor.
        if (smallerNumber == 0) {
            System.out.println("Please do not put 0 as a divisor");
            return 0;
        } else {
            return biggerNumber / smallerNumber;
        }
    }

    // Average method
    public float averageOfValues(float... numbers) {
        // average = sum of values / number of values
        // Initialize a variable to hold the sum of the values
        float sum = 0;

        // Loop through the numbers and add all the values together
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Return the average value to the method call.
        return sum / numbers.length;

    }
}
