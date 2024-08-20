package com.example.musicstreaming;

public class LocalFilePlayer implements MusicPlayer {
    private String fileName;

    public LocalFilePlayer(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void play() {
        System.out.println("Playing local file: " + fileName);
    }
}