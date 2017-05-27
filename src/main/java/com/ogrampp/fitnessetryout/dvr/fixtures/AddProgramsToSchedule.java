package com.ogrampp.fitnessetryout.dvr.fixtures;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class AddProgramsToSchedule {
	private String name;
	private String episode;
	private LocalDate date;
	private LocalTime startTime;
	private int minutes;
	private int channel;

	public void setName(String n){
		this.name = n;
	}
	
	public void setEpisode(String e){
		this.episode = e;
	}
	
	public void setChannel(int c){
		this.channel = c;
	}
	
	public void setDate(String d){
		this.date = LocalDate.parse(d, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
	}
	
	public void setStartTime(String st){
		this.startTime = LocalTime.parse(st, DateTimeFormatter.ofPattern("HH:mm"));
	}
	
	public void setMinutes(int m){
		this.minutes = m;
	}
	
	public boolean created(){
		return true;
	}
}
