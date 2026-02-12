package com.tap.daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tap.dao.EmployeeDAO;
import com.tap.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{

	private static Connection con;

	String insert = "insert into employee (name,email) values(?,?)";
	String all = "select * from employee";
	String update = "UPDATE employee SET name = ?, email = ? WHERE id = ?";
	String delete = "delete from employee where id=?";

	private PreparedStatement pstmt;

	private ResultSet res;

	private int x;

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hibernate","root","Nadheem@35");
			System.out.println("Connection Did");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public int insert(Employee e) {
		try {
			pstmt = con.prepareStatement(insert);
			pstmt.setString(1, e.getName());
			pstmt.setString(2, e.getEmail());
			x = pstmt.executeUpdate();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return x;
	}

	@Override
	public List<Employee> fetchAll() {
		List<Employee> list = new ArrayList<>();
		try {
			pstmt = con.prepareStatement(all);
			res = pstmt.executeQuery();
			while(res.next()) {
				list.add( new Employee(res.getInt("id"),res.getString("name"),res.getString("email")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	public int updateEmp(Employee e) {
		try {
			pstmt = con.prepareStatement(update);
			pstmt.setString(1, e.getName());
			pstmt.setString(2, e.getEmail());
			pstmt.setInt(3, e.getId());
			x = pstmt.executeUpdate();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return x;
	}
	public int deleteEmp(int id) {
		try {
			pstmt = con.prepareStatement(delete);
			pstmt.setInt(1,id);
			x = pstmt.executeUpdate();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return x;
	}

}
