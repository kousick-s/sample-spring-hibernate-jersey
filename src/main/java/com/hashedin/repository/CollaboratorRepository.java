package com.hashedin.repository;

import java.util.List;

import com.hashedin.model.Collaborator;
import com.hashedin.model.Project;
import com.hashedin.model.Task;

public interface CollaboratorRepository {
	
	Collaborator addCollaborator(Collaborator task, Long tId);
	List<Task> getAllTasksByUid(Long Uid);
	List<Collaborator>getAllCollaborators();
}
