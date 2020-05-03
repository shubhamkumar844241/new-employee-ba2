package com.cts.ba2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.ba2.model.Project;
import com.cts.ba2.repository.ProjectRepository;



@Service
public class ProjectServiceImpl implements IProject{
	
	@Autowired
	ProjectRepository projectRepository;

	
	//to add project detail
	@Override
	public void addProject(Project project) {
		
		projectRepository.save(project);
	}

	
	//to get list of project
	@Override
	public List<Project> listOfProject() {
		// TODO Auto-generated method stub
		return projectRepository.findAll();
	}
	
	
	//to update project details using id
	@Override
	public String updateProject(Long id, Project project) {
		// TODO Auto-generated method stub
		if(projectRepository.findById(id).isPresent()) {
			
			Project existingProject = (Project) projectRepository.findById(id).get();
			existingProject.setProjectName(project.getProjectName());
			existingProject.setProjectOwner(project.getProjectOwner());
			
			projectRepository.save(existingProject);
			
			return "Project with id "+id+" is updated";
		}
		
		else {
			return "Project with id "+id+" is not exist.";
		}
	}
	
	
	//to delete project detail using id
	@Override
	public String deleteProject(Long id) {
		// TODO Auto-generated method stub
		if(projectRepository.findById(id).isPresent()) {
			projectRepository.deleteById(id);
			
			return "project id with "+id+" is deleted";
		}
		
		else {
			return "Project id with "+id+" does not exist";
		}
		
	}
	
}
