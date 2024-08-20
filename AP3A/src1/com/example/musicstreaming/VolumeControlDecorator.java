package com.example.musicstreaming;

public class VolumeControlDecorator extends MusicPlayerDecorator {

    private int volume;

    public VolumeControlDecorator(MusicPlayer decoratedMusicPlayer, int volume) {
        super(decoratedMusicPlayer);
        this.volume = volume;
    }

    @Override
    public void play() {
        super.play();
        adjustVolume();
    }

    private void adjustVolume() {
        System.out.println("Setting volume to: " + volume);
    }
}