package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Question47 {
    private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    public static void main(String args[]) {
        Date date = new Date();
        System.out.println(sdf.format(date));
    }
}

