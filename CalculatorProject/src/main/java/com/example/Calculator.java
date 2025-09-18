package com.example;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private final Map<String, Operation> operations = new HashMap<>();

    private void register(Operation op) {
        if(op instanceof AbstractOperation){
            operations.put(((AbstractOperation) op).getName(), op);
        }
    }


    public Calculator() {
        register(new Addition());
        register(new Substraction());
        register(new Multiplication());
        register(new Division());
        register(new SquareRoot());
    }

    public double execute(String opName, double... args){
        Operation op = operations.get(opName);
        if(op == null){
            throw new IllegalArgumentException("Unknown operation: " + opName);
        }
        return op.calculate(args);
    }
}
