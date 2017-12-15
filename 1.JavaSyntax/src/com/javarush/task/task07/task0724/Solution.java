package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grandpa1 = new Human("Василий", true, 63);
        System.out.println(grandpa1.toString());

        Human grandpa2 = new Human("Сергей", true, 60);
        System.out.println(grandpa2.toString());

        Human grandma1 = new Human("Анюта", false,60);
        System.out.println(grandma1.toString());

        Human grandma2 = new Human("Елена", false, 55);
        System.out.println(grandma2.toString());

        Human father = new Human("Антон", true, 35, grandpa1, grandma1);
        System.out.println(father.toString());

        Human mother = new Human("Екатерина", false, 33, grandpa2, grandma2);
        System.out.println(mother.toString());

        Human kid1 = new Human("Игорь", true, 1, father, mother);
        System.out.println(kid1.toString());

        Human kid2 = new Human("Нина", false, 2, father, mother);
        System.out.println(kid2.toString());

        Human kid3 = new Human("Егор", true, 3, father, mother);
        System.out.println(kid3.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father, mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















