package com.lucheng.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/other")
public class OtherServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String pname = request.getParameter("pname");
		request.setCharacterEncoding("UTF-8");
		
		String page = request.getParameter("page");
		
		System.out.println("pname ==========="+pname);
		System.out.println("page ============="+page);
		
		PrintWriter out = response.getWriter();
		out.println("This is OtherServlet");
	}

}
