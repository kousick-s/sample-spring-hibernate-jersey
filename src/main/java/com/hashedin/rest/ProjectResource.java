package com.hashedin.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hashedin.model.Collaborator;
import com.hashedin.model.Project;
import com.hashedin.model.Task;
import com.hashedin.service.*;

@Component
@Path("/projects")
public class ProjectResource {
	@Autowired
	private ProjectService projectService;
	
	@Autowired
	private TaskService taskService;
	
	@Autowired
	private CollaboratorService collaboratorService;
	
	 @POST
	    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	    public Response createProject(Project project, @Context final HttpServletResponse response) throws URISyntaxException
	    {
	        // Handles POST on /tasks. Creates a new task and adds it into an repository.
	        projectService.createProject(project);
	        response.setStatus(Response.Status.CREATED.getStatusCode());
	        return Response.created(new URI("/projects/" + project.getpId())).build();
	    }
	    
	 @POST
	    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	    @Path("/{pId}/tasks")
	    public Response addTask(Task task, @PathParam("pId") Long pId,@Context final HttpServletResponse response) throws URISyntaxException
	    {
	        // Handles POST on /tasks. Creates a new task and adds it into an repository.
	        taskService.addTask(task,pId);
	        response.setStatus(Response.Status.CREATED.getStatusCode());
	        return Response.created(new URI("/tasks/" + task.gettId())).build();
	    }
	 
	 @POST
	    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	    @Path("/{tId}/collaborators")
	    public Response addCollaborator(Collaborator collaborator, @PathParam("tId") Long tId,@Context final HttpServletResponse response) throws URISyntaxException
	    {
	        // Handles POST on /tasks. Creates a new task and adds it into an repository.
	        collaboratorService.addCollaborator(collaborator,tId);
	        response.setStatus(Response.Status.CREATED.getStatusCode());
	        return Response.created(new URI("/collaborators/" + collaborator.getuId())).build();
	    }
	 @GET
	    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	    public List<Project> getAllProjects()
	    {
	        // Handles GET on /tasks. Lists all the tasks we have in our system.
	        return projectService.getAllProjects();
	    }
	 
	 @GET
	    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	    @Path("tasks/{pId}")
	      public List<Task> getAllTasksByPid(@PathParam("pId") Long pId)
	      {
	          // Handles GET on /tasks. Lists all the tasks we have in our system.
	          return projectService.getAllTasksByPid(pId);
	      }
	 
	 
	 
	 
	 

}
