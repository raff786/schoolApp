package com.mastek.schoolApp.entities;

public class Subjects {
	int subjectId;
	SubjectName subjectName;
	SubjectAssessmentType subjectAssessmentType;
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public SubjectName getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(SubjectName subjectName) {
		this.subjectName = subjectName;
	}
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
