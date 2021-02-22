package org.example.LoginLogout;

import org.example.model.Account;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name="login",
        urlPatterns = "/login"
)

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();

        req.getRequestDispatcher("link.jsp").include(req, resp);

        String email = req.getParameter("email");
        String pswd = req.getParameter("pswd");
        Account account = Account.getAccount();
        String name = account.getFirstName();

        if (account.getEmail().equals(email)  && account.getPassword().equals(pswd)){
            out.print("You are successfully logged in!");
            out.print("<br>Welcome, " + name);

            Cookie ck = new Cookie("name",name);
            resp.addCookie(ck);

            HttpSession session=req.getSession();
            session.setAttribute("name",name);
        }else{
            out.print("Error, email or password incorrect!");
            req.getRequestDispatcher("login.jsp").include(req, resp);
        }

        out.close();
    }

}

