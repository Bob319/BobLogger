package com.team319.robot.logging;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"properties","subsystems"})
public class LoggableRobot extends Loggable{
	List<LoggableSubsystem> subsystems = new ArrayList<LoggableSubsystem>();

	public void addSubsystem(LoggableSubsystem subsystem){
		this.subsystems.add(subsystem);
	}

	public List<LoggableSubsystem> getSubsystems() {
		return subsystems;
	}
}
