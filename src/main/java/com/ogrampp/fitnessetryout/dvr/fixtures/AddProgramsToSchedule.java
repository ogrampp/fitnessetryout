package com.ogrampp.fitnessetryout.dvr.fixtures;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class AddProgramsToSchedule {
	private static List<ISendung> sendungen = new ArrayList<ISendung>();
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
		boolean isConflict = sendungen.stream().anyMatch(e -> e.getChannel() == this.channel);
		if (isConflict)
			return false;
		
		sendungen.add(new Sendung(this.name, this.episode, this.date, this.startTime, this.minutes, this.channel));
		return true;
	}
}
