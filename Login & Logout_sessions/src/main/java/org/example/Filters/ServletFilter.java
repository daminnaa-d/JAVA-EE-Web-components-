package org.example.Filters;

import org.example.model.Account;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;

public class ServletFilter implements Filter {

    FilterConfig config;

    public void init(FilterConfig config) throws ServletException {
        this.config=config;
    }

    public void doFilter(ServletRequest req, ServletResponse resp,
                         FilterChain chain) throws IOException, ServletException {

        PrintWriter out=resp.getWriter();
        resp.setContentType("text/html");


        String permission = config.getInitParameter("permission");
        Account account = Account.getAccount();
        String email = req.getParameter("email");
        String pswd = req.getParameter("pswd");

        if(permission.equalsIgnoreCase("true" )){

            if (account.getEmail().equals(email)  && account.getPassword().equals(pswd)){
                out.println("You are logged in! ");
                out.println("You can enter to the account!");
                chain.doFilter(req, resp);
            }else {
                out.println("Wrong data!");
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("login.jsp");
                requestDispatcher.include(req, resp);
            }

        }else {
            out.println("You don't have an access!");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
            requestDispatcher.include(req, resp);
        }
        out.close();
    }
    public void destroy() {}
}
