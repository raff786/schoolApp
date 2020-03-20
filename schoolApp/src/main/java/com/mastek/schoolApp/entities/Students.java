package com.mastek.schoolApp.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name="JPA_Students")
public class Students {
	int studentId;
	
	@FormParam("StudentName")
	String studentName;
	
	@FormParam("gender")
	Gender gender;
	
	@FormParam("studentEmail")
	String studentEmail;
	
	@FormParam("dateOfBirth")
	String dateOfBirth;
	
	@FormParam("studentAddress")
	String studentAddress;
	
	@FormParam("studentEmergencyContact")
	String studentEmergencyContact;
	
	@FormParam("studentLearningDifficulty")
	boolean studentLearningDifficulty;
	
	Set<Teacher> teacherAssigned = new HashSet<>();
	Set<Subjects> subjectsAssigned = new HashSet<>();
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="JPA_TEACHER_ASSIGNMENTS",
			joinColumns= {@JoinColumn(name="fk_studentId")},
			inverseJoinColumns = {@JoinColumn(name="fk_teacherId")}
			)
	
	@XmlTransient
	public Set<Teacher> getTeacherAssigned() {
		return teacherAssigned;
	}
	
	public void setTeacherAssigned(Set<Teacher> teacherAssigned) {
		this.teacherAssigned = teacherAssigned;
	}
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="JPA_SUBJECTS_ASSIGNMENTS",
			joinColumns= {@JoinColumn(name="fk_studentId")},
			inverseJoinColumns = {@JoinColumn(name="fk_subjectId")}
			)
	
	@XmlTransient
	public Set<Subjects> getSubjectsAssigned() {
		return subjectsAssigned;
	}
	
	public void setSubjectsAssigned(Set<Subjects> subjectsAssigned) {
		this.subjectsAssigned = subjectsAssigned;
	}
	
	public Students() {
		
	}
	
	@Id // marking the property as primary key
	@Column(name="Student_Id") //using column to provide the default column name
	@GeneratedValue(strategy=GenerationType.AUTO)// auto numbering configuration as per DB
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	@Enumerated(EnumType.STRING)
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getStudentEmergencyContact() {
		return studentEmergencyContact;
	}
	public void setStudentEmergencyContact(String studentEmergencyContact) {
		this.studentEmergencyContact = studentEmergencyContact;
	}
	public boolean isStudentLearningDifficulty() {
		return studentLearningDifficulty;
	}
	public void setStudentLearningDifficulty(boolean studentLearningDifficulty) {
		this.studentLearningDifficulty = studentLearningDifficulty;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + studentId;
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
		Students other = (Students) obj;
		if (studentId != other.studentId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Students [studentId=" + studentId + ", studentName=" + studentName + ", gender=" + gender
				+ ", studentEmail=" + studentEmail + ", dateOfBirth=" + dateOfBirth + ", studentAddress="
				+ studentAddress + ", studentEmergencyContact=" + studentEmergencyContact
				+ ", studentLearningDifficulty=" + studentLearningDifficulty + "]";
	}
	
}