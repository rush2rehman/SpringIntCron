package com.mycompany.SpringIntCron;

import org.springframework.integration.annotation.Transformer;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component("transformer")
public class Tranformer {
	@Transformer
	public Message<Object> tranform(Message<Object> m)
	{
		String s = (String)m.getPayload();
		String s1 = "Transformed-->" + s;
		Object payload = s1;
		return MessageBuilder.withPayload(payload).build();
	}

}
