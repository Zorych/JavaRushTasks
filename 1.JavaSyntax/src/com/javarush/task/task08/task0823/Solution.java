package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        String[] words = s.split("\\s");

        for (String subStr : words) {
            if (!subStr.isEmpty()) {
                System.out.print(subStr.substring(0, 1).toUpperCase() + subStr.substring(1) + " ");
            }
        }
    }
}