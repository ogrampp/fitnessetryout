package com.ogrampp.fitnessetryout.dvr.fixtures;

import java.time.LocalTime;

public class CreatePrograms {
	String name;
	int channel;
	String dayOfWeek;
	LocalTime timeOfDay;
	int durationInMinutes;
	
	public CreatePrograms(){
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public void setTimeOfDay(String timeOfDay) {
		this.timeOfDay = LocalTime.parse(timeOfDay);
	}

	public void setDurationInMinutes(int durationInMinutes) {
		this.durationInMinutes = durationInMinutes;
	}

	public String id(){
		return this.name + ":" + this.channel;
	}
}
