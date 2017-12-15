package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        lookingForPairs(a, b, c);
    }

    public static void lookingForPairs(int a, int b, int c){
        if (a == b && b == c) System.out.println(a + " " + b + " " + c);
        else if (a == b || b == c) System.out.println(b + " " + b);
        else if (b == a || a == c) System.out.println(a + " " + a);
        else if (a == c || c == b) System.out.println(c + " " + c);
    }
}