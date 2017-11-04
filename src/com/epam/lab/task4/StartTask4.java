package com.epam.lab.task4;
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
=======

import java.util.Arrays;
>>>>>>> parent of ac36d84... container is finished

import org.apache.log4j.Category;
import org.apache.log4j.Logger;
import com.epam.lab.task4.stringcontainertask.ListsHandler;
import com.epam.lab.task4.stringcontainertask.StringsContainer;

public class StartTask4 {
	private static final Logger LOG = Logger.getLogger(StartTask4.class);
<<<<<<< HEAD
	private static final int kIteration = 10;
	
=======
>>>>>>> parent of ac36d84... container is finished

	public static void main(String[] args) {
		LOG.info("The Begin of Task4 ++  ----------------------");
		System.out.println("zscacadfc");
		ListsHandler listsHandler = new ListsHandler();
		listsHandler.comparePerformance();
		StartTask4 startTask4 = new StartTask4();
<<<<<<< HEAD
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
=======
		//startTask4.test1();	
		startTask4.test2();
		
		
		LOG.info("The End of StartTask4 ++  ----------------------");

>>>>>>> parent of ac36d84... container is finished
	}
	
	private void test2() {
		String[] myArr={"aaaa","bb","ccc"};
		StringsContainer stringsContainer=new StringsContainer(myArr) ;
		String[] sss=stringsContainer.getContainer();
		for(String str:sss) {
			LOG.info(str);
		}
		LOG.info( "-------" );
		stringsContainer.add("last");
		sss=stringsContainer.getContainer();
		for(String str:sss) {
			LOG.info(str);
		}
		System.out.println(stringsContainer.get(10));
	}

	private void test1() {
		StringsContainer stringsContainer=new StringsContainer();
		stringsContainer.add("aaaa");
		stringsContainer.add("bb");
		stringsContainer.add("ccc");
		stringsContainer.add("d");
		stringsContainer.add(2,"second");
		stringsContainer.add(5,"fifth");
		stringsContainer.add(0,"zero");
		String[] sss=stringsContainer.getContainer();

		for(String str:sss) {
			LOG.info(str);
		}
	}
<<<<<<< HEAD
=======


>>>>>>> parent of ac36d84... container is finished
}
