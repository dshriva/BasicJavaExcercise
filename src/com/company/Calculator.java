package com.company;

import java.util.Scanner;

public class Calculator {

    public static void main(String args[]) {
        int result = 0;
        try {
        System.out.println("input 1st number");
        Scanner in = new Scanner(System.in);
       int a = in.nextInt();
        System.out.println("input 2nd number");
        int b = in.nextInt();
        System.out.println("input operation");
        char op = in.next().charAt(0);
        //Calculator c = new Calculator();
        result = doCalculation(a,b,op);

            System.out.println();
            System.out.println("Result = "+result);
        } catch (Exception e) {
            System.out.println("Invalid input or operator");
        }

    }

    public static int doCalculation(int a, int b, char op) {
        int result = 0;
        switch (op) {
            case ('+'):
                result = a + b;
                break;
            case ('-'):
                result = a - b;
                break;
            case ('*'):
                result = a * b;
                break;
            case ('/'):
                try {
                    result = a / b;
                } catch (Exception e) {
                    if (b == 0 && op == '/') {
                        System.out.println("division by 0 not allowed");
                        return -1;

                    }
                }

                break;
            default:
                System.out.println("invalid option");
                break;
        }
        return result;
    }
}





