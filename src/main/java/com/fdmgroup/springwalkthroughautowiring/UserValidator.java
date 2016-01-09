package com.fdmgroup.springwalkthroughautowiring;

public class UserValidator {
	
	private ReadUserCmd readUserCmd;

	public ReadUserCmd getReadUserCmd() {
		return readUserCmd;
	}

	public void setReadUserCmd(ReadUserCmd readUserCmd) {
		this.readUserCmd = readUserCmd;
		System.out.println("Setter of UserValidator has been called");
	}
	
	// for demo purposes, add an init so we can see how its set up
	public void checkSetup() {
		System.out.println("Command set to" + this.readUserCmd);
	}
}
