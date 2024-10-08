package com.example.musicstreaming;

public class RadioStationPlayer implements MusicPlayer {
    private String stationName;

    public RadioStationPlayer(String stationName) {
        this.stationName = stationName;
    }

    @Override
    public void play() {
        System.out.println("Playing radio station: " + stationName);
    }
}
