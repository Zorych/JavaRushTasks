package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[10];
        int[] strLength = new int[10];
        for (int i = 0; i < 10; i++) {
            str[i] = reader.readLine();
            strLength[i] = str[i].length();
        }
        for (int i = 0; i < strLength.length; i++) {
            System.out.println(strLength[i]);
        }
    }
}