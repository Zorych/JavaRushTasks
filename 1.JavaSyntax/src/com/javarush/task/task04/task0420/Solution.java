package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        bubbleSort(arr);
    }

    private static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) { // i=2
            for (int j = 0; j < i; j++) {           // j=0, j<i(2), j++
                if (arr[j] < arr[j + 1]) {          // arr[0] > arr[1]
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        System.out.println(arr[1] + " " + arr[2] + " " + arr[3]);
    }
}