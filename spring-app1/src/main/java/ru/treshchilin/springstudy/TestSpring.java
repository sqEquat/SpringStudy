package ru.treshchilin.springstudy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		MusicPlayer player1 = context.getBean("musicPlayer", MusicPlayer.class);
		
		System.out.println(player1.getName());
		System.out.println(player1.getVolumeLevel());
		player1.playMusic();
		
		MusicPlayer player2 = context.getBean("musicPlayer", MusicPlayer.class);
		player2.setName("Nick's walkman");
		player2.setVolumeLevel(100);
		
		System.out.println(player2.getName());
		System.out.println(player2.getVolumeLevel());
		player2.playMusic();
		
		
		context.close();
	}

}
