package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        int max = 0, n = 1;
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(reader.readLine());
            list.add(num);
            if (i > 0) n = (num == list.get(i - 1)) ? n + 1 : 1;
            if (n > max) max = n;
        }
        System.out.println(max);
    }
}