package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println(dayOfWeek(s));
    }

    public static String dayOfWeek(String s) {
        int iDay = Integer.parseInt(s);
        String sDay = "";
        if (1 <= iDay && iDay <= 7){
            if (iDay == 1) sDay = "понедельник";
            else if (iDay == 2) sDay = "вторник";
            else if (iDay == 3) sDay = "среда";
            else if (iDay == 4) sDay = "четверг";
            else if (iDay == 5) sDay = "пятница";
            else if (iDay == 6) sDay = "суббота";
            else if (iDay == 7) sDay = "воскресенье";
        }
        else sDay = "такого дня недели не существует";
        return sDay;
    }
}