package com.lucheng.servlets;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//这里接收的name，其字符编码为ISO8859-1
		String name = request.getParameter("name");
		
		//解决所有乱码问题
		//打散：将name字符串按照原编码进行打散
		byte[] bytes = name.getBytes("ISO8859-1");
		//组装：将bytes字节数组按照指定字符编码进行组装，组装为String
		name = new String(bytes,"UTF-8");
		
		
		String age = request.getParameter("age");

		System.out.println("name =" + name);
		System.out.println("age =" + age);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
