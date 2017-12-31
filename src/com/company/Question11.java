package com.company;

import java.util.Scanner;

public class Question11 {

    public static void main(String args[]) {
        try {
            Scanner in = new Scanner(System.in);

            System.out.println("input the radius of the circle");
            float r = in.nextFloat();
            double perimeter = Math.PI * 2 * r;
            double area = Math.PI * r * r;
            System.out.println("Perimeter of circle is : " + perimeter);
            System.out.println("area of circle is : " + area);

        } catch (Exception e) {
            System.out.println("Invalid input");

        }
    }
}
