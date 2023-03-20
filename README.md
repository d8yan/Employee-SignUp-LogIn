# Project Title

Employee-SignUp-LogIn


-About the Project

This project is a web application for employees to register an account and login to the employee welcome page. It is built using HTML, CSS, Java and connected with MySQL database. The application allows employees to view employee welcome page.


-Navigating the Repo

The repository contains the source code, SQL database schema, and configuration files for the application. 
The main code files are organized in the following folders:

    1.src/main: contains the Java source code files

      src/main/java - contains three folders:
      1) bean: contains an Employee JavaBean class which is corresponding to Employees table in the MySQL database.
      2) dao: contains a DBUtil class provides the functionalities of setting up connection to your MySQL database.
      3) web: contains the HTML and CSS files

    2.sql: contains the SQL schema file


-Guidelines

Before contributing to the project, please read the following guidelines:

  1. All code contributions must follow the Java coding standards and best practices
  2. Avoid using external libraries unless necessary
  3. All pull requests must be reviewed and approved by a project maintainer before merging


-Testing

Here's a process for conducting unit testing for this project:

  1. Set up a testing environment: Create a separate database for testing purposes and configure the application to use this database instead of the production database.

  2. Identify test cases: Identify the key functionality of the application, such as registration, login, and updating personal information. Write test cases for each of these functions.

  3. Write unit tests: Using a unit testing framework such as JUnit, write tests that check the expected behavior of each function. For example, a test for the registration function should check that a new user is created in the database with the correct information.

  4. Run tests: Run the unit tests and ensure that all tests pass. If any tests fail, investigate the issue and fix the code before running the tests again.

  5. Automate testing: To streamline the testing process, consider automating the unit tests using a continuous integration tool like Jenkins or Travis CI. This will ensure that tests are run automatically every time code changes are made, reducing the risk of introducing bugs into the application.

  6. Repeat: As new features are added to the application or bugs are fixed, continue to write new unit tests and run existing tests to ensure that everything is working as expected. This will help to maintain the overall quality and reliability of the application.
   

-Building and Deployment

To build the application, follow these steps:

1. Install Java IDE (i.e. IntelligJ IDEA)
2. Install Java Development Kit (JDK) and Apache Tomcat on your local machine
3. Clone the repository to your local machine
4. Set up a MySQL database and import the hrmanager.sql file
5. Open the project in your IDE and configure the database connection in the DBUtil.java file
6. Build the project using Maven
7. Deploy the application to Tomcat

-LINK for installed project


-Version Control

We use Git for version control. Please follow the Git branching model and create a new branch for each feature or bug fix. Once the changes have been reviewed and tested, merge the branch to the master branch.

-Future Ehancement

We will add the front-end and back-end validation in the future, and more content of the employee welcome page.

--How to Run the Project Locally
To run the application, follow these steps:

1. Deploy the application to Tomcat
2. Run the application
3. Navigate to http://localhost:8080/DongYan_Assignment_3_war_exploded/login in your web browser
4. You will land to login page and click on the "Register" button to create a new account
5. Log in using the credentials you just created
5. Explore the employee welcome page.

--How to Run the Project Online
1.
2.You will land to login page and click on the "Register" button to create a new account
3. Log in using the credentials you just created
4. Explore the employee welcome page.
