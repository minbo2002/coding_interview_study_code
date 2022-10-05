package com.example.coding_interview_study_code.solid.ocp.bad;

public class Main {

    public static void main(String[] args) {
        ShinhanCard shinhanCard = new ShinhanCard();
        Person person = new Person(shinhanCard);
        person.pay();
    }
}
