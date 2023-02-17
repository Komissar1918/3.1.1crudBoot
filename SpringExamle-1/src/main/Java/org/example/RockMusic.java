package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    @Override
    public List<String> getSong() {
        List<String> rocktrack = new ArrayList<>();
        rocktrack.add("Master of Puppets");
        rocktrack.add("Mutter");
        rocktrack.add("Mount of war");
        return rocktrack;
    }
}
