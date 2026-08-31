package com.example.demo.demo.sample;

import org.springframework.stereotype.Service;

@Service
public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }
/////// this is my first file and i want to comit the chanbes fsdf
    // This is the change number one and second
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}
