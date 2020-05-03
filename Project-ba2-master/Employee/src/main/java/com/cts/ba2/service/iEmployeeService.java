package com.cts.ba2.service;

import java.util.List;
import java.util.Optional;

import com.cts.ba2.model.Employee;

public interface iEmployeeService {

	public void addEmployee(Employee employee);

	public  List<Employee> listOfEmployee();

	public String updateEmployee(Long id, Employee employee);

	public String deleteEmployee(Long id);
	
	public Employee findById(Long id);
}
