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
		//response.setCharacterEncoding("UTF-8");
		//设置响应的MIME类型
		//其中可以指定MIME的字符编码，即响应体的字符编码
		response.setContentType("text/html;charset=UTF-8");
		//获取标准输出流
		PrintWriter out = response.getWriter();
//		out.append("abc");
//		out.append("def");
//		out.print("abc");
//		out.println("def");
//		out.print("ghi");
		out.write("www.baidu.com");
		out.write("兰州理工大学");
		
		//对标准输出流的关闭
		out.close();
	}

}
