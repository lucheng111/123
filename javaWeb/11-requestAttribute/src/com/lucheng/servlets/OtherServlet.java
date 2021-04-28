package com.lucheng.servlets;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/otherServlet")
public class OtherServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//从请求中获取指定名称的域属性
		String company = (String) request.getAttribute("company");
		String address = (String) request.getAttribute("address");
		
		
		System.out.println("company = "+ company);
		System.out.println("address = "+ address);
		
		Enumeration<String> names = request.getAttributeNames();
		while (names.hasMoreElements()) {
			String name = names.nextElement();
			System.out.println(name +"====" + request.getAttribute(name));
		}
	}

}
