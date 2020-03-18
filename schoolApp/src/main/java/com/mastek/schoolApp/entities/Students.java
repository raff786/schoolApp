package com.mastek.schoolApp.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="JPA_Students")
public class Students {
 
	int studentId;
	String studentName;
	Gender gender;
	String studentEmail;
	String dateOfBirth;
	String studentAddress;
	String studentEmergencyContact;
	boolean studentLearningDifficulty;
	
	
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
