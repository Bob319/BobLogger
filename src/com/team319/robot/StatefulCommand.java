package com.team319.robot;

import edu.wpi.first.wpilibj.command.Command;

public abstract class StatefulCommand extends Command{
	public abstract String getCurrentState();
}
