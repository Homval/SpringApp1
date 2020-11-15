package ru.khomyakov.springlearning;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Apassionata";
    }
}
