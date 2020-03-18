package com.mastek.schoolApp.api;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mastek.schoolApp.entities.Students;

@Path("/schoolapp/")
public interface StudentAPI {
	// http://localhost:7777/schoolapp/students/list
		@GET	// this is to let us know we do support the Http method:GET
		@Path("/students/list") 	// this is the URL path to access this method
		@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})	// these are the formats which the methods support
		public Iterable<Students> listAllStudents();
		
		@GET	//http method
		@Path("/students/find/{studentId}")	// url with parameter format
		@Produces({MediaType.APPLICATION_JSON})
		public Students findByStudentId(@PathParam("studentId")int studentId);
		
		@POST // http method allows you to send data in requests
		@Path("/students/register")
		@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
		@Produces(MediaType.APPLICATION_JSON)
		public Students registerNewStudents(@BeanParam Students newStudents);
}
