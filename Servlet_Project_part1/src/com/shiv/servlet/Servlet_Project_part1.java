package com.shiv.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_Project_part1
 */
@WebServlet(description = "My First Servlet program from scratch", urlPatterns = { "/Servlet_Project_part1_path" })
public class Servlet_Project_part1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from GET Method.");
		response.getWriter().println("Hello from Servlet GET method - on the web page");
		
		
	}

}
