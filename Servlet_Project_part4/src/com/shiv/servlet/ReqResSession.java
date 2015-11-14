package com.shiv.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ReqResSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String userName = request.getParameter("name");
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		
		if(userName != "" && userName != null){
			session.setAttribute("SavedUserName", userName);
			context.setAttribute("SavedUserName", userName);
		}
		
		out.println("Request parameter has username:" + userName);
		out.println("Session parameter has username:" + (String) session.getAttribute("SavedUserName"));
		out.println("context parameter has username:" + (String) context.getAttribute("SavedUserName"));
		out.println(getInitParameter("Greetings"));
		
	}

}
