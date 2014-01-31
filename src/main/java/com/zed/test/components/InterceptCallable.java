package com.zed.test.components;

import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;

public class InterceptCallable implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		
		MuleMessage message = eventContext.getMessage();
		

		TrackItem item = (TrackItem) message.getPayload();
		
		System.out.println("Item owner: " + item.getOwner());
		
		
		
		
		return message;
	}

}
