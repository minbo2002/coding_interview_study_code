package com.example.coding_interview_study_code.codingtest.jukeboxpackage.jukebox;

import java.util.Set;

public class CDPlayer {

    private CD cd;

    private final Set<CD> cds;
    private final Playlist playlist;

    public CDPlayer(Playlist playlist, Set<CD> cds) {
        this.playlist = playlist;
        this.cds = cds;
    }

    protected void playNextSong() { }
    protected void playPrevSong() { }
    protected void addCD(CD cd) { }
    protected void removeCD(CD cd) { }

    protected CD getCd() {

        return cd;
    }

    protected Set<CD> getCds() {

        return cds;
    }

    protected Playlist getPlaylist() {

        return playlist;
    }
}
