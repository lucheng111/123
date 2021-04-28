package com.lucheng.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/some")
public class SomeServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//向请求中放入属性
		request.setAttribute("company", "小路路是最棒的");
		request.setAttribute("address", "甘肃庆阳");
		
		//从请求中删除指定域属性
		request.removeAttribute("address");
		
		//将请求转发给OtherServlet
		request.getRequestDispatcher("/otherServlet").forward(request, response);
	}

}
