package ru.treshchilin.springstudy;

import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music {

	@Override
	public String getSong() {
		return "Fly me to the Moon";
	}
	
	public void doInit() {
		System.out.println("Init of the Jazz music bean");
	}
	
	public void doDestroy() {
		System.out.println("Destruction of the Jazz music bean");
	}

}
