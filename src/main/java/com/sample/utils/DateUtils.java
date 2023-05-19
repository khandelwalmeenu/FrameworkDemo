package com.sample.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	
	
	
	public static String getTimeStamp() {
	return new SimpleDateFormat("yyyy.dd.hh.ss").format(new Date());
}
	

}
