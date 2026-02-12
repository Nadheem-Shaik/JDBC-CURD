<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="com.tap.model.Employee"%>

<!DOCTYPE html>
<html>
<head>
<title>Employee List</title>
<style>
body {
	font-family: Arial, sans-serif;
}

table {
	border-collapse: collapse;
	width: 60%;
	margin: auto;
}

th, td {
	border: 1px solid #000;
	padding: 12px 20px; /* increased padding */
	text-align: center; /* center text */
}

th {
	background-color: #f2f2f2;
}

a {
	text-decoration: none;
	color: blue;
}

a:hover {
	color: red;
}

h2 {
	text-align: center;
}
</style>
</head>
<body>

	<h2>All Employees</h2>

	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th colspan="2">Action</th>
		</tr>

		<%
		List<Employee> list = (List<Employee>) session.getAttribute("list");

		if (list != null && !list.isEmpty()) {
			for (Employee emp : list) {
		%>
		<tr>
			<td><%=emp.getId()%></td>
			<td><%=emp.getName()%></td>
			<td><%=emp.getEmail()%></td>
			<td><a
				href="update.jsp?id=<%=emp.getId()%>&name=<%=emp.getName()%>&email=<%=emp.getEmail()%>">Update</a></td>
			<td><a href="deleteServlet?id=<%=emp.getId()%>">Delete</a></td>
		</tr>
		<%
		}
		} else {
		%>
		<tr>
			<td colspan="5">No Employees Found</td>
		</tr>
		<%
		}
		%>
	</table>

</body>
</html>
