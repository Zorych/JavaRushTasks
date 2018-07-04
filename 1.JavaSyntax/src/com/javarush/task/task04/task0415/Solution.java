package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        String c = reader.readLine();
        isTriangleExists(a, b, c);
    }

    public static void isTriangleExists(String sA, String sB, String sC) {
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int c = Integer.parseInt(sC);
        if (a + b > c & a + c > b & b + c > a) System.out.println("Треугольник существует.");
        else System.out.println("Треугольник не существует.");
    }
}