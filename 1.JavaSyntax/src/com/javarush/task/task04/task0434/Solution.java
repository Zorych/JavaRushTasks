package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int i = 1, n = 1;
        while (i <= 10) {
            while (n <= 10) {
                System.out.print(i*n+" ");
                n++;
            }
            System.out.println();
            i++;
            n=1;
        }
    }
}