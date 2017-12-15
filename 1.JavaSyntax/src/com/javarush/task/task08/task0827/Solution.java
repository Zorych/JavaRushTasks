package com.javarush.task.task08.task0827;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("DECEMBER 31 2016"));
    }

    public static boolean isDateOdd(String date) {
        date = date.toLowerCase();
        date = date.substring(0, 1).toUpperCase() + date.substring(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d yyyy", Locale.ENGLISH);
        LocalDate newDate = LocalDate.parse(date, formatter);
        return !(newDate.getDayOfYear() % 2 == 0);
    }
}