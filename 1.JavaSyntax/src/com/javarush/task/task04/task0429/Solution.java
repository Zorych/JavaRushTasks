package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[3];
        int a=0;
        int b=0;
        for (int i = 0; i < 3; i++) {
            num[i] = Integer.parseInt(reader.readLine());
            if (num[i]<0) a++;
            if (num[i]>0) b++;
        }
        System.out.println("количество отрицательных чисел: " + a);
        System.out.println("количество положительных чисел: " + b);
    }
}