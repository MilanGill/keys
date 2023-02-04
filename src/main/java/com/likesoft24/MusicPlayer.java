package com.likesoft24;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    //IoC
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer () {}


    public void PlayMusic() {
        System.out.println("Playing: ");
        for(Music i : musicList){
            System.out.println(i.getSong());
        }
    }

}
