package com.ra.md4_ss6_bt_servlet.th2;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "simple_login", value = "/simple_login")
public class Simple_login extends HttpServlet {
    Boolean flag;
    @Override
    public void init() {
        flag = false ;
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("simpleLogin.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if ( username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
            flag = true ;
        }

        request.setAttribute("flag", flag);
        request.getRequestDispatcher("success.jsp").forward(request,response);
    }

    @Override
    public void destroy() {
        flag = false;
    }

}