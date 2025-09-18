package com.example;

public class Addition extends AbstractOperation {
    public Addition() {
        super("add");
    }
    @Override
    public double calculate(double... args) {
        return args[0] + args[1];
    }
}
