JDBC CRUD Web Application
Description
This is a Java web application built using JSP, Servlets, and JDBC that demonstrates CRUD (Create, Read, Update, Delete) operations on a MySQL database. The application allows users to manage employee records with functionalities to add, view, update, and delete employees.
The project is structured as a standard Dynamic Web Project and can be deployed on Apache Tomcat.
________________________________________
Features
Create: Add a new employee with name and email.
Read: View all employees in a tabular format.
Update: Update an employee’s name or email.
Delete: Remove an employee from the database.
Session Management: Uses HTTP session to store and retrieve employee list.
Responsive UI: Clean HTML tables with simple CSS styling.
________________________________________
Technologies Used
Java (Servlets, JSP)
JDBC (Java Database Connectivity)
MySQL (Relational Database)
Apache Tomcat (Server)
HTML/CSS (Front-end)
________________________________________
Database Setup
Create a MySQL database named hibernate (or your preferred name).
Create an employee table:
CREATE TABLE employee (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL
);
Update the database connection in EmployeeDAOImpl.java:
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hibernate","root","your_password");
________________________________________
How to Run
Import the project into Eclipse as a Dynamic Web Project.
Add MySQL JDBC Driver to the project build path.
Deploy the project on Apache Tomcat.
Access the application in a browser:
http://localhost:8080/JDBC_CRUD_WebApp/
Use the web interface to add, update, or delete employees.
________________________________________
Project Structure
JDBC_CRUD_WebApp/
├── src/
│   └── com.tap.model
│   └── com.tap.dao
│   └── com.tap.daoimpl
│   └── com.tap.servlet
├── WebContent/
│   └── display.jsp
│   └── addEmployee.jsp
│   └── updateEmployee.jsp
│   └── WEB-INF/
│       └── web.xml
├── .gitignore
└── README.md
________________________________________
Author
SHAIK NADHEEM – Developer | Java Enthusiast

