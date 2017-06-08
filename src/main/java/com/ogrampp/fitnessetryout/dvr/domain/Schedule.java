package com.ogrampp.fitnessetryout.dvr.domain;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Schedule {
	private List<Program> scheduledPrograms = new LinkedList<Program>();
	
	public Program addProgram(String programName, String episodeName, int channel, LocalDateTime startDateTime, int lengthInMinutes) throws ConflictingProgramException{
		TimeSlot timeSlot = new TimeSlot(channel, startDateTime, lengthInMinutes);
		
		boolean isConflict = this.scheduledPrograms.stream().anyMatch(e -> timeSlot.conflictsWith(e.timeSlot));
		
		if (isConflict)
			throw new ConflictingProgramException();
		
		Program program = new Program(programName, episodeName, timeSlot);
		
		scheduledPrograms.add(program);
		
		return program;
	}

	public void removeProgramById(String id) {
		Optional<Program> p = this.scheduledPrograms.stream().filter(e -> e.getId().equals(id)).findFirst();
		if (p.isPresent())
			scheduledPrograms.remove(p.get());
	}

	public List<Program> findProgramsNamedOn(String programName, int channel) {
		List<Program> result = new LinkedList<Program>();
		
		for(Program program : scheduledPrograms){
			if (program.timeSlot.channel == channel && program.programName.equals(programName))
				result.add(program);
		}
		
		return result;
	}

	public void clear() {
		// TODO Auto-generated method stub
		scheduledPrograms.clear();
	}
}
