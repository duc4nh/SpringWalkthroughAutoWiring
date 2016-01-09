package com.fdmgroup.springwalkthroughautowiring;

public class RegistrationController {
	
	private ReadUserCmd readUserCmd;
	private WriteUserCmd writeUserCmd;
	
	public RegistrationController(ReadUserCmd readUserCmd, WriteUserCmd writeUserCmd) {
		this.readUserCmd = readUserCmd;
		this.writeUserCmd = writeUserCmd;
	}
	
}
