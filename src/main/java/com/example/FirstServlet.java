package com.example;

import java.io.IOException;
import java.nio.channels.AcceptPendingException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int i=0 ;
		for (i = 0 ; i <= 5 ; i++)
		{
			Random rand = new Random();
			int numException = (rand.nextInt(4)+1);
			numException=numException+1;
				
			Exception theException =  new Exception("i'm the default one");
			
			try 
			{
				if (numException == 1)
				{
					Exception e = new Exception("first Exception");
					throw e;
				}	
				else if (numException == 2) 
				{
					NullPointerException e = new NullPointerException("this is null pointer exception");
					throw e;
				}
				else if (numException == 3) 
				{
					IOException e = new IOException("this is io exception");
					throw e;
				}
				else if (numException == 4) 
				{
					ArithmeticException e = new ArithmeticException("this is Arithmetic Exception");
					throw e;
				}
			}
	
			catch (NullPointerException e1) 
			{
				theException = e1 ;
			}
			catch (IOException e2)
			{
				theException = e2 ;
			}		
			catch (ArithmeticException e3)
			{
				theException = e3 ;
			}
			catch (Exception e3) 
			{
				try 
				{
					throw new AcceptPendingException();
				} 
				catch (Exception e4) 
				{
					e4.printStackTrace();
				}
				theException = e3 ;
			}
			
			try 
			{
				throw new Exception (theException);
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
