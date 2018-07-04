package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] list = new int[5];
        for (int i = 0; i < 5; i++) {
            list[i] = (Integer.parseInt(reader.readLine()));
        }
        int num;
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                num = list[i];
                if (list[i] > list[i + 1]) {
                    list[i] = list[i + 1];
                    list[i + 1] = num;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list[i]);
        }
    }
}