package com.splus.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/time")
public class Time {

	
	@GET
	@Path("localTime")
	public String getLocalTime(){
		
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
		return simpleDateFormat.format(calendar.getTime());		
	}
}
