package com.jpa.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Success extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
                                 throws ServletException, IOException {
        request.getRequestDispatcher("success.jsp").forward(request,response);
    }
}
