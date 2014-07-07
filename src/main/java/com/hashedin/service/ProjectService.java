package com.hashedin.service;

import java.util.List;

import com.hashedin.model.Task;
import com.hashedin.model.Project;
import com.hashedin.model.Collaborator;

public interface ProjectService {
	Project createProject(Project project);
	List<Project>getAllProjects();
	List<Task> getAllTasksByPid(Long Pid);
//	Project getProjectById(Long pId);
//	Project addCollaboratorTOProject(Long pId, Collaborator collaborator);
	
}
