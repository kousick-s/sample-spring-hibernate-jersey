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

import com.hashedin.model.*;
import com.hashedin.service.CollaboratorService;


@Component
@Path("/collaborators")
public class CollaboratorResource
{

    @Autowired
    private CollaboratorService collaboratorService;
    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Path("/{uId}")
      public List<Task> getAllTasksByUid(@PathParam("uId") Long uId)
      {
          // Handles GET on /tasks. Lists all the tasks we have in our system.
          return collaboratorService.getAllTasksByUid(uId);
      }

}
