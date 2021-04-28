package com.lucheng.start;

import com.lucheng.view.KeyBoard;
import com.lucheng.view.Microphone;
import com.lucheng.view.Mouse;

public class Test {
	public static void main(String[] args) {
		Computer p = new Computer();
		p.add(new Mouse());
		p.add(new KeyBoard());
		p.add(new Microphone());
		p.powerOn();
		System.out.println("-----------------------");
		p.powerOff();
	}
}
