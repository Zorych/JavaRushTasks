package com.javarush.task.task08.task0814;

import java.util.*;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> sequence = new HashSet<>();
        Collections.addAll(sequence, 10, 11, 12, 3, 51, 17, 6, 4, 77, 55, 7, -2, -1, 5, 37, 22, 0, 45, 44, 65);
        return sequence;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            if ((Integer) iterator.next() > 10) iterator.remove();
        }
        return set;
    }

    public static void main(String[] args) {

    }
}