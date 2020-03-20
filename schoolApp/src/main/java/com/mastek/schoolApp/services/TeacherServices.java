package com.mastek.schoolApp.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mastek.schoolApp.api.TeacherAPI;
import com.mastek.schoolApp.dao.SubjectJPADAO;
import com.mastek.schoolApp.dao.TeacherJPADAO;
import com.mastek.schoolApp.entities.Subjects;
import com.mastek.schoolApp.entities.Teacher;

@Component // marking the class as bean to be created.
@Scope("singleton") // singleton: one object used across test cases, prototype: one object per request.
public class TeacherServices implements TeacherAPI{
	
	@Autowired
	TeacherJPADAO teachDAO;
	
	@Autowired
	SubjectJPADAO subDAO;

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
	
	@Transactional
	public Teacher assignTeacherToSubjects(int teachId, int subId) {
		Teacher tea = teachDAO.findById(teachId).get();
		Subjects sub = subDAO.findById(subId).get();
		
		tea.setCurrentSubjects(sub);
		sub.getTeacher().add(tea);
		
		teachDAO.save(tea);
		subDAO.save(sub);
		
		return tea;
	}

}