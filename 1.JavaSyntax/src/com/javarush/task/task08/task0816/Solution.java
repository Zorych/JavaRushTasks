package com.javarush.task.task08.task0816;

import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Васин", new Date("JUNE 1 1980"));
        map.put("Шварценегер", new Date("September 1 1980"));
        map.put("Григорьев", new Date("JULY 1 1980"));
        map.put("Сергеев", new Date("AUGUST 1 1980"));
        map.put("Спиридонов", new Date("NOVEMBER 1 1980"));
        map.put("Анисимов", new Date("MAY 1 1980"));
        map.put("Дадонов", new Date("FEBRUARY 1 1980"));
        map.put("Малкин", new Date("MARCH 1 1980"));
        map.put("Спичкин", new Date("DECEMBER 1 1980"));
        map.put("Холмс", new Date("OCTOBER 1 1980"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> birth = iterator.next();
            if (birth.getValue().getMonth() > 4 && birth.getValue().getMonth() < 8) iterator.remove();
        }

    }

    public static void main(String[] args) {
    }
}
