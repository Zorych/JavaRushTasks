package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println(plusOrMinus(s));
    }

    public static int plusOrMinus(String s) {
        int a = Integer.parseInt(s);
        if (a > 0) return 2 * a;
        else if (a < 0) return a + 1;
        else return 0;
    }
}