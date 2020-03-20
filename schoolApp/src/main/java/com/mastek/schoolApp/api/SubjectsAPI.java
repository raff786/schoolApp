package com.mastek.schoolApp.api;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mastek.schoolApp.entities.Subjects;

@Path("/schoolapp/")
public interface SubjectsAPI {
	
	@GET  
	@Path("/subject/list")   
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML}) 
	public Iterable<Subjects> listAllSubjects();
	
	@GET
	@Path("/subject/find/{subjectId}")
	@Produces({MediaType.APPLICATION_JSON})
	public Subjects findBysubjectId(@PathParam("subjectId")int subjectId);
	
	@POST // http method Post used to send data in requests.
	@Path("/subject/register")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public Subjects registerNewSubjects(@BeanParam Subjects newSubjects);

}
