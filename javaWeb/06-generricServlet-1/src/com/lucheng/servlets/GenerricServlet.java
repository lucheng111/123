package com.lucheng.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
/**
 * 缺省适配器设计 
 * @author DELL
 *
 */
public abstract class GenerricServlet implements Servlet {
	private ServletConfig config;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public ServletConfig getServletConfig() {
		
		return config;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config=config;

	}
    // 抽象方法  专门让子类实现
	@Override
	public abstract void service(ServletRequest req, ServletResponse res) throws ServletException, IOException;

}
