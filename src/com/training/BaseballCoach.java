package com.training;

public class BaseballCoach implements Coach{
	
	private FortuneService FortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.FortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "30 Minutes of Batting training";
	}

	@Override
	public String getDailyFortune() {
		return FortuneService.getFortune();
	}
}
