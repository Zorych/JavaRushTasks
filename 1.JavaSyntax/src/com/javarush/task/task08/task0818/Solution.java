package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> salary = new HashMap<>();
        salary.put("Иванов", 500);
        salary.put("Сидоров", 600);
        salary.put("Петров", 400);
        salary.put("Николаев", 200);
        salary.put("Ваниненов", 500);
        salary.put("Кащенко", 900);
        salary.put("Касиев", 499);
        salary.put("Буранов", 501);
        salary.put("Козлов", 656);
        salary.put("Нининов", 321);
        return salary;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> salaryCopy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : salaryCopy.entrySet()) {
            if (pair.getValue() < 500) {
                map.remove(pair.getKey());
            }
        }

    }

    public static void main(String[] args) {

    }
}