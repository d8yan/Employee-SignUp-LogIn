package web;

import bean.Employee;
import dao.DBUtil;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "SignUpServlet",value = "/register")
public class SignUpServlet extends HttpServlet {
    private DBUtil empDao = new DBUtil();

    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("signup.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String email= request.getParameter("emailAddress");
        Date hiredate = null;
        try {
            hiredate = formatter.parse(request.getParameter("hireDate"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        Employee employee = new Employee();

        employee.setUserName(username);
        employee.setPassword(password);
        employee.setFirstName(firstname);
        employee.setLastName(lastname);
        employee.setHireDate(hiredate);
        employee.setEmailAddress(email);

        try {
            empDao.registerEmployee(employee);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        request.setAttribute("loginMessage", "You're successfully signed up! Please login here");
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }
}
