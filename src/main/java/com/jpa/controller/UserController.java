package com.jpa.controller;

import com.jpa.dao.UserDao;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class UserController extends HttpServlet{
    private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("index.jsp").forward(request,response);
        PrintWriter writer = response.getWriter();
        writer.println("Details Added Successfully..");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
                        throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String email = request.getParameter("email");

        HttpSession session = request.getSession(true);
        try {
            UserDao.register(userName, password,email);

            response.sendRedirect("success");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
