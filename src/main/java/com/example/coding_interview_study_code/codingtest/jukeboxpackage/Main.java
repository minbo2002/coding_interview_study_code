package com.example.coding_interview_study_code.codingtest.jukeboxpackage;

import com.example.coding_interview_study_code.codingtest.jukeboxpackage.jukebox.*;
import com.example.coding_interview_study_code.codingtest.jukeboxpackage.user.User;

import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        CD cd1 = new CD();
        Song s1 = new Song("Song1", cd1);
        Song s2 = new Song("Song2", cd1);
        cd1.setSongs(List.of(s1, s2));

        CD cd2 = new CD();
        Song s3 = new Song("Song3", cd2);
        Song s4 = new Song("Song4", cd2);
        cd2.setSongs(List.of(s3, s4));

        Playlist playlist = new Playlist(List.of(s1, s2, s3, s4));
        CDPlayer cdPlayer = new CDPlayer(playlist, Set.of(cd1, cd2));
        Jukebox jukebox = new Jukebox(cdPlayer);

        User user = new User(jukebox);
        user.getJukebox().nextSongBtn();
        user.getJukebox().prevSongBtn();

    }
}
