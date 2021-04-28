package com.lucheng.view;

import com.lucheng.start.USB;

public class Mouse implements USB {

	@Override
	public void turnOn() {
		System.out.println("鼠标启动了！");
	}

	@Override
	public void turnOff() {
		System.out.println("鼠标关闭了！");
	}

}
