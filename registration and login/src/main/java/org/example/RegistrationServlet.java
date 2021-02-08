package org.example;

import org.example.model.Account;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
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
        account.setFirstName(req.getParameter("firstname"));
        account.setLastName(req.getParameter("lastname"));
        account.setEmail(req.getParameter("email"));
        account.setPassword(req.getParameter("pswd"));
        out.println(account.getFirstName());
        out.println(account.getLastName());
        out.println(account.getEmail());
        out.println(account.getPassword());
        out.close();
    }
}
