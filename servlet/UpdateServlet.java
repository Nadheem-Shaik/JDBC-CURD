package com.tap.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tap.dao.EmployeeDAO;
import com.tap.daoimpl.EmployeeDAOImpl;
import com.tap.model.Employee;

@WebServlet("/updateServlet")
public class UpdateServlet extends HttpServlet {

	private PrintWriter pw;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		pw = resp.getWriter();

		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		Employee e = new Employee(id,name, email);
		EmployeeDAO empdao = new EmployeeDAOImpl();
		HttpSession session = req.getSession();

		int x = empdao.updateEmp(e);
		List<Employee> list = empdao.fetchAll();
		session.setAttribute("list", list);
		if(x==1) {
			resp.sendRedirect("display.jsp");
		}else {
			pw.print("Exception");
		}


	}
}
