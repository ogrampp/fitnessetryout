package com.ogrampp.fitnessetryout.dvr.fixtures;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class Schedule {
	private List<Program> scheduledPrograms = new LinkedList<Program>();
	
	public Program addProgram(String programName, String episodeName, int channel, LocalDateTime startDateTime, int lengthInMinutes) throws ConflictingProgramExcepiton{
		TimeSlot timeSlot = new TimeSlot(channel, startDateTime, lengthInMinutes);
		
		boolean isConflict = this.scheduledPrograms.stream().anyMatch(e -> timeSlot.conflictsWith(e.timeSlot));
		
		if (isConflict)
			throw new ConflictingProgramExcepiton();
		
		Program program = new Program(programName, episodeName, timeSlot);
		
		scheduledPrograms.add(program);
		
		return program;
	}
}
