package com.mastek.schoolApp.entities;

import java.beans.Transient;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name="JPA_Teacher")
public class Teacher {
	int teacherId;
	
	@FormParam("teacherName")
	String teacherName;
	
	@FormParam("gender")
	Gender gender;
	
	@FormParam("teacherEmail")
	String teacherEmail;
	
	@FormParam("department")
	Department department;
	
	@FormParam("position")
	Position position;
	
	@FormParam("salary")
	Salary salary;
	
	Subjects currentSubjects;
	
	@ManyToOne
	@JoinColumn(name="fk_subject_id")
	@Transient
	@XmlTransient
	public Subjects getCurrentSubjects() {
		return currentSubjects;
	}
	
	public void setCurrentSubjects(Subjects currentSubjects) {
		this.currentSubjects = currentSubjects;
	}
	
	@Id
	@Column(name="Teacher_Id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	
	@Enumerated(EnumType.STRING)
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getTeacherEmail() {
		return teacherEmail;
	}
	public void setTeacherEmail(String teacherEmail) {
		this.teacherEmail = teacherEmail;
	}
	
	@Enumerated(EnumType.STRING)
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	@Enumerated(EnumType.STRING)
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	
	@Enumerated(EnumType.STRING)
	public Salary getSalary() {
		return salary;
	}
	public void setSalary(Salary salary) {
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + teacherId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		if (teacherId != other.teacherId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", gender=" + gender
				+ ", teacherEmail=" + teacherEmail + ", department=" + department + ", position=" + position
				+ ", salary=" + salary + "]";
	}
	
}