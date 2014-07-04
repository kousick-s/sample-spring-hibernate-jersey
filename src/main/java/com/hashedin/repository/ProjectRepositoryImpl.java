package com.hashedin.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.hashedin.model.Project;

@Repository("projectRepository")
public class ProjectRepositoryImpl implements ProjectRepository{
	 
	
	@PersistenceContext
	    private EntityManager em;
	
	public Project createProject(Project project) {
        // Saves the given task object and returns the same.
        em.persist(project);
        em.flush();
        return project;
    }

}
