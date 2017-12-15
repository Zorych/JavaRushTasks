package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[11];
        for (int i = 0; i < 11; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < 11/2; i++) {
            int mid = array[i];
            array[i] = array[10 - i];
            array[10 - i] = mid;
        }
        for (int i = 0; i < 11; i++) {
            System.out.println(array[i]);
        }
    }
}