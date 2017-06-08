package com.ogrampp.fitnessetryout.dvr.domain;

public class Program {
	public final String programName;
	public final String episodeName;
	public final TimeSlot timeSlot;

	public Program(String programName, String episodeName, TimeSlot timeSlot) {
		this.programName = programName;
		this.episodeName = episodeName;
		this.timeSlot = timeSlot;
	}

	public String getProgramName() {
		return programName;
	}

	public String getEpisodeName() {
		return episodeName;
	}

	public TimeSlot getTimeSlot() {
		return timeSlot;
	}

	public String getId() {
		return String.format("%s:%d", this.programName, this.timeSlot.channel);
	}

	public boolean sameEpisodeAs(Program program) {
		return timeSlot.channel == program.timeSlot.channel && programName.equals(program.programName)
				&& episodeName.equals(program.episodeName);
	}
}
