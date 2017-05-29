package com.ogrampp.fitnessetryout.dvr.fixtures;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public interface ISendung {
	 void setName(String n);
	 String getName();
	 void setEpisode(String e);
	 String getEpisode();
	 void setChannel(int c);
	 int getChannel();
	 void setDate(LocalDate d);
	 LocalDate getDate();
	 void setStartTime(LocalTime st);
	 LocalTime getStartTime();
	 void setMinutes(int m);
	 int getMinutes();
}
