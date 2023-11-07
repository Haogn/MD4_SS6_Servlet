package com.ra.md4_ss6_bt_servlet.bt1;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Products", value = "/products")
public class Products extends HttpServlet {
    public void init() {
        System.out.println("Khoi tao Servlet");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("products.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Double price = Double.valueOf(request.getParameter("price"));
        Double discount = Double.valueOf(request.getParameter("percent"));
        Double discountAmount = price * discount * 0.01 ;
        Double newPrice = price - discountAmount ;
        request.setAttribute("discountAmount",discountAmount );
        request.setAttribute("newPrice",newPrice );
        request.getRequestDispatcher("discount.jsp").forward(request,response);
    }

    public void destroy() {
        System.out.println("Ket thuc Servlet");
    }

}