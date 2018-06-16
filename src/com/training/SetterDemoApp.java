package com.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());
		System.out.println(cricketCoach.getEmail());
		System.out.println(cricketCoach.getTeam());
		
		System.out.println(cricketCoach.getRandomFortune());
		System.out.println(cricketCoach.getRandomFortune());
		System.out.println(cricketCoach.getRandomFortune());
		System.out.println(cricketCoach.getRandomFortune());
		
		context.close();
	}

}
