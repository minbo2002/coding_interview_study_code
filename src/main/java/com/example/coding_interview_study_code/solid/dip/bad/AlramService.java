package com.example.coding_interview_study_code.solid.dip.bad;

public class AlramService {

    private AlramA alramA;
    private AlramB alramB;

    public String beep(String company) {
        if(company.equals("A")) {
            return alramA.beep();
        } else {
            return alramB.beep();
        }
    }
}
