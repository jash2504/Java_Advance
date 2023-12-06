package com;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;
import java.io.IOException;
import java.io.PrintWriter;

public class Background extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String name = req.getParameter("name");
        String password = req.getParameter("password");

        if (name.equals("dhairya") && password.equals("123")) {
            HttpSession httpSession = req.getSession();
            httpSession.setAttribute("user", "dhairya");

            httpSession.setMaxInactiveInterval(30);
            resp.sendRedirect("WelcomeJSP.jsp");
        } else {
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.html");
            rd.include(req, resp);
            out.print("Error");
        }

    }
}
