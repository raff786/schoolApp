package com.mastek.schoolApp.services;

import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mastek.schoolApp.api.SubjectsAPI;
import com.mastek.schoolApp.dao.SubjectJPADAO;
import com.mastek.schoolApp.dao.TeacherJPADAO;
import com.mastek.schoolApp.entities.Subjects;
import com.mastek.schoolApp.entities.Teacher;

@Component
@Scope("singleton")
public class SubjectServices implements SubjectsAPI{
	
	@Autowired
	SubjectJPADAO subjectDAO;
	
	@Autowired
	TeacherJPADAO teachDAO;

	@Override
	public Iterable<Subjects> listAllSubjects() {
		return subjectDAO.findAll();
	}

	@Override
	public Subjects findBysubjectId(int subjectId) {
		// TODO Auto-generated method stub
		return subjectDAO.findById(subjectId).get();
	}

	@Override
	public Subjects registerNewSubjects(Subjects newSubjects) {
		newSubjects= subjectDAO.save(newSubjects);
		return newSubjects;
	}
	
	@Transactional
	public Subjects assignSubjectsToTeacher(int subId, int teachId) {
		Subjects sub = subjectDAO.findById(subId).get();
		Teacher tea = teachDAO.findById(teachId).get();
		
		sub.getTeacher().add(tea);
		sub = subjectDAO.save(sub);
		return sub;
	}

	@Override
	@Transactional
	public Set<Teacher> getSubjectsTeachers(int subjectId) {
		Subjects currentSubjects = subjectDAO.findById(subjectId).get();
		
		int count = currentSubjects.getTeacher().size();
		System.out.println(count+" Teachers found");
		
		Set<Teacher> teachers = currentSubjects.getTeacher();
		
		return teachers;
	}

	@Override
	@Transactional
	public Teacher registerTeacherforSubjects(int subjectsId, Teacher newTeacher) {
		newTeacher= teachDAO.save(newTeacher);
		assignSubjectsToTeacher(subjectsId, newTeacher.getTeacherId());
		return newTeacher;
	}

}
