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
        name="login",
        urlPatterns = "/login"
)

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        Account account = Account.getAccount();
        String email = req.getParameter("email");
        String pswd = req.getParameter("pswd");
        if (account.getEmail().equals(email)  && account.getPassword().equals(pswd)){
            out.println("You are logged in!");
        }else {
            out.println("Wrong data!");
        }
        out.close();
    }
}
