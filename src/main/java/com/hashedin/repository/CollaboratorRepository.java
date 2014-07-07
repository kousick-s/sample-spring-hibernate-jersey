package com.hashedin.repository;

import com.hashedin.model.Collaborator;
import com.hashedin.model.Task;

public interface CollaboratorRepository {
	
	Collaborator addCollaborator(Collaborator task, Long tId);

}
