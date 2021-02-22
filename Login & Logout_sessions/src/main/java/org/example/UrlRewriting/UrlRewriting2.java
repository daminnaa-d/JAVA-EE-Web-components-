package org.example.UrlRewriting;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class UrlRewriting2 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response){
        try{

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        //getting value from the query string
        String name =request.getParameter("uname");
        out.println("Hello, "+ name + "<br>");
        out.println("Url Rewriting works successfully!");

        out.close();

    }catch(Exception e){System.out.println(e);}
}


}
