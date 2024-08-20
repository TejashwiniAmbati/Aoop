package com.example.musicstreaming;

public class EqualizerDecorator extends MusicPlayerDecorator {

    public EqualizerDecorator(MusicPlayer decoratedMusicPlayer) {
        super(decoratedMusicPlayer);
    }

    @Override
    public void play() {
        super.play();
        applyEqualizer();
    }

    private void applyEqualizer() {
        System.out.println("Applying equalizer settings...");
    }
}