package ru.treshchilin.springstudy;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

	@Override
	public List<String> getSongList() {
		return Arrays.asList("Goret'", "Unravel", "Enemy");
	}
	
	@PostConstruct
	public void doInit() {
		System.out.println("Init of the rock music bean");
	}
	
	@PreDestroy
	public void doDestroy() {
		System.out.println("Destruction of the rock music bean");
	}

}
