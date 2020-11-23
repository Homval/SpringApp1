package ru.khomyakov.springlearning;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Apassionata";
    }
}
