package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> month = new HashMap<>();
        month.put("January", 1);
        month.put("February", 2);
        month.put("March", 3);
        month.put("April", 4);
        month.put("May", 5);
        month.put("June", 6);
        month.put("July", 7);
        month.put("August", 8);
        month.put("September", 9);
        month.put("October", 10);
        month.put("November", 11);
        month.put("December", 12);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputMonth = reader.readLine();

        for (Map.Entry<String, Integer> entry : month.entrySet()) {
            if (entry.getKey().equals(inputMonth))
                System.out.println(inputMonth + " is " + entry.getValue() + " month");
        }
    }
}
