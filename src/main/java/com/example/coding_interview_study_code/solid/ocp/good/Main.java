package com.example.coding_interview_study_code.solid.ocp.good;

public class Main {

    public static void main(String[] args) {

        Card nongHyupCard = new NongHyupCard();
        Person person1 = new Person(nongHyupCard);
        person1.pay();

        Card wooriCard = new WooriCard();
        Person person2 = new Person(wooriCard);
        person2.pay();
    }
}
