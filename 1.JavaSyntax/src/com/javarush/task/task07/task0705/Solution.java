package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] srcArray = new int[20];
        int[] destArray1 = new int[10];
        int[] destArray2 = new int[10];
        for (int i = 0; i < srcArray.length; i++) {
            srcArray[i] = Integer.parseInt(reader.readLine());
        }
        System.arraycopy(srcArray, 0, destArray1,0, 10);
        System.arraycopy(srcArray, 10, destArray2,0, 10);
        for (int i = 0; i < 10; i++) {
            System.out.println(destArray2[i]);
        }
    }
}