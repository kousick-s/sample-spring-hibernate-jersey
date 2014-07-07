package com.hashedin.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.hashedin.model.Collaborator;
import com.hashedin.model.Project;
import com.hashedin.model.Task;

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
	
	 @Override
	    public List<Project> getAllProjects() {
	        // Returns all the tasks in our system.
	        TypedQuery<Project> query = em.createNamedQuery("Project.findAll", Project.class);
	        List<Project> results = query.getResultList();
	        return results;
	    }
	 
	 public List<Task> getAllTasksByPid(Long pId){
	    	List<Task> results= em.find(Collaborator.class, pId).getTasks();
	    	return results;
	    }

}
