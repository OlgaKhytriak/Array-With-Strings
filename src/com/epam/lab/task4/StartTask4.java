package com.epam.lab.task4;

import java.util.Arrays;

import org.apache.log4j.Logger;

import com.epam.lab.task4.models.StringsContainer;

public class StartTask4 {
	private static final Logger LOG = Logger.getLogger(StartTask4.class);

	public static void main(String[] args) {
		StartTask4 startTask4 = new StartTask4();
		//startTask4.test1();	
		startTask4.test2();
		
		
		LOG.info("The End of StartTask4 ++  ----------------------");

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


}
