package ua.kpi.tef.controller;

import ua.kpi.tef.model.Database;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.*;
//import java.sql.Driver;


public class Servlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        processRequest(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            Database db = new Database();
            int users_amount = db.users_amount();
            request.setAttribute("usersAmount", users_amount);
            request.setAttribute("tariffs", db.tariffSortedByMonthPrice());
            request.setAttribute("tariffsByFilter", db.tariffSortedByFilter());
        } catch (SQLException e) {
        }

        String path = request.getRequestURI();
        path = path.replaceAll("./*", "");
        request.getRequestDispatcher(path).forward(request, response);
    }
}
