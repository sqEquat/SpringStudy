package ru.treshchilin.springstudy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		
		ClassicalMusic classicalMusic = context.getBean("musicBean2", ClassicalMusic.class);
		System.out.println(classicalMusic.getSong());
		
		RockMusic rockMusic = context.getBean("musicBean1", RockMusic.class);
		System.out.println(rockMusic.getSong());
		
		JazzMusic jazzMusic = context.getBean("musicBean3", JazzMusic.class);
		System.out.println(jazzMusic.getSong());
		
		
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
