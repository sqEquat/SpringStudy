package ru.treshchilin.springstudy;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

	@Override
	public List<String> getSongList() {
		return Arrays.asList("Goret'", "Unravel", "Enemy");
	}
	
	public void doInit() {
		System.out.println("Init of the rock music bean");
	}
	
	public void doDestroy() {
		System.out.println("Destruction of the rock music bean");
	}

}
