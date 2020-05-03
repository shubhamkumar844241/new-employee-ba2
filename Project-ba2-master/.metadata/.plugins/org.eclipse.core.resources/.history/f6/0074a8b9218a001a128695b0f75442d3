package com.cts.ba2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.ba2.model.Employee;
import com.cts.ba2.service.EmployeeServiceImpl;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeServiceImpl employeeService;
	
	
	//to add employee data to the database
	@PostMapping("/addEmployee")
	public ResponseEntity<Object>addEmployee(@RequestBody Employee employee) {
		
			employeeService.addEmployee(employee);
			return new ResponseEntity<>("Employee is added successfully", HttpStatus.CREATED);
		}
	
	
	//to get the list of employee from database
	@GetMapping("/listOfEmployee")
	public ResponseEntity<Object> listOfEmployee(){
		return new ResponseEntity<>(employeeService.listOfEmployee(), HttpStatus.OK);
	}
	
	
	//to update the employee detail using its id
	@PutMapping("/updateEmployee/{id}")
	public ResponseEntity<Object> updateEmployee(@PathVariable("id") Long id, @RequestBody Employee employee) {
	      
	      employeeService.updateEmployee(id, employee);
	      return new ResponseEntity<>(employeeService.updateEmployee(id, employee), HttpStatus.OK);
	 }
	
	
	//to delete the employee detail using its id 
	@DeleteMapping("/deleteEmployee/{id}")
	public ResponseEntity<Object> deleteEmployee(@PathVariable("id") Long id) {
	      
	      return new ResponseEntity<>(employeeService.deleteEmployee(id), HttpStatus.OK);
	   }
	  
	 

}
