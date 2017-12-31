package com.company;

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        System.out.println("input the string");
        Scanner in = new Scanner(System.in);
        try {
            String str = in.next();
            int a = Integer.parseInt(str);
            System.out.println("Integer is" + a);
        }
        catch(Exception e){
            System.out.println("invalid input");
        }

    }
}
