package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@Scope("prototype")
public class MusicPlayer {
    private Music music;
    private Music music2;
    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer(@Qualifier("rockMusic") Music music,
                       @Qualifier("classicalMusic") Music music2) {
        this.music = music;
        this.music2 = music2;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void playMusic(MusicType musicType) {
        Random random = new Random();
        int randomSong = random.nextInt(3);
        if(musicType==MusicType.CLASSICAL) System.out.println("Playing: " + music2.getSong().get(randomSong));
        else if(musicType == MusicType.ROCK) System.out.println("Playing: " + music.getSong().get(randomSong));
    }
}
