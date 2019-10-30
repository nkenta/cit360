/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UrlConnection;

import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


/**
 *
 * @author Nkenta Uchechukwu
 */
public class UrlConnection {
    
    public static void main(String[] args) throws Exception {
      
    /* This will get the HTTURLConnection.
       This is done with the help of URL.openConnection() 
       Which then returns the result to HTTPURLConnection. */    
    URL url = new URL("http://www.java2s.com");
    
    /* Making a request and connection. */    
    HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
    
    urlConnection.setDoOutput(true);
    OutputStreamWriter writer;
        writer = new OutputStreamWriter(urlConnection.getOutputStream());
    
    /* This handles the output from the outputstream*/    
    writer.write("value=1&anotherValue=1");
    writer.flush();
    String line;
    
    /* Reading the response. */    
    BufferedReader reader;
        reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
    
    /* A conditional statement to handle the output */
    while ((line = reader.readLine()) != null) {
      System.out.println(line);
    }
    writer.close();
    reader.close();
    
    /* End connection */     
    urlConnection.disconnect();
  }
}
