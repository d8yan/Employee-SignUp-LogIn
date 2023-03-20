package dao;

import bean.Employee;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class DBUtil {


    public int registerEmployee (Employee emp) throws ClassNotFoundException {
        String INSERT_USERS = "INSERT INTO employee (userName, password,firstName,lastName,emailAddress,hireDate) VALUES (?,?,?,?,?,?)";
        int result =0;
        Class.forName("com.mysql.jdbc.Driver");

        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hrmanager","root","1234");
                PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS))
        {

            preparedStatement.setString(1,emp.getUserName());
            preparedStatement.setString(2,emp.getPassword());
            preparedStatement.setString(3,emp.getFirstName());
            preparedStatement.setString(4,emp.getLastName());
            preparedStatement.setString(5,emp.getEmailAddress());
            preparedStatement.setDate(6,new java.sql.Date(emp.getHireDate().getTime()));

            result = preparedStatement.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }

        return result;
    }
    public boolean loginEmployee (String username, String password) throws ClassNotFoundException {
        String SELECT_USER = "SELECT * FROM employee WHERE username='" + username + "' and password='" + password + "'";
        ResultSet result=null;
        Class.forName("com.mysql.jdbc.Driver");

        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hrmanager","root","1234");
                Statement stmt = connection.createStatement()){

            result = stmt.executeQuery(SELECT_USER);
            if (result.next()){

               return true;
            }

        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return false;
    }
}

