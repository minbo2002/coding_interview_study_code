package com.example.coding_interview_study_code.solid.ocp.good;

public class WooriCard implements Card {

    @Override
    public void swipeCard() {
        System.out.println("우리카드로 카드를 긁는다");
    }
}
