package com.mastek.schoolApp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mastek.schoolApp.entities.Subjects;
@Repository
public interface SubjectJPADAO extends CrudRepository<Subjects, Integer>{


}
