package com.example;

public class AbstractOperation implements Operation {
    private final String name;

    public AbstractOperation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public double calculate(double... args) {
        return 0;
    }
}
