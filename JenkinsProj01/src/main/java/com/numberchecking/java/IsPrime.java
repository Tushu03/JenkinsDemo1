package com.numberchecking.java;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/prime")
public class IsPrime extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		int number=Integer.parseInt(req.getParameter("number"));		
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");		
		int count=0;
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				count++;
				
			}				
		}
		if(count>2)
		{
			RequestDispatcher rd=req.getRequestDispatcher("Number.html");			
			rd.include(req, res);
			pw.println("Not A Prime");			
		}
		else
		{
			RequestDispatcher rd=req.getRequestDispatcher("Number.html");			
			rd.include(req, res);
			pw.println("Prime No");
			
		}
			
			
		
	}
	

}
