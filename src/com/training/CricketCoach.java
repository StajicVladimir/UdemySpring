package com.training;

public class CricketCoach implements Coach{
	
	private FortuneService fortuneService;
	private String email;
	private String team;
	
	
	public CricketCoach() {
		System.out.println("CricketCoach: inside constructor");
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("inside set email");
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("inside set Team!");
		this.team = team;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method");
		this.fortuneService = fortuneService;
	}
	
	public String getRandomFortune() {
		return fortuneService.getRandomFortune();
	}
	
	@Override
	public String getDailyWorkout() {
		return "Cricket Coach says: play some Cricket";
	}
	
	@Override
	public String getDailyFortune() {
		return "Cricket Fortune: " + fortuneService.getFortune();
	}
}
