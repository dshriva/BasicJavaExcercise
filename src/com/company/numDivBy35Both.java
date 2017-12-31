package com.company;

public class numDivBy35Both {
    public static void main(String args[]) {
        try {
            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("Divisible by 3 and 5");
                    System.out.println(i);
                } else if (i % 3 == 0) {
                    System.out.println("Divisible by 3");
                    System.out.println(i);
                } else if (i % 5 == 0) {
                    System.out.println("Divisible by 5");
                    System.out.println(i);
                }

            }
        }
        catch(Exception e){
            System.out.println("out of range");

        }
    }

}

