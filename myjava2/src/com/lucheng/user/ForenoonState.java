package com.lucheng.user;


public class ForenoonState implements State {

	@Override
	public void writeProgram(Work w) {
		if (w.getHour()< 12) {
			System.out.println("时间为："+w.getHour() + "点，上午工作，精神百倍");
		} else {
			w.setState(new NoonState());
			w.writeProgram();
		}
	}

}
