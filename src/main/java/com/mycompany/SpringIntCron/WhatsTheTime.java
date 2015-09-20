package com.mycompany.SpringIntCron;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component("WhatsTheTime")
public class WhatsTheTime {
	
	private String TimeStamp;

	public String getTimeStamp() {
		System.out.println("I am being invoked");
		return new Date().toString();
	}

	public void setTimeStamp(String timeStamp) {
		TimeStamp = timeStamp;
	}

}
