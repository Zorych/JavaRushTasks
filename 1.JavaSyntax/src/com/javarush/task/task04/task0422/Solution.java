package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String ageS = reader.readLine();
        ageComparsion(ageS);
    }
    private static void ageComparsion(String age){
        if (Integer.parseInt(age) < 18) {
            System.out.println("Подрасти еще");
        }
    }
}