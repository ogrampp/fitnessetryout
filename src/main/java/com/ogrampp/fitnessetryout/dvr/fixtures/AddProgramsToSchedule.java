package com.ogrampp.fitnessetryout.dvr.fixtures;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class AddProgramsToSchedule {
	private static Schedule schedule = new Schedule();
	private String name;
	private String episode;
	private LocalDateTime startDateTime;
	private int minutes;
	private int channel;
	private String lastId;

	public static Schedule getSchedule(){
		return schedule;
	}
	
	public void setName(String n){
		this.name = n;
	}
	
	public void setEpisode(String e){
		this.episode = e;
	}
	
	public void setChannel(int c){
		this.channel = c;
	}
	
	public void setStartDateTime(String st){
		this.startDateTime = LocalDateTime.parse(st, DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm"));
	}
	
	public void setMinutes(int m){
		this.minutes = m;
	}
	
	public boolean created() {
		try {
			Program program = schedule.addProgram(this.name, this.episode, this.channel, this.startDateTime, this.minutes);
			this.lastId = program.getId();
		} catch (ConflictingProgramExcepiton e) {
			this.lastId = "n/a";
			return false;
		}
		
		return true;
	}
	
	public String lastId(){
		return lastId;
	}
}
