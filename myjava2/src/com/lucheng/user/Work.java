package com.lucheng.user;

public class Work {
	private State current;
	private int hour;
	
	
	public void setState(State state) {
		this.current = state;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public Work() {
		current = new ForenoonState();
	}
	public void writeProgram() {
		current.writeProgram(this);
		
	}
}
