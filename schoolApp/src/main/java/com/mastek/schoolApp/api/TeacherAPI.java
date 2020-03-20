package com.mastek.schoolApp.api;

import java.util.Set;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mastek.schoolApp.entities.Teacher;
	
@Path("/schoolapp/") // URL pattern to access the current API Interface.
public interface TeacherAPI {
		
		// http://localhost:7777/hrapp/employees/list
		@GET // we do support http Method: GET
		@Path("/teacher/list") // URL Path to access this method.
		@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML}) // formats which the method supports.
		public Iterable<Teacher> listAllTeacher();
		
		@GET
		@Path("/teacher/find/{teacherId}")
		@Produces({MediaType.APPLICATION_JSON})
		public Teacher findByTeacherId(@PathParam("teacherId") int teacherId);
		
		@POST // http method Post used to send data in requests.
		@Path("/teacher/register")
		@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
		@Produces(MediaType.APPLICATION_JSON)
		public Teacher registerNewTeacher(@BeanParam Teacher newTeacher);
		
		@GET
		@Path("/subjects/teacher/{teacherId}")
		@Produces({MediaType.APPLICATION_JSON})
		public Set<Teacher> getSubjectsTeachers(@PathParam("subjectId") int subjectId);
		
		@POST
		@Path("/subjects/teacher/register")
		@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
		@Produces(MediaType.APPLICATION_JSON)
		public Teacher registerTeacherforSubjects(
				@FormParam("subjectsId") int subjectsId,
				@BeanParam Teacher newTeacher);
		
}