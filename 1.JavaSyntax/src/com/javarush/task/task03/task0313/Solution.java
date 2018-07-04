package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution {
    public static void main(String[] args) {
        String s1 = "Мама", s2 = "Мыла", s3 = "Раму";
        System.out.println(mamaRama(s1, s2, s3));
        System.out.println(mamaRama(s1, s3, s2));
        System.out.println(mamaRama(s2, s1, s3));
        System.out.println(mamaRama(s2, s3, s1));
        System.out.println(mamaRama(s3, s2, s1));
        System.out.println(mamaRama(s3, s1, s2));
    }
    public static String mamaRama(String a, String b, String c){
        return a+b+c;
    }
}