package pl.coderslab.web;

import pl.coderslab.dao.AdminDAO;
import pl.coderslab.model.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/register")
public class Register extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/register.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Admin admin = new Admin();
        admin.setFirstName(request.getParameter("first_name"));
        admin.setLastName(request.getParameter("last_name"));
        admin.setEmail(request.getParameter("email"));
        admin.setPassword(request.getParameter("password"));

        AdminDAO adminDAO = new AdminDAO();
        adminDAO.create(admin);
        request.setAttribute("first_name", admin.getFirstName());
        request.setAttribute("last_name", admin.getLastName());
        request.setAttribute("email", admin.getEmail());
        request.setAttribute("password", admin.getPassword());
        request.getRequestDispatcher("/login").forward(request, response);
    }

}
