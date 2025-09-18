package com.example;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a: ");
        int a = sc.nextInt();
        System.out.print("Enter number b: ");
        int b = sc.nextInt();

        System.out.println("a + b = " + calculator.execute("add", a, b));
        System.out.println("a - b = " + calculator.execute("sub", a, b));
        System.out.println("a * b = " + calculator.execute("mul", a, b));
        System.out.println("a / b" + calculator.execute("div", a, b));
        System.out.println("sqrt(a) = " + calculator.execute("sqrt", a));
        System.out.println("sqrt(b) = " + calculator.execute("sqrt", b));
    }
}
