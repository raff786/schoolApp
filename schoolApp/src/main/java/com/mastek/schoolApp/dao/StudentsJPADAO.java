package com.mastek.schoolApp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mastek.schoolApp.entities.Students;

@Repository
public interface StudentsJPADAO extends
				 CrudRepository<Students, Integer>{
	
}