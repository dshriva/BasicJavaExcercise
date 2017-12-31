//Write a Java program to check if a specified number appears in every pair of adjacent element of a given array of integers.

package com.company;

public class Example10 {
    public static void main(String[] args){
        int[] a= {10,20,30,20,40,20,60};
        int result =0;
        for(int i=0;i<a.length-1;i++){
            if((a[i]==20) && (a[i+1] !=20) || (a[i]!=20) && (a[i+1] ==20) )
                result=1;
        }
        if(result==1)
            System.out.println(String.valueOf(true));
        else
            System.out.println(String.valueOf(false));
    }

}
