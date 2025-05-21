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
@WebServlet("/palindrome")
public class IsPalindrome extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		
		int number=Integer.parseInt(req.getParameter("number"));
		int temp=number;
		int rev=0,rem=0;
		PrintWriter pw=res.getWriter();
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp/=10;
			
		}
		if(rev==number)
		{
			RequestDispatcher rd=req.getRequestDispatcher("Number.html");					
			rd.include(req, res);		
			pw.println("Palindrome No ");	
		}
		else {
			RequestDispatcher rd=req.getRequestDispatcher("Number.html");
					
			rd.include(req, res);
			pw.println("Not a Palindrome");	
			
		}
		

		
		
		
	}

}
