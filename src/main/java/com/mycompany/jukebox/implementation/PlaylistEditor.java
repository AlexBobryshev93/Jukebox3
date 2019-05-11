package com.mycompany.jukebox.implementation;

import com.mycompany.jukebox.PlaylistEditorInterface;
import com.mycompany.jukebox.Song;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.LinkedList;
import java.util.List;

@Component
public class PlaylistEditor implements PlaylistEditorInterface {
    @Resource
    private Jukebox jukebox;

    private List<Song> playlist = new LinkedList<>();

    public PlaylistEditor() {
        jukebox = new Jukebox();
        System.out.println("Jukebox is ready...");
    }

    @Override
    public void setPlaylist(Integer...ids) {
        for(Integer i : ids) playlist.add(jukebox.chooseSongById(i));
    }

    public List<Song> getPlaylist() {
        return playlist;
    }

    @Override
    public void printPlaylist() {
        System.out.println("Your playlist for today: ");
        for (Song song : playlist) System.out.println(song.toString());
    }

    public void setJukebox(Jukebox jukebox) {
        this.jukebox = jukebox;
    }

    public Jukebox getJukebox() {
        return jukebox;
    }
}
