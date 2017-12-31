package com.company;

import java.util.Arrays;
public class CreatingStringArray {
    public static void main(String[] args){
       int n=5;
       String[] str_array = new String[n];

       for(int i =0; i<n;i++){
           str_array[i]= String.valueOf(i);
       }
        System.out.println("String array is" + Arrays.toString(str_array));
    }
}
