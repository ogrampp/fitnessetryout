package com.ogrampp.fitnessetryout.dvr.domain;

import java.time.LocalDateTime;

public class TimeSlot {
	public final int channel;
	public final LocalDateTime startDateTime;
	public final int durationInMinutes;
	
	public TimeSlot(int channel, LocalDateTime startDateTime, int durationInMinutes){
		this.channel = channel;
		this.startDateTime = startDateTime;
		this.durationInMinutes = durationInMinutes;
	}
	
	public boolean conflictsWith(TimeSlot other){
		return this.channel == other.channel && this.startDateTime.equals(other.startDateTime);
	}
}
