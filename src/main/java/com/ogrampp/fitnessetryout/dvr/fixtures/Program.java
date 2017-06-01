package com.ogrampp.fitnessetryout.dvr.fixtures;

public class Program {
	public final String programName;
	public final String episodeName;
	public final TimeSlot timeSlot;
	
	public Program(String programName, String episodeName, TimeSlot timeSlot){
		this.programName = programName;
		this.episodeName = episodeName;
		this.timeSlot = timeSlot;
	}
	
	public String getId(){
		return String.format("%s:%d", this.programName, this.timeSlot.channel);
	}
}
