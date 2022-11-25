package com.example.create_website_login_show_greeting;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet_login_greeting", value = "/Servlet_login_greeting")
public class Servlet_login_greeting extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String userName = request.getParameter("username");
        String passWord = request.getParameter("password");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Log In</h1>");
        if (userName.equals("admin") && passWord.equals("admin")) {
            out.println("<h1>Hello admin to server</h1>");
        } else {
            out.println("<h1>GET OUT BAD GUY</h1>");
        }
        out.println("</body></html>");
    }
}
