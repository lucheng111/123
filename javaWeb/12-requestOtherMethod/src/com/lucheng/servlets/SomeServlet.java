package com.lucheng.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/some")
public class SomeServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获取请求的URL
		StringBuffer requestURL = request.getRequestURL();
		System.out.println("requestURL ="+requestURL);
		
		//获取请求的URI: URL去掉请求协议及主机后的剩余部分
		String requestURI = request.getRequestURI();
		System.out.println("requestURI ="+requestURI);
		
		
		//2获取当前Web应用的根路径
		String contextPath = request.getContextPath();
		System.out.println("contextPath ="+contextPath);
		
		String method = request.getMethod();
		System.out.println("method ="+method);
		//获取客户端IP
		String remoteAddr = request.getRemoteAddr();
		System.out.println("remoteAddr =" +remoteAddr);
		
		//访问URL精确地址
		String servletPath = request.getServletPath();
		System.out.println("servletPath =" +servletPath);
		
		//访问URL非精确地址
		String pathInfo = request.getPathInfo();
		System.out.println("pathInfo =" +pathInfo);
		
		
	}
}