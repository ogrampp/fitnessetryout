package com.ogrampp.fitnessetryout.dvr.fixtures;

import java.time.LocalDate;
import java.time.LocalTime;

public class Sendung implements ISendung {

	private String name;
	private String episode;
	private int channel;
	private LocalDate date;
	private LocalTime startTime;
	private int minutes;

	public Sendung(String name, String episode, LocalDate date, LocalTime startTime, int minutes, int channel) {
		this.name = name;
		this.episode = episode;
		this.date = date;
		this.startTime = startTime;
		this.minutes = minutes;
		this.channel = channel;
	}

	public void setName(String n) {
		this.name = n;
	}

	public String getName() {
		return this.name;
	}

	public void setEpisode(String e) {
		this.episode = e;
	}

	public String getEpisode() {
		return this.episode;
	}

	public void setChannel(int c) {
		this.channel = c;
	}

	public int getChannel() {
		return this.channel;
	}

	public void setDate(LocalDate d) {
		this.date = d;
	}

	public LocalDate getDate() {
		return this.date;
	}

	public void setStartTime(LocalTime st) {
		this.startTime = st;

	}

	public LocalTime getStartTime() {
		return this.startTime;
	}

	public void setMinutes(int m) {
		this.minutes = m;
	}

	public int getMinutes() {
		return this.minutes;
	}

}
