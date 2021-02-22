package org.example.LoginLogout;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class ProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();

        request.getRequestDispatcher("link.jsp").include(request, response);

        HttpSession session=request.getSession(false);
        if(session!=null){
            String name=(String)session.getAttribute("name");

            out.print("Hello, "+name+" Welcome to Profile! <br>");
            out.println("<hr> HttpSession works successfully! ");
        }
        else{
            out.print("Please login first");
            request.getRequestDispatcher("login.jsp").include(request, response);
        }


        Cookie ck[]=request.getCookies();
        if(ck!=null){
            String name=ck[0].getValue();
            if(!name.equals("") || name != null){
                out.print("<p> Welcome to Profile </p>");
                out.print("<br> Welcome, " + name);
                out.println("<hr> Cookies work successfully! ");
            }
        }else{
            out.print("Please login first!");
            request.getRequestDispatcher("login.jsp").include(request, response);
        }

        out.close();
    }
}
