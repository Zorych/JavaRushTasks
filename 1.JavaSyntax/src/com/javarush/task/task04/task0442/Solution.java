package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0, summ = 0;
        while (i != -1) {
            i = Integer.parseInt(reader.readLine());
            summ = summ + i;
        }
        System.out.println(summ);
    }
}