package org.example.HiddenField;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HiddenServlet2 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        try{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        //Getting the value from the hidden field
        String name =request.getParameter("uname");
        out.println("Hello, "+ name + "<br>");
        out.println("Hidden field works successfully!");

        out.close();
    }catch(Exception e){System.out.println(e);}
}
}
