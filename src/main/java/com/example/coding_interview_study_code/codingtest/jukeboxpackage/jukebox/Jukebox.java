package com.example.coding_interview_study_code.codingtest.jukeboxpackage.jukebox;

public class Jukebox implements Selector{

    private final CDPlayer cdPlayer;

    public Jukebox(CDPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }

    @Override
    public void nextSongBtn() {
        System.out.println("Playing next song");
    }

    @Override
    public void prevSongBtn() {
        System.out.println("Playing previous song");
    }

    @Override
    public void addSongToPlaylistBtn() {

    }

    @Override
    public void removeSongFromPlaylistBtn() {

    }

    @Override
    public void shuffleBtn() {

    }
}
