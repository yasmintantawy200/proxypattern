/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author dalia
 */
@WebServlet(urlPatterns = {"/DbTestServlet"})
public class DbTestServlet extends HttpServlet {

   private static final long serialVersionUID = 1L;

  @Override 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String jdbcUrl = "jdbc:mysql://localhost:3306/bookstore";
        String user = "root";
        String password = "admin";

        try {
            out.println("Connecting to database: " + jdbcUrl);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
            out.println("<br>Connection successful");
            connection.close();
        } catch (ClassNotFoundException e) {
            out.println("<br>Class not found: " + e.getMessage());
        } catch (SQLException e) {
            out.println("<br>SQL Exception: " + e.getMessage());
        }

        out.close();
    }
}
