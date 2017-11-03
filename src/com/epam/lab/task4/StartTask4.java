package com.epam.lab.task4;

import org.apache.log4j.Logger;

import com.epam.lab.task4.models.StringsContainer;

public class StartTask4 {
	private static final Logger LOG = Logger.getLogger(StartTask4.class);

	public static void main(String[] args) {
		StartTask4 startTask4 = new StartTask4();
		startTask4.test();	
		LOG.info("The End of StartTask4 ++  ----------------------");

	}

	private void test() {
		StringsContainer stringsContainer=new StringsContainer(5);
		stringsContainer.add("aaaa");
		stringsContainer.add("bb");
		stringsContainer.add("ccc");
		String[] sss=stringsContainer.getContainer();

		for(String str:sss) {
			LOG.info(str);
		}
	}


}
