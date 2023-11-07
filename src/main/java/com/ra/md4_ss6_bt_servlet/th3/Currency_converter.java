package com.ra.md4_ss6_bt_servlet.th3;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "currency_converter", value = "/currency_converter")
public class Currency_converter extends HttpServlet {
    @Override
    public void init() {

    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("currency_converter.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       float rate = Float.parseFloat(req.getParameter("rate"));
       float usd = Float.parseFloat(req.getParameter("usd"));
       float vnd = rate * usd ;
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<h1>Rate: " + rate + "</h1>");
        writer.println("<h1>USD: " + usd + "</h1>");
        writer.println("<h1>VND: " + vnd + "</h1>");
        writer.println("</html>");
    }

    @Override
    public void destroy() {

    }

}