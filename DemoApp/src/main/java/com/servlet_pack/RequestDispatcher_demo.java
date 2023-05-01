package com.servlet_pack;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestDispatcher_demo extends  HttpServlet{

	/*
	 * How to call another servlet from the servlet ?
	 * In this example this servlet will call the "/get_and_post" servlet and pass the "sum" Attribute
	 * 
	 * How to share data between two servlets ?
	 *	use setAttribute("Key", "value") and RequestDispatcher to send the data
	 *	use getAttribute method to fetch the data 
	 * 
	 * 
	 * 
	*/
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));

		int sum = i + j;

//		res.getWriter().println("the sum is : " + sum);
//		res.getWriter().println("doGet");
		
		req.setAttribute("sum", sum);
		
		RequestDispatcher rd = req.getRequestDispatcher("get_and_post");
		rd.forward(req, res);
	}
	
	
	
	
}
