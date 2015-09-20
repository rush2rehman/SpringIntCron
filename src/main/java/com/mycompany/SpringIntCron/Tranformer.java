package com.mycompany.SpringIntCron;

import org.springframework.integration.annotation.Transformer;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component("transformer")
public class Tranformer {
	@Transformer
	public Message<Object> tranform(Message<Object> m)
	{
		 SimpleMailMessage email = new SimpleMailMessage();
	        email.setTo("123@gmail.com");
	        email.setSubject("Test");
	        email.setText("test");
		//String s = (String)m.getPayload();
		//String s1 = "Transformed-->" + s;
		Object payload = email;
		return MessageBuilder.withPayload(payload).build();
	}

}
