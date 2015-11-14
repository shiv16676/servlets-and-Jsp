package com.shiv.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		out.print("Hello from the GET method" + " "+ userName + "!!");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		String fullName = request.getParameter("fullName");
		out.print("Hello from the POST method" + " "+ userName + "Your Full name is:" + " " + fullName);
		
		String prof = request.getParameter("prof");
		out.println("You are a " + prof + "\n");
		
		
		//String location = request.getParameter("location");
		String [] location = request.getParameterValues("location");
		out.println("You are at " + location.length + "Places");
		
		for(int i=0;i<location.length;i++){
			out.print(location[i] + "\n");
		}
	}
	
}
