package com.example;

public class Division extends AbstractOperation {
    public Division() {
        super("div");
    }
    @Override
    public double calculate(double... args) {
        return args[0] / args[1];
    }
}
