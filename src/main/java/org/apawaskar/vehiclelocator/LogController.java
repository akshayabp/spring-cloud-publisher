package org.apawaskar.vehiclelocator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class LogController {
	
	@Autowired
	private LogfeedSource source;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LogController.class);
	
	@RequestMapping(value="/log-feed",  method=RequestMethod.POST, consumes="application/json")
	public void createLog(@RequestBody String log){
		
		LOGGER.debug("Entering LogController");
		source.publishLogs().send(MessageBuilder.withPayload(log).build());
	}
	
}
