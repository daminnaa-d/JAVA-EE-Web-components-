package org.example;

import org.example.model.Account;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name="registration",
        urlPatterns = "/registration"
)

public class RegistrationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        Account account = Account.getAccount();
        String firstname = req.getParameter("firstname");
        String lastname = req.getParameter("lastname");
        String email = req.getParameter("email");
        String pswd = req.getParameter("pswd");
        account.setFirstName(firstname);
        account.setLastName(lastname);
        account.setEmail(email);
        account.setPassword(pswd);
        Cookie cookie = new Cookie("name", firstname);
        resp.addCookie(cookie);
        out.print("<form action='login'>");
        out.print("<input type='submit' value='go'>");
        out.print("</form>");
        out.println(account.getFirstName());
        out.println(account.getLastName());
        out.println(account.getEmail());
        out.println(account.getPassword());
        out.close();
    }
}
