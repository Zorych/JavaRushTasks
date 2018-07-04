package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> headArray = new ArrayList<>();
        ArrayList<Integer> dev3Array = new ArrayList<>();
        ArrayList<Integer> dev2Array = new ArrayList<>();
        ArrayList<Integer> restArray = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            headArray.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < headArray.size(); i++) {
            if (headArray.get(i) % 3 == 0) dev3Array.add(headArray.get(i));
            if (headArray.get(i) % 2 == 0) dev2Array.add(headArray.get(i));
            if (headArray.get(i) % 3 != 0 & headArray.get(i) % 2 != 0) restArray.add(headArray.get(i));
        }

        printList(dev3Array);
        printList(dev2Array);
        printList(restArray);
    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}