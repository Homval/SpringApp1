package ru.khomyakov.springlearning;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> songs = new ArrayList<>();
    {
        songs.add("Apassionata");
        songs.add("Symphony #6");
        songs.add("Moonlight sonata");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
