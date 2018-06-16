package com.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TrackSpringApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = context.getBean("myCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		context.close();
	}
}
