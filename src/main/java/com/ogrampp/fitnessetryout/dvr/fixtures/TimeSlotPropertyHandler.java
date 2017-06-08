package com.ogrampp.fitnessetryout.dvr.fixtures;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.ogrampp.fitnessetryout.dvr.domain.TimeSlot;
import com.om.query.domain.ObjectDescription;
import com.om.query.handler.PropertyHandler;
import com.om.reflection.PropertyGetter;

public class TimeSlotPropertyHandler extends PropertyHandler {
	static DateTimeFormatter datetimeFormat = DateTimeFormatter.ofPattern("d.M.yyyy h:mm");

	@Override
	public void handle(PropertyGetter propertyGetter, Object targetObject, ObjectDescription objectDescription) {
		TimeSlot timeSlot = propertyGetter.getValue(targetObject, TimeSlot.class);

		LocalDateTime startDateTime = timeSlot.startDateTime;

		objectDescription.addPropertyDescription("start date time", datetimeFormat.format(startDateTime));
	}
}
