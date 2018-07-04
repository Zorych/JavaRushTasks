package com.javarush.task.task04.task0424;

/* 
Три числа
Давайте напишем программу, в которой пользователь вводит три числа с клавиатуры.
Затем происходит сравнение, и если мы находим число, которое отличается от двух других, выводим на экран его порядковый номер.


Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна использовать команды System.out.println() или System.out.print().
3. Программа должна выводить на экран порядковый номер числа, отличного от остальных.
4. Если все числа разные, ничего не выводить.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[3];
        for (int i = 0; i < 3; i++) {
            num[i] = Integer.parseInt(reader.readLine());
        }
        numComparsion(num);
    }
    private static void numComparsion(int[] num){
        if (num[0] == num[1] & num[1] != num[2]) System.out.println(3);
        if (num[1] == num[2] & num[2] != num[0]) System.out.println(1);
        if (num[2] == num[0] & num[0] != num[1]) System.out.println(2);
    }
}