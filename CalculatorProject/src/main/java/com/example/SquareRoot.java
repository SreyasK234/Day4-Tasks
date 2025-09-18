package com.example;

public class SquareRoot extends AbstractOperation{
    public SquareRoot() {
        super("sqrt");
    }
    @Override
    public double calculate(double... args) {
        return Math.sqrt(args[0]);
    }
}
