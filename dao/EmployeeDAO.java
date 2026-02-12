package com.tap.dao;

import java.util.List;

import com.tap.model.Employee;

public interface EmployeeDAO {

	int insert(Employee e);
	List<Employee> fetchAll();
	int updateEmp(Employee e);
	int deleteEmp(int id);
}
