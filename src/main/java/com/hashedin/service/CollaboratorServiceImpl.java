package com.hashedin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hashedin.model.*;
import com.hashedin.repository.*;


@Service("collaboratorService")
public class CollaboratorServiceImpl implements CollaboratorService
{
	 @Autowired
	 
	    private CollaboratorRepository collaboratorRepository;
	 @Transactional
	 public Collaborator addCollaborator(Collaborator collaborator, Long tId)
	    {
	        // Saves the given task object and returns the same.
	        collaboratorRepository.addCollaborator(collaborator,tId);
	        return collaborator;
	    }
	 
	 public List<Task> getAllTasksByUid(Long Uid)
	    {
	        // Returns all the tasks in our system.
	        return collaboratorRepository.getAllTasksByUid(Uid);
	    }
	 public List<Collaborator>getAllCollaborators(){
		 return collaboratorRepository.getAllCollaborators();
	 }
	 
}
