package com.ogrampp.fitnessetryout.dvr.fixtures;

public class RemoveProgramById {
	public RemoveProgramById(String id){
		AddProgramsToSchedule.getSchedule().removeProgramById(id);
	}
}
