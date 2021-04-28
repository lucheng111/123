package com.lucheng.view;

import com.lucheng.start.USB;

public class Microphone implements USB {

	@Override
	public void turnOn() {
		System.out.println("麦克风启动了");
	}

	@Override
	public void turnOff() {
		System.out.println("麦克风关闭了");
	}

}
