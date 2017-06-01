package com.ogrampp.fitnessetryout.dvr.fixtures;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class AddProgramsToSchedule {
	private static List<TimeSlot> sendungen = new ArrayList<TimeSlot>();
	private String name;
	private String episode;
	private LocalDateTime startDateTime;
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
	
	public void setStartDateTime(String st){
		this.startDateTime = LocalDateTime.parse(st, DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm"));
	}
	
	public void setMinutes(int m){
		this.minutes = m;
	}
	
	public boolean created(){
		TimeSlot timeSlot = new TimeSlot(this.channel, this.startDateTime, this.minutes);
		boolean isConflict = sendungen.stream().anyMatch(e -> timeSlot.conflictsWith(e));
		if (isConflict)
			return false;
		
		sendungen.add(timeSlot);
		return true;
	}
}
