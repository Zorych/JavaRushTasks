package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> nameList = new HashMap<>();
        nameList.put("Иванов", "Артур");
        nameList.put("Николаев", "Павел");
        nameList.put("Никитин", "Сергей");
        nameList.put("Михайлюк", "Сергей");
        nameList.put("Антипин", "Павел");
        nameList.put("Квазимодо", "Артур");
        nameList.put("Путяев", "Игорь");
        nameList.put("Охрип", "Николай");
        nameList.put("Ананаев", "Артур");
        nameList.put("Спиндюев", "Василий");
        return nameList;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        ArrayList<String> valueList = new ArrayList<>(map.values());
        int j = 0;
        for (String name : valueList) {
            for (int i = 0; i < valueList.size(); i++) {
                if (name.equals(valueList.get(i))) j++;
            }
            if (j > 1) removeItemFromMapByValue(map, name);
            j = 0;
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
