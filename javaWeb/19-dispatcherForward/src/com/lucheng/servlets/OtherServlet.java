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
	
//		System.out.println("request ======="+request);
//		System.out.println("response ======="+response);
		
		PrintWriter out = response.getWriter();
		out.print("OtherServlet Data <br>");
	}

}
