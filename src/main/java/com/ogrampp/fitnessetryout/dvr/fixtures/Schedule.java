package com.ogrampp.fitnessetryout.dvr.fixtures;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class Schedule {
	private List<TimeSlot> scheduledTimeSlots = new LinkedList<TimeSlot>();
	
	public void addProgram(String programName, String episodeName, int channel, LocalDateTime startDateTime, int lengthInMinutes) throws ConflictingProgramExcepiton{
		TimeSlot timeSlot = new TimeSlot(channel, startDateTime, lengthInMinutes);
		
		boolean isConflict = this.scheduledTimeSlots.stream().anyMatch(e -> timeSlot.conflictsWith(e));
		
		if (isConflict)
			throw new ConflictingProgramExcepiton();
		
		scheduledTimeSlots.add(timeSlot);
	}
}
