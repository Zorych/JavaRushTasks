package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
10 зергов, 5 протоссов и 12 терран.
*/

public class Solution {
    public static void main(String[] args) {

    // 10 Зергов
        Zerg zerg1 = new Zerg();
        zerg1.name = "Z1";
        Zerg zerg2 = new Zerg();
        zerg2.name = "Z2";
        Zerg zerg3 = new Zerg();
        zerg3.name = "Z3";
        Zerg zerg4 = new Zerg();
        zerg4.name = "Z4";
        Zerg zerg5 = new Zerg();
        zerg5.name = "Z5";
        Zerg zerg6 = new Zerg();
        zerg6.name = "Z6";
        Zerg zerg7 = new Zerg();
        zerg7.name = "Z7";
        Zerg zerg8 = new Zerg();
        zerg8.name = "Z8";
        Zerg zerg9 = new Zerg();
        zerg9.name = "Z9";
        Zerg zerg10 = new Zerg();
        zerg10.name = "Z10";

    // 5 протоссов
        Protoss protoss1 = new Protoss();
        protoss1.name = "prot1";
        Protoss protoss2 = new Protoss();
        protoss2.name = "prot2";
        Protoss protoss3 = new Protoss();
        protoss3.name = "prot3";
        Protoss protoss4 = new Protoss();
        protoss4.name = "prot4";
        Protoss protoss5 = new Protoss();
        protoss5.name = "prot5";

    // 12 терран
        Terran terran1 = new Terran();
        terran1.name = "Terr1";
        Terran terran2 = new Terran();
        terran2.name = "Terr2";
        Terran terran3 = new Terran();
        terran3.name = "Terr3";
        Terran terran4 = new Terran();
        terran4.name = "Terr4";
        Terran terran5 = new Terran();
        terran5.name = "Terr5";
        Terran terran6 = new Terran();
        terran6.name = "Terr6";
        Terran terran7 = new Terran();
        terran7.name = "Terr7";
        Terran terran8 = new Terran();
        terran8.name = "Terr8";
        Terran terran9 = new Terran();
        terran9.name = "Terr9";
        Terran terran10 = new Terran();
        terran10.name = "Terr10";
        Terran terran11 = new Terran();
        terran11.name = "Terr11";
        Terran terran12 = new Terran();
        terran12.name = "Terr12";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
