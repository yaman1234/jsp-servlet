package com.servlet_pack;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DoGet_and_DoPost extends HttpServlet {
	
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int result = (int) req.getAttribute("sum");
		int square = result * result;
		res.getWriter().println("The square is : " + square);
		res.getWriter().println("service");
	}
	
	

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));

		int sum = i + j;

		res.getWriter().println("the sum is : " + sum);
		res.getWriter().println("doGet");
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {

		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));

		int sum = i + j;

		res.getWriter().println("the sum is : " + sum);
		res.getWriter().println("doPost");
	}

}
