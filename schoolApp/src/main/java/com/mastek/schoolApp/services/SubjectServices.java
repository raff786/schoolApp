package com.mastek.schoolApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mastek.schoolApp.api.SubjectsAPI;
import com.mastek.schoolApp.dao.SubjectJPADAO;
import com.mastek.schoolApp.entities.Subjects;

@Component
@Scope("singleton")
public class SubjectServices implements SubjectsAPI{
	
	@Autowired
	SubjectJPADAO subjectDAO;

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

}
