package com.cts.ba2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.ba2.exception.EmployeeNotFoundException;
import com.cts.ba2.model.Employee;
import com.cts.ba2.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements iEmployeeService{
	
	@Autowired
	EmployeeRepository employeeRepository;
	

	//to add employee data to the database
	@Override
	public void addEmployee(Employee employee) {
		
		employeeRepository.save(employee);
	}


	//to get the list of employee from database
	@Override
	public List<Employee> listOfEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}
	
	
	//to update the employee detail using its id
	@Override
	public String updateEmployee(Long id, Employee employee) {
		// TODO Auto-generated method stub
		if(employeeRepository.findById(id).isPresent()) {
			
			Employee existingEmployee = employeeRepository.findById(id).get();
			existingEmployee.setEmployeeAddress(employee.getEmployeeAddress());
			existingEmployee.setEmployeeName(employee.getEmployeeName());
			existingEmployee.setEmployeeSalary(employee.getEmployeeSalary());
			existingEmployee.setProjectId(employee.getProjectId());
			
			Employee updatedEmployee = employeeRepository.save(existingEmployee);
			return "Employee with id "+id+" is updated";
		}
		
		else {
			throw new EmployeeNotFoundException("Employee ID : "+id+" Not Found");
			
		}
	}
	
	
	//to delete the employee detail using its id 
	@Override
	public String deleteEmployee(Long id) {
		// TODO Auto-generated method stub
		if(employeeRepository.findById(id).isPresent()) {
			employeeRepository.deleteById(id);
			
			return "Employee id with "+id+" is deleted";
		}
		
		else {
			throw new EmployeeNotFoundException("Employee ID : "+id+" Not Found");
			
		}		
	}
	
	public Employee findById(Long id) {
		
		if(employeeRepository.findById(id).isPresent()) {
			return employeeRepository.findById(id).get();
		}
		else {
			throw new EmployeeNotFoundException("Employee ID : "+id+" Not Found");
		}
	}
	
}
