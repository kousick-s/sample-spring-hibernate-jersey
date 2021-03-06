package com.hashedin.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.hashedin.model.Project;
import com.hashedin.model.Task;

@Repository("taskRepository")
public class TaskRepositoryImpl implements TaskRepository
{

    @PersistenceContext
    private EntityManager em;
    
    public Task find(Long taskId) {
        // Returns the Task for given taskId.
        return em.find(Task.class, taskId);
    }

    public Task addTask(Task task,Long pId) {
        // Saves the given task object and returns the same.
    	Project projectobj=em.find(Project.class, pId);
    	task.setpId(projectobj);
        em.persist(task);
        em.flush();
        return task;
    }

    @Override
    public List<Task> find() {
        // Returns all the tasks in our system.
        TypedQuery<Task> query = em.createNamedQuery("Task.findAll", Task.class);
        List<Task> results = query.getResultList();
        return results;
    }
    
   
    
    
//
//    @Override
//    public Task update(Task task, Long taskId)
//    {
//        // TODO Auto-generated method stub
//        return null;
//    }
//
//    @Override
//    public Task delete(Long taskId)
//    {
//        Task taskToBeDeleted = em.find(Task.class, taskId); 
//        em.remove(taskToBeDeleted);
//        return taskToBeDeleted;
//    }

}
