package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fatherName = reader.readLine();
        String motherName = reader.readLine();
        Cat catFather = new Cat(fatherName);
        Cat catMother = new Cat(motherName);

        String fatherName1 = reader.readLine();
        String motherName1 = reader.readLine();
        Cat catFather1 = new Cat(fatherName1, null, catFather);
        Cat catMother1 = new Cat(motherName1, catMother, null);

        String kittenName1 = reader.readLine();
        String kittenName2 = reader.readLine();
        Cat catKitten1 = new Cat(kittenName1, catMother1, catFather1);
        Cat catKitten2 = new Cat(kittenName2, catMother1, catFather1);

        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catFather1);
        System.out.println(catMother1);
        System.out.println(catKitten1);
        System.out.println(catKitten2);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;


        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            if (father == null && mother == null)
                return "Cat name is " + name + ", no mother, no father ";
            if (father == null)
                return "Cat name is " + name + ", mother is " + mother.name + ", no father ";
            if (mother == null)
                return "Cat name is " + name + ", no mother, father is " + father.name;
            else
                return "Cat name is " + name + ", mother is " + mother.name + ", father is " + father.name;
        }
    }

}
