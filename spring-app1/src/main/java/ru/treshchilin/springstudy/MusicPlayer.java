package ru.treshchilin.springstudy;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
	private ClassicalMusic classicalMusic;
	private RockMusic rockMusic;
	private JazzMusic jazzMusic;
	private String name;
	private int volumeLevel;
	
	@Autowired
	public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, JazzMusic jazzMusic) {
		this.classicalMusic = classicalMusic;
		this.rockMusic = rockMusic;
		this.jazzMusic = jazzMusic;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVolumeLevel() {
		return volumeLevel;
	}

	public void setVolumeLevel(int volumeLevel) {
		this.volumeLevel = volumeLevel;
	}


	public void playMusic(Genres genre) {
		Random random = new Random();
		int randomSongIndex = random.nextInt(3);
		
		switch(genre) {
		case CLASSICAL:
			System.out.println(classicalMusic.getSongList().get(randomSongIndex));
			break;
		case JAZZ:
			System.out.println(jazzMusic.getSongList().get(randomSongIndex));
			break;
		case ROCK:
			System.out.println(rockMusic.getSongList().get(randomSongIndex));
			break;
		default:
			System.out.println("There is no playlist in such genre");
			break;
		}
	}
}
