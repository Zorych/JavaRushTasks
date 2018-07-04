package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        minNumber(a, b);
    }

    public static int minNumber(String sA, String sB){
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int min;
        if (a < b) min = a;
        else if (b < a) min = b;
        else min = a;
        return min;
    }
}