package com.example.coding_interview_study_code.solid.ocp.good;

public class Person {

    private Card card;

    public Person(Card card) {

        this.card = card;
    }

    public void pay() {
        System.out.println("결제를 시도합니다.");
        card.swipeCard();
        System.out.println("결제가 완료되었습니다.");
    }
}


