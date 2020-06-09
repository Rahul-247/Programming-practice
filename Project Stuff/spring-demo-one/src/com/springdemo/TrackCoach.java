package com.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneSerivce;
	
	public TrackCoach() {
		
	}

	public TrackCoach(FortuneService fortuneSerivce) {
		super();
		this.fortuneSerivce = fortuneSerivce;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do It: "+fortuneSerivce.getFortune();
	}

}
