/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nkenta Uchechukwu
 */
public class JavaServlet extends HttpServlet {

    // Create a request for HttpServelet
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* Print out lines of html tags/ This is the structure of the page*/
            out.println("<!doctype html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Welcome | Home for Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Here you see the beauty of JavaServlet</h1>");
            out.println("<h2>Load JavaServlet" + request.getContextPath() + "</h2>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // For HTTP "GET"
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    // For HTTP "POST
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    // Get servelet infomation to return the written word "Servlet Complete"
    public String getServletInfo() {
        return "Servlet Complete";
    }
}
