package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[3];
        int j=0;
        for (int i = 0; i < 3; i++) {
            num[i] = Integer.parseInt(reader.readLine());
            if (num[i]>0) j++;
        }
        System.out.println(j);
    }
}