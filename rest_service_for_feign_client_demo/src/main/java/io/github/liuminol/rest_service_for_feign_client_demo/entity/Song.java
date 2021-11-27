package io.github.liuminol.rest_service_for_feign_client_demo.entity;

import lombok.Data;

@Data
public class Song {
    private int id;
    private String songName;

    public Song(int id, String songName) {
        this.id = id;
        this.songName = songName;
    }

    public void playSong() {
        System.out.println("Play " + getSongName());
    }
}
