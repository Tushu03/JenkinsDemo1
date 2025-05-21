package com.numberchecking.java;

import java.io.IOException;


import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/cal")
public class NumberCheck extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		
		
		String numberType=req.getParameter("numbertype");
		
				
		switch(numberType)
		{
		case "Prime" :
		     RequestDispatcher rd=req.getRequestDispatcher("prime");
		     rd.forward(req, res);
		     break;
		     
		case "Palindrome":
			RequestDispatcher rd1=req.getRequestDispatcher("palindrome");
		    rd1.forward(req, res);
		    break;
		    
		case "Armstrong":
			RequestDispatcher rd2=req.getRequestDispatcher("armstr");
		    rd2.forward(req, res);
		    break;
		    
		case "Perfect" :
			RequestDispatcher rd3=req.getRequestDispatcher("perfect");
			rd3.forward(req, res);
			break;
			
			
		
			
		}
			
			
			
		
			
			
			
		}
		
	

}
