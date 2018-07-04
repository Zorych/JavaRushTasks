package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sYear = reader.readLine();
        System.out.println("количество дней в году: " + daysThisYear(sYear));
    }

    public static int daysThisYear(String s) {
        int iYear = Integer.parseInt(s);
        int days;
        if (iYear % 100 == 0){
            if (iYear % 400 == 0) days = 366;
            else days = 365;
        }
        else if (iYear % 4 == 0) days = 366;
        else days = 365;
        return days;
    }
}