package com.lucheng.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/other")
public class OtherServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		//解决中文乱码问题
		response.setContentType("text/html;charset=UTF-8");
		
		String age = request.getParameter("age");
		
		System.out.println("name ==========="+name);
		System.out.println("age ============="+age);
		
		//从request域中获取属性
		String attrName = (String) request.getAttribute("attrName");
		String attrAge = (String) request.getAttribute("attrAge");
		
		
		
		System.out.println("attrName ==========="+attrName);
		System.out.println("attrAge ============="+attrAge);
		PrintWriter out = response.getWriter();
		out.println("This is OtherServlet");
	}

}
