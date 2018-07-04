package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> children1 = new ArrayList<>();
        ArrayList<Human> gSon = new ArrayList<>();
        ArrayList<Human> gDaughter = new ArrayList<>();

        Human kid1 = new Human("Витя", true, 15);
        Human kid2 = new Human("Лена", false, 7);
        Human kid3 = new Human("Андрей", true, 10);

        children1.add(kid1);
        children1.add(kid2);
        children1.add(kid3);

        Human father = new Human("Егор", true, 40, children1);
        Human mother = new Human("Нина", false, 36, children1);

        gSon.add(father);
        gDaughter.add(mother);

        Human gFather1 = new Human("Сергей", true, 70, gSon);
        Human gMother1 = new Human("Анна", false, 66, gSon);
        Human gFather2 = new Human("Борис", true, 65, gDaughter);
        Human gMother2 = new Human("Анастасия", false, 60, gDaughter);

        System.out.println(kid1.toString());
        System.out.println(kid2.toString());
        System.out.println(kid3.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(gFather1.toString());
        System.out.println(gMother1.toString());
        System.out.println(gFather2.toString());
        System.out.println(gMother2.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}