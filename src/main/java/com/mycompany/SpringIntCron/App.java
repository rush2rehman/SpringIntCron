package com.mycompany.SpringIntCron;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.SimpleMailMessage;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("SpringConfig.xml");
    	System.out.println(ac.getBean("WhatsTheTime", WhatsTheTime.class).getTimeStamp());
    	
    	
    }
}
