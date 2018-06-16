package com.training;

public class TrackCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "5km Sprints!!!";
	}

	@Override
	public String getDailyFortune() {
		return "Track coach says: " + fortuneService.getFortune();
	}

}
