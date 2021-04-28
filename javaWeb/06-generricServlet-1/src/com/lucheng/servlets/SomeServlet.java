package com.lucheng.servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SomeServlet extends GenerricServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("执行SomeServlet的service()方法");
		ServletConfig sc = this.getServletConfig();
		String param = sc.getInitParameter("company");
		System.out.println(param);
	}
                                                                
}
