package ru.treshchilin.springstudy;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

	@Override
	public String getSong() {
		return "Goret'";
	}
	
	public void doInit() {
		System.out.println("Init of the rock music bean");
	}
	
	public void doDestroy() {
		System.out.println("Destruction of the rock music bean");
	}

}
