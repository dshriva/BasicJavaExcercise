package com.company;

public class Question14 {
    public static void main(String args[]) {
        printAmericanFlag();
        System.out.println();
        printIndiaFlag();
    }

    private static void printIndiaFlag() {
       for(int i=0;i<15;i++){
           if(i<5){
               System.out.println("----------------------------------------------------------------");
           } else if(i>=5 && i<10){
              printAshokChakra(i);
           }else {
               System.out.println("================================================================");
           }
       }
    }

    private static void printAshokChakra(int i) {
        if(i==5 || i==9){
            System.out.println("                            +++                                 ");
        } else if(i==6 || i==8){
            System.out.println("                          ++++++++                                 ");
        } else{
            System.out.println("                         ++++++++++                                ");
        }
    }

    private static void printAmericanFlag() {
        for(int i = 0; i < 15; i++) {
            if(i < 9) {
                printStars(i);
                printDashes(i);
            } else {
                printDashes(i);
            }
            System.out.println();
        }
    }

    private static void printDashes(int i) {
        if(i<9){
            System.out.print("==================================");
        } else {
            System.out.print(" ============================================= ");
        }
    }

    private static void printStars(int i) {
        if(i%2 == 0){
            System.out.print("* * * * * * ");
        } else {
            System.out.print(" * * * * *  ");
        }
    }
}










