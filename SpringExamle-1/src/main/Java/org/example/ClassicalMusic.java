package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    @Override
    public List<String> getSong() {
        List<String> classicaltrack = new ArrayList<>();
        classicaltrack.add("Hungarian rapsody");
        classicaltrack.add("Simphony № 7");
        classicaltrack.add("Simphony Boghemian");
        return classicaltrack;
    }
}
