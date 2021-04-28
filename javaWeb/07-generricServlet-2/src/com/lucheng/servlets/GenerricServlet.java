package com.lucheng.servlets;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
/**
 * 缺省适配器设计 
 * @author DELL
 *
 */
public abstract class GenerricServlet implements Servlet,ServletConfig {
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
	
	@Override
	public String getInitParameter(String name) {
		// TODO Auto-generated method stub
		return config.getInitParameter(name);
	}
	
	@Override
	public Enumeration<String> getInitParameterNames() {
		// TODO Auto-generated method stub
		return config.getInitParameterNames();
	}
	
	@Override
	public ServletContext getServletContext() {
		// TODO Auto-generated method stub
		return config.getServletContext();
	}
	@Override
	public String getServletName() {
		// TODO Auto-generated method stub
		return config.getServletName();
	}
}
