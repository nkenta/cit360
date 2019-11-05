/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

/**
 *
 * @author Nkenta Uchechukwu 
 */
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Web_Login extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse  res)throws ServletException, IOException
	{
            try (PrintWriter pw = res.getWriter()) {
                res.setContentType("text/html");
                
                String user=req.getParameter("userName");
                String pass=req.getParameter("password");
                pw.println("You have successfuly loggedIn!");
                
                if(user.equals("byui") && pass.equals("byui"))
                    pw.println("You have successfuly loggedIn!");
                else
                    pw.println("Sorry! Your login was not successful");
            }
			
	}

}
