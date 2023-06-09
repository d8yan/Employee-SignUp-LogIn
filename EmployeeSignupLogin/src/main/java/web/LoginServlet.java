package web;

import dao.DBUtil;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    private DBUtil empDao = new DBUtil();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {
            if(empDao.loginEmployee(username,password)){
                request.setAttribute("username",username);
                request.getRequestDispatcher("success.jsp").forward(request,response);
            }else {

                request.setAttribute("signUpMessage","Username doesn't exist, please create a new one.");
                request.getRequestDispatcher("login.jsp").forward(request,response);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
