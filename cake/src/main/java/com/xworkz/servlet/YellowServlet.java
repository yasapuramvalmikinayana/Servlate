package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 9,urlPatterns = "/yellow")
public class YellowServlet extends HttpServlet {
	public YellowServlet() {
		System.out.println("default constructor created");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("yellowsevlet is created");
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.append("<html><head><body bgcolor='yellow;'><h2 style='color:black;'>"+"Idi yellow").append("</h2></body></head></html>");
	}

}
