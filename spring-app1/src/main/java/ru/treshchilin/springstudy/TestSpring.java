package ru.treshchilin.springstudy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		MusicPlayer player1 = context.getBean("musicPlayer", MusicPlayer.class);
		
		player1.playMusic(Genres.CLASSICAL);
		player1.playMusic(Genres.JAZZ);
		player1.playMusic(Genres.ROCK);
		
		context.close();
	}

}
