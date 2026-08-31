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
    // this the second chnage
    // this is the third change
    // this is the sixth change
    // this is the fifth change
    // this is the fourth change
    // this is the seventh change
    // this is the eight change and commit
    // this is the nineth change and the commit
/////// this is my first file and i want to comit the chanbes fsdf
    // This is the change number one and second
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}
