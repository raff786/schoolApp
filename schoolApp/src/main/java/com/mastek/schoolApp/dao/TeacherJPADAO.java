package com.mastek.schoolApp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mastek.schoolApp.entities.Teacher;

@Repository // declare the DAO layer as repository to manage Data operations.
public interface TeacherJPADAO extends CrudRepository<Teacher, Integer>{

}
