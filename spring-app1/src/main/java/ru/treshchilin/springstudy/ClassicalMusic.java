package ru.treshchilin.springstudy;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

	@Override
	public List<String> getSongList() {
		return Arrays.asList("For Elise", "Hungarian Rapsodie", "Toccata and Fugue in D minor");
	}
	
	public void doMyInit() {
		System.out.println("Init of the classiacl music bean");
	}
	
	public void doMyDestroy() {
		System.out.println("Destruction of the classiacl music bean");
	}

}
