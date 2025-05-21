package com.numberchecking.java;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/armstr")
public class IsArmStrong extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		
		PrintWriter pw=res.getWriter();
		
		int number=Integer.parseInt(req.getParameter("number"));
		int temp=number;
		
		int digit=0;
		for(int i=1;temp!=0;temp/=10) digit++;
		
		temp=number;
		int sum=0;
		for(int i=1;temp!=0;temp/=10)
		{
			sum+=Math.pow(temp%10, digit);
			
		}
		
		if(sum==number)
		{
			RequestDispatcher rd=req.getRequestDispatcher("Number.html");
			rd.include(req, res);
			pw.println("Armstrong NO");
			
		}
		else 
		{
			RequestDispatcher rd=req.getRequestDispatcher("Number.html");
			rd.include(req, res);
			pw.println("Not Armstrong NO");
		}
		
		
		
	}
	

}
