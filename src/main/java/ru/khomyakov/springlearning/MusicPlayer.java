package ru.khomyakov.springlearning;


import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    private final List<Music> genres;

    public MusicPlayer(List<Music> genres) {
        this.genres = genres;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void playMusic(){
        Random random = new Random();
        int i = random.nextInt(3);
        System.out.println("Playing " + genres.get(i).getSong() + " with volume " + getVolume());
    }
}
