package com.example.musicstreaming;

public class OnlineStreamingPlayer implements MusicPlayer {
    private String url;

    public OnlineStreamingPlayer(String url) {
        this.url = url;
    }

    @Override
    public void play() {
        System.out.println("Streaming music from: " + url);
    }
}