package ru.treshchilin.springstudy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		MusicPlayer player1 = context.getBean("musicPlayer", MusicPlayer.class);
		
		System.out.println(player1.getName());
		System.out.println("Volume level: " + player1.getVolumeLevel());
		player1.playMusic(Genres.CLASSICAL);
		player1.playMusic(Genres.JAZZ);
		player1.playMusic(Genres.ROCK);
		
		MusicPlayer player2 = context.getBean("musicPlayer", MusicPlayer.class);
		System.out.println(player1 == player2);
		
		context.close();
	}

}
