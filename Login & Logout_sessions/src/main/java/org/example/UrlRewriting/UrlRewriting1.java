package org.example.UrlRewriting;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class UrlRewriting1 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response){
        try{

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            String name =request.getParameter("name");
            out.print("Welcome, "+ name);

            //appending the username in the query string
            out.print("<a href='UrlRewriting2?uname="+ name + "'><br> visit</a>");

            out.close();

        }catch(Exception e){System.out.println(e);}
    }

}
