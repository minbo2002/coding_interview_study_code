package com.example.coding_interview_study_code.codingtest.jukeboxpackage.user;

import com.example.coding_interview_study_code.codingtest.jukeboxpackage.jukebox.Jukebox;

public class User {

    private final Jukebox jukebox;

    public User(Jukebox jukebox) {
        this.jukebox = jukebox;
    }

    public Jukebox getJukebox() {
        return jukebox;
    }
}
