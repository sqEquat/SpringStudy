package ru.treshchilin.springstudy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
	@Autowired
	private List<Music> playlist;
	private String name;
	private int volumeLevel;
	
	
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


	@Override
	public String toString() {
		return "MusicPlayer [playlist=" + playlist + ", name=" + name + ", volumeLevel=" + volumeLevel + "]";
	}

	public void playMusic() {
		for (Music music : playlist) {
			System.out.println(music.getSong());
		}
	}
}
