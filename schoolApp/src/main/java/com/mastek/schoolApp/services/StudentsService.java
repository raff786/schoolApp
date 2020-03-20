package com.mastek.schoolApp.services;

import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mastek.schoolApp.api.StudentAPI;
import com.mastek.schoolApp.dao.StudentsJPADAO;
import com.mastek.schoolApp.dao.SubjectJPADAO;
import com.mastek.schoolApp.dao.TeacherJPADAO;
import com.mastek.schoolApp.entities.Students;
import com.mastek.schoolApp.entities.Subjects;
import com.mastek.schoolApp.entities.Teacher;

@Component //marking the class as a bean to be created 
@Scope("singleton") // if it is 'singleton' then it is one object used across test cases
public class StudentsService implements StudentAPI {
	
	@Autowired
	StudentsJPADAO studDAO;
	
	@Autowired
	TeacherJPADAO teachDAO;
	
	@Autowired
	SubjectJPADAO subjectDAO;

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

	@Transactional
	public Students assignStudentsToTeacher(int studId, int teachId) {
		Students stu = studDAO.findById(studId).get();
		Teacher tea = teachDAO.findById(teachId).get();
		
		stu.getTeacherAssigned().add(tea);
		stu = studDAO.save(stu);
		return stu;
	
	}
	
	@Override
	@Transactional
	public Set<Teacher> getStudentsTeachers(int studentId) {
		Students currentStudents = studDAO.findById(studentId).get();
		
		int count = currentStudents.getTeacherAssigned().size();
		System.out.println(count+" Teachers found");
		
		Set<Teacher> teacher = currentStudents.getTeacherAssigned();
		
		return teacher;
	}

	@Override
	@Transactional
	public Teacher registerTeacherforStudents(int studentId, Teacher newTeacher) {
		newTeacher= teachDAO.save(newTeacher);
		assignStudentsToTeacher(studentId, newTeacher.getTeacherId());
		return newTeacher;
	}

	@Transactional
	public Students assignStudentsToSubjects(int studId, int subId) {
		Students stu = studDAO.findById(studId).get();
		Subjects sub = subjectDAO.findById(subId).get();
		
		stu.getSubjectsAssigned().add(sub);
		stu = studDAO.save(stu);
		return stu;
	}
	
	@Override
	@Transactional
	public Set<Subjects> getStudentsSubjects(int studentId) {
		Students currentStudents = studDAO.findById(studentId).get();
		
		int count = currentStudents.getSubjectsAssigned().size();
		System.out.println(count+" Subjects found");
		
		Set<Subjects> subjects = currentStudents.getSubjectsAssigned();
		
		return subjects;
	}

	@Override
	@Transactional
	public Subjects registerSubjectsforStudents(int studentId, Subjects newSubjects) {
		newSubjects= subjectDAO.save(newSubjects);
		assignStudentsToSubjects(studentId, newSubjects.getSubjectId());
		return newSubjects;
	}
	
}