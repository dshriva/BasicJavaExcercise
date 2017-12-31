package com.company;
import java.util.Scanner;
public class areaOfHexagon {
    public static void main(String args[])
    {
        System.out.println("input the length of the side of hexagon : ");
        Scanner in = new Scanner(System.in);
        double area = Math.abs(6 * Math.pow(in.nextInt(),2)/(4 * (Math.tan((Math.PI))/6)));
        System.out.println("area: " + area);

    }
}







