package com.xworkz.primeminster;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 3,urlPatterns = "/modi")
public class PrimeMinsterServelet extends HttpServlet {
	
	PrimeMinsterServelet(){
		System.out.println("creating the default constuctor");
	}
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

System.out.println("dopost method is created");
String countryname= req.getParameter("CountryName");
String party = req.getParameter("PARTY");
String age = req.getParameter("age");
String years = req.getParameter("10years");
String times = req.getParameter("times");
Object married= req.getAttribute("married");
Object female= req.getAttribute("female");
req.setAttribute("cm",countryname);
req.setAttribute("pr",party);
req.setAttribute("ag",age);
req.setAttribute("yr",years);
req.setAttribute("tm",times);
req.setAttribute("mr", married);
req.setAttribute("fm", female);

}
}
