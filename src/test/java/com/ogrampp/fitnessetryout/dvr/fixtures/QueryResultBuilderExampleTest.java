package com.ogrampp.fitnessetryout.dvr.fixtures;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ogrampp.fitnessetryout.dvr.domain.ConflictingProgramException;
import com.ogrampp.fitnessetryout.dvr.domain.Program;
import com.ogrampp.fitnessetryout.dvr.domain.Schedule;
import com.ogrampp.fitnessetryout.dvr.domain.SeasonPassManager;
import com.om.query.QueryResultBuilder;
import com.om.query.domain.QueryResult;

public class QueryResultBuilderExampleTest {

	private SeasonPassManager seasonPassManager;
	private Schedule schedule;

	private LocalDateTime createDate(int year, int month, int day, int hour, int min) {
		return LocalDateTime.of(year, month, day, hour, min, 0);
	}

	@Before
	public void init() throws ConflictingProgramException {
		schedule = new Schedule();
		schedule.addProgram("p1", "e1", 7, createDate(2008, 4, 5, 7, 0), 60);
		schedule.addProgram("p2", "e2", 7, createDate(2008, 4, 5, 8, 0), 60);
		seasonPassManager = new SeasonPassManager(schedule);
	}

	@Test
	public void queryResultBuilderCanTranslateToDoListCorrectly() {
		seasonPassManager.createNewSeasonPass("p1", 7);

		QueryResultBuilder builder = new QueryResultBuilder(Program.class);
		builder.register("timeSlot", new TimeSlotPropertyHandler());
		QueryResult result = builder.build(seasonPassManager.toDoListIterator());
		List<Object> renderedObjects = result.render();
		assertEquals(1, renderedObjects.size());
	}

}
