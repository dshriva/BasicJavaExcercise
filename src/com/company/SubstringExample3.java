package com.company;

public class SubstringExample3 {
    public static void main (String[] args){
        try{
            String str = "Pytho";
            String word  = str.substring(0,str.length()/2);
            System.out.println(word);
        }catch(Exception e){
            System.out.println("odd length of string");
        }

    }
}
