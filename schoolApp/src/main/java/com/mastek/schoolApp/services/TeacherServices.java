package com.mastek.schoolApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mastek.schoolApp.api.TeacherAPI;
import com.mastek.schoolApp.dao.TeacherJPADAO;
import com.mastek.schoolApp.entities.Teacher;

@Component // marking the class as bean to be created.
@Scope("singleton") // singleton: one object used across test cases, prototype: one object per request.
public class TeacherServices implements TeacherAPI{
	
	@Autowired
	TeacherJPADAO teachDAO;

	@Override
	public Iterable<Teacher> listAllTeacher() {
		System.out.println("Listing all Teachers");
		return teachDAO.findAll();
	}

	@Override
	public Teacher findByTeacherId(int teacherId) {
		return teachDAO.findById(teacherId).get();
	}

	@Override
	public Teacher registerNewTeacher(Teacher newTeacher) {
		newTeacher = teachDAO.save(newTeacher);
		return newTeacher;
	}

}
