package com.example.coding_interview_study_code.solid.dip.good;

public class AlramService {

    private Alram alram;

    public AlramService(Alram alram) {
        this.alram = alram;
    }

    public String beep() {
        return alram.beep();
    }
}


