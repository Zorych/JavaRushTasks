package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String t = reader.readLine();
        currentColor(t);
    }

    public static void currentColor(String sT){
        float t = Float.parseFloat(sT);
        if (0 <= t % 5 && t % 5 < 3) System.out.println("зелёный");
        if (3 <= t % 5 && t % 5 < 4) System.out.println("желтый");
        if (4 <= t % 5 && t % 5 < 5) System.out.println("красный");
    }

}