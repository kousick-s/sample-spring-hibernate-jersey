package com.hashedin.repository;

import java.util.List;

import com.hashedin.model.Task;
import com.hashedin.model.Project;
import com.hashedin.model.Collaborator;

public interface ProjectRepository {
	Project createProject(Project project);
	List<Project>getAllProjects();
	List<Task> getAllTasksByPid(Long Pid);
//	Project getProjectById(Long pId);
//	Project addCollaboratorTOProject(Long pId, Collaborator collaborator);
//	Project addTask(Task task, Long pId);
}
