package com.example.lesson28htcomplete;

import java.io.*;

import DB.RequestsRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "request-save", value = "/request-save")
public class RequestServlet extends HttpServlet {
    private String name, requestDB;

    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html");

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        name = request.getParameter("name");
        requestDB = request.getParameter("request");

        if (name.isEmpty() || requestDB.isEmpty()) {
            request.getRequestDispatcher("error.jsp").forward(request, response);
        } else {
            RequestsRepository rq = new RequestsRepository();
            rq.DBChange(name, requestDB);
            request.getRequestDispatcher("success.jsp").forward(request,response);
        }
    }

    public void destroy() {
    }
}