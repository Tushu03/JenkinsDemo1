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
@WebServlet("/perfect")
public class IsPerfect extends GenericServlet 
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		
		int number=Integer.parseInt(req.getParameter("number"));
		PrintWriter pw=res.getWriter();
		
		int factSum=0;
		for(int i=1;i<=number/2;i++)
		{
			if(number%i==0)
			{
				factSum+=i;
			}
		}
		
		if(factSum==number)
		{
			RequestDispatcher rd=req.getRequestDispatcher("Number.html");
			rd.include(req, res);
			pw.println("Perfect No");
			
		}
		else 
		{
			RequestDispatcher rd=req.getRequestDispatcher("Number.html");
			rd.include(req, res);
			pw.println("Not Perfect No");
			//pw.println("Factor Sum "+factSum);
		}
		
		
		
		
		
		
	}

}
