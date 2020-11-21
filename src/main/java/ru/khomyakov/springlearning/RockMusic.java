package ru.khomyakov.springlearning;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    private List<String> songs = new ArrayList<>();
    {
        songs.add("We will rock you");
        songs.add("The wall");
        songs.add("Highway to hell");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
