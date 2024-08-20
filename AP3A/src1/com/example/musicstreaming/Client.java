package com.example.musicstreaming;

public class Client {
    public static void main(String[] args) {
        // Play music from a local file
        MusicPlayer localFilePlayer = new LocalFilePlayer("song.mp3");
        localFilePlayer.play();

        // Play music from an online streaming service
        MusicPlayer onlineStreamingPlayer = new OnlineStreamingPlayer("http://streamingservice.com/song");
        onlineStreamingPlayer.play();

        // Play a radio station
        MusicPlayer radioStationPlayer = new RadioStationPlayer("CoolRadio 99.9 FM");
        radioStationPlayer.play();

        // Add an equalizer and volume control to the local file player
        MusicPlayer enhancedLocalPlayer = new EqualizerDecorator(new VolumeControlDecorator(localFilePlayer, 75));
        enhancedLocalPlayer.play();

        // Add volume control to the online streaming player
        MusicPlayer enhancedOnlinePlayer = new VolumeControlDecorator(onlineStreamingPlayer, 60);
        enhancedOnlinePlayer.play();

        // Add equalizer to the radio station player
        MusicPlayer enhancedRadioPlayer = new EqualizerDecorator(radioStationPlayer);
        enhancedRadioPlayer.play();
    }
}