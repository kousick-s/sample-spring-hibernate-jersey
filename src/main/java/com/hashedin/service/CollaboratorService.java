package com.hashedin.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.hashedin.model.*;

public interface CollaboratorService {
	@Transactional
	Collaborator addCollaborator(Collaborator collaborator, Long tId);
}
