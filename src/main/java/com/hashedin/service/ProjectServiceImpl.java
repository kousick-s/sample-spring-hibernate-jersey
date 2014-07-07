package com.hashedin.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hashedin.model.Project;
import com.hashedin.model.Task;
import com.hashedin.repository.ProjectRepository;


@Service("projectService")
public class ProjectServiceImpl implements ProjectService{
	
	
	 
	@Autowired
	private ProjectRepository projectRepository;
	 
	@Transactional
    public Project createProject(Project project)
    {
        // Saves the given task object and returns the same.
        projectRepository.createProject(project);
        return project;
    }
	public List<Project> getAllProjects()
    {
        // Returns all the tasks in our system.
        return projectRepository.getAllProjects();
    }

}
