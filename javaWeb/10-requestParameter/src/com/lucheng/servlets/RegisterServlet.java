package com.lucheng.servlets;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *1.请求参数是存放在Map中
 *2.这个Map的key为请求参数的名称，为String类型
 *	这个Map的value为请求参数的所有值，为String[]类型
 *3.使用最多的是getParameter()方法，其等价于getParameterValues()[0]方法
 */
@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 接收指定名称的请求参数值
		//getParameter("name")方法等同于getParameterValues("name")[0]
		String name = request.getParameter("name");
		String ageStr = request.getParameter("age");
		String nameVlues0 = request.getParameterValues("name")[0];

		Integer age = Integer.valueOf(ageStr);
		System.out.println("name =" + name);
		System.out.println("nameVlues0 =" + nameVlues0);
		System.out.println("age =" + age);
		

		// 获取全部请求参数名称
		// Enumeration 枚举工具类 用于遍历
		Enumeration<String> names = request.getParameterNames();
		// 遍历
		while (names.hasMoreElements()) {
			String eleName = (String) names.nextElement();
			String eleValue = request.getParameter(eleName);
			System.out.println(eleName + "=====" + eleValue);
		}
		//获取指定参数的所有值
		String[] hobby = request.getParameterValues("hobby");
		for (String h : hobby) {
			System.out.println(h);
		}
		
		
		//获取存放请求参数的Map
		Map<String, String[]> map = request.getParameterMap();
		for (String key : map.keySet()) {
			System.out.println(key + "------------"+ request.getParameter(key));
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
