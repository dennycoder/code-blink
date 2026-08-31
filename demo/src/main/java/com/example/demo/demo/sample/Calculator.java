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
    // aaded the new change
/////// this is my first file and i want to comit the chanbes fsdf
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}
