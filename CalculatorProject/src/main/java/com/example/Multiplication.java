package com.example;

public class Multiplication extends AbstractOperation {
    public Multiplication() {
        super("mul");
    }

    @Override
    public double calculate(double... args) {
        return args[0] * args[1];
    }
}
