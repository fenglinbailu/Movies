package com.neu.web;

import org.apache.log4j.Logger;


public class RIZHI {
	private static Logger logger = Logger.getLogger(RIZHI.class.getName());
	
	public int writelog(String log){
		logger.info(log);
		return 1;
	}
	
}
