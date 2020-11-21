package ru.khomyakov.springlearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public void playMusic(MusicStyle style){
        Random random = new Random();
        int i = random.nextInt(3);
        switch (style.ordinal()) {
            case 0 :
                System.out.println("Playing " + music1.getSong().get(i));
                break;
            case 1 :
                System.out.println("Playing " + music2.getSong().get(i));
                break;
        }
    }
}
