package com.epam.lab.task4;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Category;
import org.apache.log4j.Logger;
import com.epam.lab.task4.stringcontainertask.ListsHandler;
import com.epam.lab.task4.stringcontainertask.StringsContainer;

public class StartTask4 {
	private static final Logger LOG = Logger.getLogger(StartTask4.class);
	private static final int kIteration = 10;
	

	public static void main(String[] args) {
		LOG.info("The Begin of Task4 ++  ----------------------");
		System.out.println("zscacadfc");
		ListsHandler listsHandler = new ListsHandler();
		listsHandler.comparePerformance();
		StartTask4 startTask4 = new StartTask4();
		startTask4.comparePerformance();
		LOG.info("The End of Task4 ++  ----------------------");
	}

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
