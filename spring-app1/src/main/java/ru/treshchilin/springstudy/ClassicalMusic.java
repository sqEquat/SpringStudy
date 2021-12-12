package ru.treshchilin.springstudy;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

	@Override
	public String getSong() {
		return "Hungarian Rhapsody";
	}
	
	public void doMyInit() {
		System.out.println("Init of the classiacl music bean");
	}
	
	public void doMyDestroy() {
		System.out.println("Destruction of the classiacl music bean");
	}

}
