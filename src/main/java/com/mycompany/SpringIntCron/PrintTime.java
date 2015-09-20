package com.mycompany.SpringIntCron;

import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component("print")
public class PrintTime {
	
	public void printTimeStamp(Message m)
	{
		System.out.println(m.toString());
	}

}
