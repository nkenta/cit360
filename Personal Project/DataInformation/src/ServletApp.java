import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import dataModel.Data;

import java.io.PrintWriter;

public class ServletApp extends HttpServlet { 
  protected void doGet(HttpServletRequest request, 
      HttpServletResponse response) throws ServletException, IOException 
  {
    // read user input
    String firstName = request.getParameter("firstName"); 
    String middleName = request.getParameter("middleName"); 
    String surName = request.getParameter("surName"); 
    String age = request.getParameter("age"); 
    String email = request.getParameter("email"); 
    String occupation = request.getParameter("occupation"); 
    String location = request.getParameter("location"); 
    
    // begins Hibernate
    Configuration cfg = new Configuration();
    cfg.configure("Hibernate.cfg.xml");
    SessionFactory factory = cfg.buildSessionFactory();
    Session session = factory.openSession();
	
    // write data class
    Data data = new Data();
    data.setFirstName(firstName);
    data.setMiddleName(middleName);
    data.setSurName(surName);
    data.setAge(age);
    data.setEmail(email);
    data.setOccupation(occupation);
    data.setLocation(location);
    
    // write to MySQL
    Transaction tr = session.beginTransaction();
    session.save(data);
    System.out.println("Success! User's information saved!");
    tr.commit();
    session.close();
    factory.close();    
	
    // read from data
    firstName = data.getFirstName();
    middleName = data.getMiddleName();
    surName = data.getSurName();
    age = data.getAge();
    email = data.getEmail();
    occupation = data.getOccupation();
    location = data.getLocation();
    
    // read again from Data.java class and make a print 
    System.out.println ("First Name is stored in class: "+ data.getFirstName() ); 
    System.out.println ("Middle Name is stored in class: "+ data.getMiddleName() ); 
    System.out.println ("Surname is stored in class: "+ data.getSurName() ); 
    System.out.println ("Age is stored in class: "+ data.getAge() ); 
    System.out.println ("Email is stored in class: "+ data.getEmail() ); 
    System.out.println ("Occupation is stored in class: "+ data.getOccupation() ); 
    System.out.println ("Location is stored in class: "+ data.getLocation() ); 
    
    // Data information is displayed on the localhost
    PrintWriter out = response.getWriter();
    out.println (
      "<!DOCTYPE html>\n" +
      "<html> \n" +
        "<head> \n" +
          "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"> \n" +
          "<title>Data Information</title> \n" +
        "</head> \n" +
        "<body> \n" +
          "First Name: " + firstName + "<br /> \n" +
          "Middle Name: " + middleName + "<br /> \n" +
          "SurName: " + surName + "<br /> \n" +
          "Age: " + age + "<br /> \n" +
          "Email: " + email + "<br /> \n" +
          "Occupation: " + occupation + "<br /> \n" +
          "Location: " + location + "<br /> \n" +
        "</body> \n" +
      "</html>" 
    );  
  }  
}
