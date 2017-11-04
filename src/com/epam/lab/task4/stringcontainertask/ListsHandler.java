package com.epam.lab.task4.stringcontainertask;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

public class ListsHandler {
	private static final Logger LOG = Logger.getLogger(ListsHandler.class);
	private static final int kIteration = 10;

	public void comparePerformance() {
		List<String> stringsContainer = new StringsContainer();
		List<String> stringsArrayList = new ArrayList<String>();
		long rezContainer = testAddMethod(stringsContainer);
		long rezArrayList = testAddMethod(stringsArrayList);
		LOG.info(String.format("Method \"add\" in StringContainer  performed %s ", rezContainer));
		LOG.info(String.format("Method \"add\" in ArrayList  performed %s ", rezArrayList));
	}

	private long testAddMethod(List<String> listToTest) {
		Date startLinked = new Date();
		for (int i = 0; i < kIteration; i++) {
			listToTest.add("some string");
		}
		Date finishLinked = new Date();
		return finishLinked.getTime() - startLinked.getTime();
	}
}
