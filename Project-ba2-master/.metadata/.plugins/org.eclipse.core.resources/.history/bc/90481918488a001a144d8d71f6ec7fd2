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

import com.cts.ba2.model.Project;
import com.cts.ba2.service.ProjectServiceImpl;

@RestController
public class ProjectController {

	@Autowired
	ProjectServiceImpl projectService;
	
	
	//to add project detail
	@PostMapping("/addProject")
	public ResponseEntity<Object> addProject(@RequestBody Project project) {
		
		projectService.addProject(project);
			return new ResponseEntity<>("Project is added successfully", HttpStatus.CREATED);
		}
	
	
	//to get list of project
	@GetMapping("/listOfProject")
	public ResponseEntity<Object> listOfProject(){
		return new ResponseEntity<>(projectService.listOfProject(), HttpStatus.OK);
	}
	
	

	//to update project details using id
	@PutMapping("/updateProject/{id}")
	public ResponseEntity<Object> updateProject(@PathVariable("id") Long id, @RequestBody Project project) {
	      
	      projectService.updateProject(id, project);
	      return new ResponseEntity<>(projectService.updateProject(id, project), HttpStatus.OK);
	 }
	
	
	//to delete project detail using id
	@DeleteMapping("/deleteProject/{id}")
	public ResponseEntity<Object> deleteProject(@PathVariable("id") Long id) {
	      
	      return new ResponseEntity<>(projectService.deleteProject(id), HttpStatus.OK);
	   }
	  
	 

}
