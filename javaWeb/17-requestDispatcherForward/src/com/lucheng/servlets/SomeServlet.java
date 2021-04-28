package com.lucheng.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SomeServlet
 */
@WebServlet("/some")
public class SomeServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		//解决中文乱码问题
		response.setContentType("text/html;charset=UTF-8");
		
		String age = request.getParameter("age");
		
		System.out.println("name ="+name);
		System.out.println("age ="+age);
		
		//向request域中放入属性
		request.setAttribute("attrName", name);
		request.setAttribute("attrAge", age);
		
		//请求转发
		request.getRequestDispatcher("other").forward(request, response);
		
	}

}




































