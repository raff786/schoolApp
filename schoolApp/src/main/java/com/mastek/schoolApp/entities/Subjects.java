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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name="JPA_Subjects")
public class Subjects {
	int subjectId;
	@FormParam("subjectName")
	SubjectName subjectName;
	//test
	@FormParam("subjectAssessmentType")
	SubjectAssessmentType subjectAssessmentType;
	
	Set<Teacher> teacher = new HashSet<>();
	
	@OneToMany(mappedBy="currentSubjects", cascade=CascadeType.ALL)
	@XmlTransient
	public Set<Teacher> getTeacher() {
		return teacher;
	}
	public void setTeacher(Set<Teacher> teacher) {
		this.teacher = teacher;
	}
	
	@Id
	@Column(name="Subject_Id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getSubjectId() {
		return subjectId;
	}
	
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	
	@Column(name="Subject_name",length=25,nullable=false)
	@Enumerated(EnumType.STRING)
	public SubjectName getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(SubjectName subjectName) {
		this.subjectName = subjectName;
	}
	
	@Enumerated(EnumType.STRING)
	public SubjectAssessmentType getSubjectAssessmentType() {
		return subjectAssessmentType;
	}
	public void setSubjectAssessmentType(SubjectAssessmentType subjectAssessmentType) {
		this.subjectAssessmentType = subjectAssessmentType;
	}
	@Override
	public String toString() {
		return "Subjects [subjectId=" + subjectId + ", subjectName=" + subjectName + ", subjectAssessmentType="
				+ subjectAssessmentType + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + subjectId;
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
		Subjects other = (Subjects) obj;
		if (subjectId != other.subjectId)
			return false;
		return true;
	}
	
}