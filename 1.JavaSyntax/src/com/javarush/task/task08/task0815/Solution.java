package com.javarush.task.task08.task0815;

import java.util.*;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> nameMap = new HashMap<>();
        nameMap.put("Иванов", "Николай");
        nameMap.put("Петров", "Василий");
        nameMap.put("Сидоров", "Сергей");
        nameMap.put("Николаев", "Игорь");
        nameMap.put("Григорьев", "Сергей");
        nameMap.put("Никитин", "Сергей");
        nameMap.put("Веселовцев", "Сергей");
        nameMap.put("Алексеев", "Сергей");
        nameMap.put("Шотов", "Сергей");
        nameMap.put("Геращенко", "Сергей");
        return nameMap;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int nameCount = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (name.equals(entry.getValue())) nameCount++;
        }
        return nameCount;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int lastNameCount = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (lastName.equals(entry.getKey())) lastNameCount++;
        }
        return lastNameCount;

    }

    public static void main(String[] args) {

    }
}