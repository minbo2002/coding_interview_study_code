package com.example.coding_interview_study_code.solid.ocp.good;

public class NongHyupCard implements Card {

    @Override
    public void swipeCard() {

        System.out.println("농협카드로 카드를 긁는다");
    }
}
