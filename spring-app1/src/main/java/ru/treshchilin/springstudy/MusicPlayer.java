package ru.treshchilin.springstudy;

import java.util.List;

public class MusicPlayer {
	private List<Music> playlist;
	private String name;
	private int volumeLevel;
	
	public MusicPlayer() {}
	
	
	public void setPlaylist(List<Music> playList) {
		this.playlist = playList;
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

	
	public void doInit() {
		System.out.println("Init of the " + name + " music player");
	}
	
	public void doDestroy() {
		System.out.println("Destruction of the " + name + " music player");
	}
	public void playMusic() {
		for (Music music : playlist) {
			System.out.println(music.getSong());
		}
	}
}
