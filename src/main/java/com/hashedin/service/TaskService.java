package com.hashedin.service;

import java.util.List;

import com.hashedin.model.Task;

public interface TaskService {

 //Task find();
  List<Task> find();
//  Task createTask(Task task);
//  Task getAllTasksByStatus(String tStatus);
	Task addTask(Task task, Long pId);
	
	
}
