package com.mastek.schoolApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mastek.schoolApp.api.StudentAPI;
import com.mastek.schoolApp.dao.StudentsJPADAO;
import com.mastek.schoolApp.entities.Students;

@Component //marking the class as a bean to be created 
@Scope("singleton") // if it is 'singleton' then it is one object used across test cases
public class StudentsService implements StudentAPI {
	
	@Autowired
	StudentsJPADAO studDAO;

	@Override
	public Iterable<Students> listAllStudents() {
		System.out.println("Listing All Students");
		return studDAO.findAll();
	}

	@Override
	public Students findByStudentId(int studentId) {
    return studDAO.findById(studentId).get();
	}

	@Override
	public Students registerNewStudents(Students newStudents) {
		newStudents = studDAO.save(newStudents);
		return newStudents;
	}

	
}
