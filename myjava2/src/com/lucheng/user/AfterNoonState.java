package com.lucheng.user;


public class AfterNoonState implements State {

	@Override
	public void writeProgram(Work w) {
		System.out.println("时间： " + w.getHour() + "点，下午状态还不错，继续努力");
	}

}
