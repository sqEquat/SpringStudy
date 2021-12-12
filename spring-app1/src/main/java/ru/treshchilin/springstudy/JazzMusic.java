package ru.treshchilin.springstudy;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music {

	@Override
	public List<String> getSongList() {
		return Arrays.asList("Fly Me To The Moon", "What A Wonderful World", "In The Mood");
	}
	
	public void doInit() {
		System.out.println("Init of the Jazz music bean");
	}
	
	public void doDestroy() {
		System.out.println("Destruction of the Jazz music bean");
	}

}
