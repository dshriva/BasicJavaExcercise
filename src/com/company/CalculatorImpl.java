package com.company;

public class CalculatorImpl {

    public static void main(String[] args) {
        //Calculator c1 = new Calculator();
        System.out.println("This is Calculator Impl");
        int res = Calculator.doCalculation(24, 12, '/');
        System.out.println("Result from Cal Impl is "+res);


Calculator calculator2 = new Calculator();
        System.out.println("This is Calculator Impl");
       int res2 = Calculator.doCalculation(36, 12, '/');
System.out.println("Result from Cal Impl is "+res2);
    }
}
