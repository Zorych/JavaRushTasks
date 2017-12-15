package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        stringComparsion(name1, name2);
    }

    private static void stringComparsion(String string1, String string2) {

        if (string1.equals(string2)){
            System.out.println("Имена идентичны");
        }
        else
        if (string1.length() == string2.length()){
            System.out.println("Длины имен равны");
        }
    }
}