package com.training;

import java.util.Random;

public class HappyFortuneService implements FortuneService{
	private final String[] fortunes = {"fortune of the day", "Live long and prosper", "You've been bamboozled"};
	
	@Override
	public String getFortune() {
		return "Have a nice day!";
	}

	@Override
	public String getRandomFortune() {
		Random r = new Random();
		
		return fortunes[r.nextInt(3)];
	}

}
