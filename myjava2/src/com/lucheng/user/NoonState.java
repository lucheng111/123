package com.lucheng.user;


public class NoonState implements State {

	@Override
	public void writeProgram(Work w) {
		if (w.getHour()< 13) {
			System.out.println("时间为："+ w.getHour() + "点，饿了，午饭：午休");
		} else {
			w.setState(new AfterNoonState());
			w.writeProgram();
		}
	}

}
