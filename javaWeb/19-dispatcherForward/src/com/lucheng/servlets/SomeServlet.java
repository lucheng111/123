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
//		System.out.println("request ="+request);
//		System.out.println("response ="+response);
		
		PrintWriter out = response.getWriter();
		out.print("SomeServlet:forward() before <br>");
		//请求转发
		request.getRequestDispatcher("other").include(request, response);
		out.print("SomeServlet:forward() after <br>");
		
	}

}




































