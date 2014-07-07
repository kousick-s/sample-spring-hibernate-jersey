package com.hashedin.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.hashedin.model.Project;
import com.hashedin.model.Task;
import com.hashedin.model.Collaborator;

@Repository("collaboratorRepository")
public class CollaboratorRepositoryImpl implements CollaboratorRepository
{

    @PersistenceContext
    private EntityManager em1;
    
    

    public Collaborator addCollaborator(Collaborator collaborator,Long tId) {
        // Saves the given task object and returns the same.
    	
    	Task taskobj=em1.find(Task.class, tId);
    	taskobj.settAssignedUser(collaborator);
        em1.persist(collaborator);
        em1.flush();
        
        return collaborator;
    }
}