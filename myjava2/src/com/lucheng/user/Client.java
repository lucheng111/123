package com.lucheng.user;

import java.text.SimpleDateFormat;
import java.util.Date;



public class Client {

	public static void main(String[] args) {
		Work emergencyProjects = new Work();
		emergencyProjects.setHour(9);
		emergencyProjects.writeProgram();

		emergencyProjects.setHour(12);
		emergencyProjects.writeProgram();

		emergencyProjects.setHour(13);
		emergencyProjects.writeProgram();
		
		
		System.out.println("--------------------------------------------------------------------------");
		SimpleDateFormat sdf = new SimpleDateFormat();// 格式化时间

		sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");// a为am/pm的标记
		Date date = new Date();
		System.out.println("当前实际时间：" +sdf.format(date));
	}

}
