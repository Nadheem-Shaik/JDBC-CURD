	<%@ page language="java" contentType="text/html; charset=UTF-8"
		pageEncoding="UTF-8"%>
	
	<!DOCTYPE html>
	<html>
	<head>
	    <title>Employee Form</title>
	    <style>
	        body {
	            font-family: Arial, sans-serif;
	        }
	        table {
	            border-collapse: collapse;
	            width: 50%;
	            margin: auto; /* centers the table */
	        }
	        th, td {
	            border: 1px solid #000;
	            padding: 12px 20px;  /* increased padding */
	            text-align: center;   /* center text */
	        }
	        input[type="text"] {
	            width: 90%;
	            padding: 6px;
	        }
	        input[type="submit"] {
	            padding: 8px 16px;
	            font-size: 16px;
	            cursor: pointer;
	        }
	        h2 {
	            text-align: center;
	        }
	    </style>
	</head>
	<body>
	
	    <h2>Update Employee</h2>
	    <%
        // Get data from query parameters (URL)
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
    %>
	    <form action="updateServlet" method="post">
	        <table>
	            <tr>
	                <td>Id:</td>
	                <td><input type="text" name="id" required value="<%=id%>" readonly="readonly"/></td>
	            </tr>
	            <tr>
	                <td>Name:</td>
	                <td><input type="text" name="name" required value="<%=name%>"/></td>
	            </tr>
	            <tr>
	                <td>Email:</td>
	                <td><input type="text" name="email" required value="<%=email%>"/></td>
	            </tr>
	            <tr>
	                <td colspan="2">
	                    <input type="submit" value="Update" />
	                </td>
	            </tr>
	        </table>
	    </form>
	
	</body>
	</html>
