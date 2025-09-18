package com.example;

public class Substraction extends AbstractOperation{
    public Substraction() {
        super("sub");
    }

    @Override
    public double calculate(double... args) {
        return args[0] - args[1];
    }
}
