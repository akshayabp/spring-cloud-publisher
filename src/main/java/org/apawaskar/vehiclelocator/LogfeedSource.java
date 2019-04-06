package org.apawaskar.vehiclelocator;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface LogfeedSource {

	@Output("fastpassTollChannel")
	MessageChannel publishLogs();
}
