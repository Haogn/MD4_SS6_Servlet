package com.ra.md4_ss6_bt_servlet.th1;

import java.io.*;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ServerTimeServlet", value = "/servertimeservlet")
public class ServerTimeServlet extends HttpServlet {
    private Date date = new Date();
    @Override
    public void init() {
        System.out.println("Khoi tạo Servlet");
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("date", date);
        request.getRequestDispatcher("localTime.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    public void destroy() {

    }

}