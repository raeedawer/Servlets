package com.example.Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet( "/sr" )
public class Servlet extends HttpServlet{
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {



        req.getSession().setAttribute("N1",9);
        res.sendRedirect("signup");
    }
}
