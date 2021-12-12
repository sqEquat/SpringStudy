package ru.treshchilin.springstudy;

public class JazzMusic implements Music {

	private JazzMusic() {}
	
	public static JazzMusic getJazzMusic() {
		return new JazzMusic();
	}
	
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
