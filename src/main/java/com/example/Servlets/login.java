package com.example.Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Objects;
@MultipartConfig()
@WebServlet( "/login" )
public class login extends HttpServlet {



    public void service(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {

        String var1=    request.getParameter("n1");
        String var2=    request.getParameter("n2");



        // response.sendRedirect("/sr");
        HttpSession session=request.getSession();
        session.setAttribute("send","Send Cookie");
        if (!Objects.equals(var1, "")){
            if (!Objects.equals(var2, "")) {
               String cookie = "Login is true";
                String cookieEnc = URLEncoder.encode(cookie, "UTF-8");
                response.addCookie(new Cookie("login", cookieEnc));
            }else {
               String cookie="You didn't  pass password";
                String cookieEnc = URLEncoder.encode(cookie,"UTF-8");
                response.addCookie( new Cookie("Email",cookieEnc));

            }

        }else {
          String  cookie="You didn't  pass Email";
            String cookieEnc = URLEncoder.encode(cookie,"UTF-8");
            response.addCookie( new Cookie("Password",cookieEnc));
        }
        for (Cookie c : request.getCookies()){

        response.getWriter().println("  "+c.getName()+" :  =   "+ URLDecoder.decode(c.getValue(),"UTF-8"));
        }

        response.getWriter().println(var1);
        response.getWriter().println(var2);

    }




}
