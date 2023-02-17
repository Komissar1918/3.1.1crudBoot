package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic(MusicType.ROCK);
        musicPlayer1.playMusic(MusicType.CLASSICAL);

        musicPlayer1.setVolume(40);

        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer1.getVolume());
        System.out.println(musicPlayer==musicPlayer1);
        context.close();

    }
}
