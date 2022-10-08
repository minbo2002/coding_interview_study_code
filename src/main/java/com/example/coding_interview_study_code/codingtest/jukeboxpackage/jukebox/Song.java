package com.example.coding_interview_study_code.codingtest.jukeboxpackage.jukebox;

public class Song {

    private final String title;
    private final CD cd;

    public Song(String title, CD cd) {
        this.title = title;
        this.cd = cd;
    }

    public String getTitle() {
        return title;
    }

    public CD getCd() {
        return cd;
    }
}
