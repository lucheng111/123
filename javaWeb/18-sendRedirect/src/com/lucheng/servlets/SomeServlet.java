package com.lucheng.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

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
		
		String age = request.getParameter("age");
		
		System.out.println("name ="+name);
		System.out.println("age ="+age);
		
		//重定向
		response.sendRedirect("other?pname="+ name + "&page ="+age);
		
	}

}




































