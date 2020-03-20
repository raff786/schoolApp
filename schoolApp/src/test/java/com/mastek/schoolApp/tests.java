package com.mastek.schoolApp;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mastek.schoolApp.dao.StudentsJPADAO;
import com.mastek.schoolApp.dao.SubjectJPADAO;
import com.mastek.schoolApp.dao.TeacherJPADAO;
import com.mastek.schoolApp.entities.Department;
import com.mastek.schoolApp.entities.Gender;
import com.mastek.schoolApp.entities.Position;
import com.mastek.schoolApp.entities.Salary;
import com.mastek.schoolApp.entities.Students;
import com.mastek.schoolApp.entities.SubjectAssessmentType;
import com.mastek.schoolApp.entities.SubjectName;
import com.mastek.schoolApp.entities.Subjects;
import com.mastek.schoolApp.entities.Teacher;
import com.mastek.schoolApp.services.StudentsService;
import com.mastek.schoolApp.services.SubjectServices;
import com.mastek.schoolApp.services.TeacherServices;

@SpringBootTest
class test {

	@Autowired
	StudentsJPADAO stuDAO;
	
	@Autowired
	TeacherJPADAO teaDAO;
	
	@Autowired
	SubjectJPADAO subDAO;
	
	@Autowired
	StudentsService stuS;
	
	@Autowired
	TeacherServices teaS;
	
	@Autowired
	SubjectServices subS;
	
// 	@Test
// 	void testStudentAdd() {
// 		Students Stu = new Students();
// 		Stu.setStudentName("New Student");
// 		Stu.setGender(Gender.MALE);
// 		Stu.setStudentEmail("New Email");
// 		Stu.setDateOfBirth("01/01/1970");
// 		Stu.setStudentAddress("New Address");
// 		Stu.setStudentEmergencyContact("New Emergency Contact");
// 		Stu.setStudentLearningDifficulty(false);
// 		
// 		Stu = stuDAO.save(Stu);
// 		assertNotNull(Stu, "Student Not Saved");
// 	}
// 	
// 	@Test
// 	void testTeacherAdd() {
// 		Teacher Tea = new Teacher();
// 		Tea.setTeacherName("New Teacher");
// 		Tea.setGender(Gender.FEMALE);
// 		Tea.setTeacherEmail("New Email Address");
// 		Tea.setDepartment(Department.SCIENCES);
// 		Tea.setPosition(Position.PERMANENT);
// 		Tea.setSalary(Salary.M1);
// 		
// 		Tea = teaDAO.save(Tea);
// 		assertNotNull(Tea, "Teacher Not Saved");
// 	}
// 
// 	@Test
// 	void testSubjectAdd() {
// 		Subjects Sub = new Subjects();
// 		Sub.setSubjectName(SubjectName.SCIENCE);
// 		Sub.setSubjectAssessmentType(SubjectAssessmentType.EXAM);
// 		
// 		Sub = subDAO.save(Sub);
// 		assertNotNull(Sub, "Subject Not Saved");
// 	}
// 	
// 	@Test
// 	void testStudentAdd2() {
// 		Students Stu = new Students();
// 		Stu.setStudentName("Emily");
// 		Stu.setGender(Gender.FEMALE);
// 		Stu.setStudentEmail("New Email");
// 		Stu.setDateOfBirth("04/09/1970");
// 		Stu.setStudentAddress("New Address");
// 		Stu.setStudentEmergencyContact("Parent");
// 		Stu.setStudentLearningDifficulty(true);
// 		
// 		Stu = stuDAO.save(Stu);
// 		assertNotNull(Stu, "Student Not Saved");
// 	}
// 	
// 	@Test
// 	void testTeacherAdd2() {
// 		Teacher Tea = new Teacher();
// 		Tea.setTeacherName("Bob");
// 		Tea.setGender(Gender.MALE);
// 		Tea.setTeacherEmail("New Email Address");
// 		Tea.setDepartment(Department.SCIENCES);
// 		Tea.setPosition(Position.TEMPORARY);
// 		Tea.setSalary(Salary.M2);
// 		
// 		Tea = teaDAO.save(Tea);
// 		assertNotNull(Tea, "Teacher Not Saved");
// 	}
// 
// 	@Test
// 	void testSubjectAdd2() {
// 		Subjects Sub = new Subjects();
// 		Sub.setSubjectName(SubjectName.MATHS);
// 		Sub.setSubjectAssessmentType(SubjectAssessmentType.COURSEWORK);
// 		
// 		Sub = subDAO.save(Sub);
// 		assertNotNull(Sub, "Subject Not Saved");
// 	}
// 	
// 	@Test
// 	void testStudentAdd3() {
// 		Students Stu = new Students();
// 		Stu.setStudentName("Barry");
// 		Stu.setGender(Gender.MALE);
// 		Stu.setStudentEmail("New Email");
// 		Stu.setDateOfBirth("04/09/1980");
// 		Stu.setStudentAddress("New Address");
// 		Stu.setStudentEmergencyContact("Guardian");
// 		Stu.setStudentLearningDifficulty(true);
// 		
// 		Stu = stuDAO.save(Stu);
// 		assertNotNull(Stu, "Student Not Saved");
// 	}
// 	
// 	@Test
// 	void testTeacherAdd3() {
// 		Teacher Tea = new Teacher();
// 		Tea.setTeacherName("Jeremy");
// 		Tea.setGender(Gender.MALE);
// 		Tea.setTeacherEmail("New Email Address");
// 		Tea.setDepartment(Department.ARTS);
// 		Tea.setPosition(Position.SUBSTITUTE);
// 		Tea.setSalary(Salary.M3);
// 		
// 		Tea = teaDAO.save(Tea);
// 		assertNotNull(Tea, "Teacher Not Saved");
// 	}
// 
// 	@Test
// 	void testSubjectAdd3() {
// 		Subjects Sub = new Subjects();
// 		Sub.setSubjectName(SubjectName.ENGLISH);
// 		Sub.setSubjectAssessmentType(SubjectAssessmentType.PRESENTATION);
// 		
// 		Sub = subDAO.save(Sub);
// 		assertNotNull(Sub, "Subject Not Saved");
// 	}
// 	
// 	@Test
// 	void testStudentAdd4() {
// 		Students Stu = new Students();
// 		Stu.setStudentName("Karen");
// 		Stu.setGender(Gender.FEMALE);
// 		Stu.setStudentEmail("New Email");
// 		Stu.setDateOfBirth("03/04/1990");
// 		Stu.setStudentAddress("New Address");
// 		Stu.setStudentEmergencyContact("Grandparent");
// 		Stu.setStudentLearningDifficulty(false);
// 		
// 		Stu = stuDAO.save(Stu);
// 		assertNotNull(Stu, "Student Not Saved");
// 	}
// 	
// 	@Test
// 	void testTeacherAdd4() {
// 		Teacher Tea = new Teacher();
// 		Tea.setTeacherName("Sameer");
// 		Tea.setGender(Gender.MALE);
// 		Tea.setTeacherEmail("New Email Address");
// 		Tea.setDepartment(Department.TECHNOLOGY);
// 		Tea.setPosition(Position.PERMANENT);
// 		Tea.setSalary(Salary.M4);
// 		
// 		Tea = teaDAO.save(Tea);
// 		assertNotNull(Tea, "Teacher Not Saved");
// 	}
// 
// 	@Test
// 	void testSubjectAdd4() {
// 		Subjects Sub = new Subjects();
// 		Sub.setSubjectName(SubjectName.SCIENCE);
// 		Sub.setSubjectAssessmentType(SubjectAssessmentType.COURSEWORK);
// 		
// 		Sub = subDAO.save(Sub);
// 		assertNotNull(Sub, "Subject Not Saved");
// 	}
// 	
// 	@Test
// 	void testStudentAdd5() {
// 		Students Stu = new Students();
// 		Stu.setStudentName("Jerome");
// 		Stu.setGender(Gender.MALE);
// 		Stu.setStudentEmail("New Email");
// 		Stu.setDateOfBirth("23/09/2000");
// 		Stu.setStudentAddress("New Address");
// 		Stu.setStudentEmergencyContact("Sibling");
// 		Stu.setStudentLearningDifficulty(true);
// 		
// 		Stu = stuDAO.save(Stu);
// 		assertNotNull(Stu, "Student Not Saved");
// 	}
// 	
// 	@Test
// 	void testTeacherAdd5() {
// 		Teacher Tea = new Teacher();
// 		Tea.setTeacherName("Robert");
// 		Tea.setGender(Gender.MALE);
// 		Tea.setTeacherEmail("New Email Address");
// 		Tea.setDepartment(Department.PE);
// 		Tea.setPosition(Position.PERMANENT);
// 		Tea.setSalary(Salary.M5);
// 		
// 		Tea = teaDAO.save(Tea);
// 		assertNotNull(Tea, "Teacher Not Saved");
// 	}
// 
// 	@Test
// 	void testSubjectAdd5() {
// 		Subjects Sub = new Subjects();
// 		Sub.setSubjectName(SubjectName.PE);
// 		Sub.setSubjectAssessmentType(SubjectAssessmentType.EXAM);
// 		
// 		Sub = subDAO.save(Sub);
// 		assertNotNull(Sub, "Subject Not Saved");
// 	}
// 	
// 	@Test
// 	void testStudentAdd6() {
// 		Students Stu = new Students();
// 		Stu.setStudentName("Harriet");
// 		Stu.setGender(Gender.FEMALE);
// 		Stu.setStudentEmail("New Email");
// 		Stu.setDateOfBirth("14/12/1990");
// 		Stu.setStudentAddress("New Address");
// 		Stu.setStudentEmergencyContact("Parent");
// 		Stu.setStudentLearningDifficulty(false);
// 		
// 		Stu = stuDAO.save(Stu);
// 		assertNotNull(Stu, "Student Not Saved");
// 	}
// 	
// 	@Test
// 	void testTeacherAdd6() {
// 		Teacher Tea = new Teacher();
// 		Tea.setTeacherName("Jeremy");
// 		Tea.setGender(Gender.MALE);
// 		Tea.setTeacherEmail("New Email Address");
// 		Tea.setDepartment(Department.ARTS);
// 		Tea.setPosition(Position.PERMANENT);
// 		Tea.setSalary(Salary.M3);
// 		
// 		Tea = teaDAO.save(Tea);
// 		assertNotNull(Tea, "Teacher Not Saved");
// 	}
// 
// 	@Test
// 	void testSubjectAdd6() {
// 		Subjects Sub = new Subjects();
// 		Sub.setSubjectName(SubjectName.ENGLISH);
// 		Sub.setSubjectAssessmentType(SubjectAssessmentType.PRESENTATION);
// 		
// 		Sub = subDAO.save(Sub);
// 		assertNotNull(Sub, "Subject Not Saved");
// 	}
// 	
// 	@Test
// 	void testStudentAdd7() {
// 		Students Stu = new Students();
// 		Stu.setStudentName("New Student");
// 		Stu.setGender(Gender.MALE);
// 		Stu.setStudentEmail("New Email");
// 		Stu.setDateOfBirth("01/01/1970");
// 		Stu.setStudentAddress("New Address");
// 		Stu.setStudentEmergencyContact("New Emergency Contact");
// 		Stu.setStudentLearningDifficulty(false);
// 		
// 		Stu = stuDAO.save(Stu);
// 		assertNotNull(Stu, "Student Not Saved");
// 	}
// 	
// 	@Test
// 	void testTeacherAdd7() {
// 		Teacher Tea = new Teacher();
// 		Tea.setTeacherName("New Teacher");
// 		Tea.setGender(Gender.FEMALE);
// 		Tea.setTeacherEmail("New Email Address");
// 		Tea.setDepartment(Department.SCIENCES);
// 		Tea.setPosition(Position.PERMANENT);
// 		Tea.setSalary(Salary.M1);
// 		
// 		Tea = teaDAO.save(Tea);
// 		assertNotNull(Tea, "Teacher Not Saved");
// 	}
// 
// 	@Test
// 	void testSubjectAdd7() {
// 		Subjects Sub = new Subjects();
// 		Sub.setSubjectName(SubjectName.SCIENCE);
// 		Sub.setSubjectAssessmentType(SubjectAssessmentType.EXAM);
// 		
// 		Sub = subDAO.save(Sub);
// 		assertNotNull(Sub, "Subject Not Saved");
// 	}
// 	
// 	@Test
// 	void testStudentAdd8() {
// 		Students Stu = new Students();
// 		Stu.setStudentName("Kate");
// 		Stu.setGender(Gender.FEMALE);
// 		Stu.setStudentEmail("New Email");
// 		Stu.setDateOfBirth("04/09/1970");
// 		Stu.setStudentAddress("New Address");
// 		Stu.setStudentEmergencyContact("Parent");
// 		Stu.setStudentLearningDifficulty(true);
// 		
// 		Stu = stuDAO.save(Stu);
// 		assertNotNull(Stu, "Student Not Saved");
// 	}
// 	
// 	@Test
// 	void testTeacherAdd8() {
// 		Teacher Tea = new Teacher();
// 		Tea.setTeacherName("Jon");
// 		Tea.setGender(Gender.MALE);
// 		Tea.setTeacherEmail("New Email Address");
// 		Tea.setDepartment(Department.SCIENCES);
// 		Tea.setPosition(Position.TEMPORARY);
// 		Tea.setSalary(Salary.M2);
// 		
// 		Tea = teaDAO.save(Tea);
// 		assertNotNull(Tea, "Teacher Not Saved");
// 	}
// 
// 	@Test
// 	void testSubjectAdd8() {
// 		Subjects Sub = new Subjects();
// 		Sub.setSubjectName(SubjectName.MATHS);
// 		Sub.setSubjectAssessmentType(SubjectAssessmentType.COURSEWORK);
// 		
// 		Sub = subDAO.save(Sub);
// 		assertNotNull(Sub, "Subject Not Saved");
// 	}
// 	
// 	@Test
// 	void testStudentAdd9() {
// 		Students Stu = new Students();
// 		Stu.setStudentName("Dave");
// 		Stu.setGender(Gender.MALE);
// 		Stu.setStudentEmail("New Email");
// 		Stu.setDateOfBirth("04/09/1980");
// 		Stu.setStudentAddress("New Address");
// 		Stu.setStudentEmergencyContact("Guardian");
// 		Stu.setStudentLearningDifficulty(true);
// 		
// 		Stu = stuDAO.save(Stu);
// 		assertNotNull(Stu, "Student Not Saved");
// 	}
// 	
// 	@Test
// 	void testTeacherAdd9() {
// 		Teacher Tea = new Teacher();
// 		Tea.setTeacherName("Atiq");
// 		Tea.setGender(Gender.MALE);
// 		Tea.setTeacherEmail("New Email Address");
// 		Tea.setDepartment(Department.ARTS);
// 		Tea.setPosition(Position.SUBSTITUTE);
// 		Tea.setSalary(Salary.M3);
// 		
// 		Tea = teaDAO.save(Tea);
// 		assertNotNull(Tea, "Teacher Not Saved");
// 	}
// 
// 	@Test
// 	void testSubjectAdd9() {
// 		Subjects Sub = new Subjects();
// 		Sub.setSubjectName(SubjectName.ENGLISH);
// 		Sub.setSubjectAssessmentType(SubjectAssessmentType.PRESENTATION);
// 		
// 		Sub = subDAO.save(Sub);
// 		assertNotNull(Sub, "Subject Not Saved");
// 	}
// 	
// 	@Test
// 	void testStudentAdd10() {
// 		Students Stu = new Students();
// 		Stu.setStudentName("Katelyn");
// 		Stu.setGender(Gender.FEMALE);
// 		Stu.setStudentEmail("New Email");
// 		Stu.setDateOfBirth("03/04/1990");
// 		Stu.setStudentAddress("New Address");
// 		Stu.setStudentEmergencyContact("Grandparent");
// 		Stu.setStudentLearningDifficulty(false);
// 		
// 		Stu = stuDAO.save(Stu);
// 		assertNotNull(Stu, "Student Not Saved");
// 	}
// 	
// 	@Test
// 	void testTeacherAdd10() {
// 		Teacher Tea = new Teacher();
// 		Tea.setTeacherName("Leslie");
// 		Tea.setGender(Gender.MALE);
// 		Tea.setTeacherEmail("New Email Address");
// 		Tea.setDepartment(Department.TECHNOLOGY);
// 		Tea.setPosition(Position.PERMANENT);
// 		Tea.setSalary(Salary.M4);
// 		
// 		Tea = teaDAO.save(Tea);
// 		assertNotNull(Tea, "Teacher Not Saved");
// 	}
// 
// 	@Test
// 	void testSubjectAdd10() {
// 		Subjects Sub = new Subjects();
// 		Sub.setSubjectName(SubjectName.SCIENCE);
// 		Sub.setSubjectAssessmentType(SubjectAssessmentType.COURSEWORK);
// 		
// 		Sub = subDAO.save(Sub);
// 		assertNotNull(Sub, "Subject Not Saved");
// 	}
// 	
// 	@Test
// 	void testStudentAdd11() {
// 		Students Stu = new Students();
// 		Stu.setStudentName("Dominic");
// 		Stu.setGender(Gender.MALE);
// 		Stu.setStudentEmail("New Email");
// 		Stu.setDateOfBirth("23/09/2000");
// 		Stu.setStudentAddress("New Address");
// 		Stu.setStudentEmergencyContact("Sibling");
// 		Stu.setStudentLearningDifficulty(true);
// 		
// 		Stu = stuDAO.save(Stu);
// 		assertNotNull(Stu, "Student Not Saved");
// 	}
// 	
// 	@Test
// 	void testTeacherAdd11() {
// 		Teacher Tea = new Teacher();
// 		Tea.setTeacherName("Geoffrey");
// 		Tea.setGender(Gender.MALE);
// 		Tea.setTeacherEmail("New Email Address");
// 		Tea.setDepartment(Department.PE);
// 		Tea.setPosition(Position.PERMANENT);
// 		Tea.setSalary(Salary.M5);
// 		
// 		Tea = teaDAO.save(Tea);
// 		assertNotNull(Tea, "Teacher Not Saved");
// 	}
// 
// 	@Test
// 	void testSubjectAdd11() {
// 		Subjects Sub = new Subjects();
// 		Sub.setSubjectName(SubjectName.PE);
// 		Sub.setSubjectAssessmentType(SubjectAssessmentType.EXAM);
// 		
// 		Sub = subDAO.save(Sub);
// 		assertNotNull(Sub, "Subject Not Saved");
// 	}
// 	
// 	@Test
// 	void testStudentAdd12() {
// 		Students Stu = new Students();
// 		Stu.setStudentName("Holly");
// 		Stu.setGender(Gender.FEMALE);
// 		Stu.setStudentEmail("New Email");
// 		Stu.setDateOfBirth("14/12/1990");
// 		Stu.setStudentAddress("New Address");
// 		Stu.setStudentEmergencyContact("Parent");
// 		Stu.setStudentLearningDifficulty(false);
// 		
// 		Stu = stuDAO.save(Stu);
// 		assertNotNull(Stu, "Student Not Saved");
// 	}
// 	
// 	@Test
// 	void testTeacherAdd12() {
// 		Teacher Tea = new Teacher();
// 		Tea.setTeacherName("Jack");
// 		Tea.setGender(Gender.MALE);
// 		Tea.setTeacherEmail("New Email Address");
// 		Tea.setDepartment(Department.ARTS);
// 		Tea.setPosition(Position.PERMANENT);
// 		Tea.setSalary(Salary.M3);
// 		
// 		Tea = teaDAO.save(Tea);
// 		assertNotNull(Tea, "Teacher Not Saved");
// 	}
// 
// 	@Test
// 	void testSubjectAdd12() {
// 		Subjects Sub = new Subjects();
// 		Sub.setSubjectName(SubjectName.ENGLISH);
// 		Sub.setSubjectAssessmentType(SubjectAssessmentType.PRESENTATION);
// 		
// 		Sub = subDAO.save(Sub);
// 		assertNotNull(Sub, "Subject Not Saved");
// 	}
// 	
// 	@Test
// 	void testAssignStudentsToTeacher() {
// 		Students stu = stuS.assignStudentsToTeacher(110,109);
// 		assertNotNull(stu.getTeacherAssigned(),"Teacher Not Assigned");
// 	}
// 	
//  	@Test
//  	void testAssignStudentsToTeacher2() {
//  		Students stu = stuS.assignStudentsToTeacher(561,563);
//  		assertNotNull(stu.getTeacherAssigned(),"Teacher Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignStudentsToTeacher3() {
//  		Students stu = stuS.assignStudentsToTeacher(561,559);
//  		assertNotNull(stu.getTeacherAssigned(),"Teacher Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignStudentsToTeacher4() {
//  		Students stu = stuS.assignStudentsToTeacher(561,564);
//  		assertNotNull(stu.getTeacherAssigned(),"Teacher Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignStudentsToTeacher5() {
//  		Students stu = stuS.assignStudentsToTeacher(544,563);
//  		assertNotNull(stu.getTeacherAssigned(),"Teacher Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignStudentsToTeacher6() {
//  		Students stu = stuS.assignStudentsToTeacher(573,563);
//  		assertNotNull(stu.getTeacherAssigned(),"Teacher Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignStudentsToTeacher7() {
//  		Students stu = stuS.assignStudentsToTeacher(576,565);
//  		assertNotNull(stu.getTeacherAssigned(),"Teacher Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignStudentsToTeacher8() {
//  		Students stu = stuS.assignStudentsToTeacher(580,604);
//  		assertNotNull(stu.getTeacherAssigned(),"Teacher Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignStudentsToTeacher9() {
//  		Students stu = stuS.assignStudentsToTeacher(610,604);
//  		assertNotNull(stu.getTeacherAssigned(),"Teacher Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignStudentsToTeacher10() {
//  		Students stu = stuS.assignStudentsToTeacher(610,565);
//  		assertNotNull(stu.getTeacherAssigned(),"Teacher Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignStudentsToTeacher11() {
//  		Students stu = stuS.assignStudentsToTeacher(610,569);
//  		assertNotNull(stu.getTeacherAssigned(),"Teacher Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignStudentsToTeacher12() {
//  		Students stu = stuS.assignStudentsToTeacher(614,570);
//  		assertNotNull(stu.getTeacherAssigned(),"Teacher Not Assigned");
//  	}
//  	
// 	@Test
// 	void testAssignStudentsToSubjects() {
// 		Students stu = stuS.assignStudentsToSubjects(110,111);
// 		assertNotNull(stu.getSubjectsAssigned(),"Subject Not Assigned");
// 	}
// 	
//  	@Test
//  	void testAssignStudentsToSubjects2() {
//  		Students stu = stuS.assignStudentsToSubjects(544,581);
//  		assertNotNull(stu.getSubjectsAssigned(),"Subject Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignStudentsToSubjects3() {
//  		Students stu = stuS.assignStudentsToSubjects(614,550);
//  		assertNotNull(stu.getSubjectsAssigned(),"Subject Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignStudentsToSubjects4() {
//  		Students stu = stuS.assignStudentsToSubjects(610,581);
//  		assertNotNull(stu.getSubjectsAssigned(),"Subject Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignStudentsToSubjects5() {
//  		Students stu = stuS.assignStudentsToSubjects(613,581);
//  		assertNotNull(stu.getSubjectsAssigned(),"Subject Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignStudentsToSubjects6() {
//  		Students stu = stuS.assignStudentsToSubjects(612,581);
//  		assertNotNull(stu.getSubjectsAssigned(),"Subject Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignStudentsToSubjects7() {
//  		Students stu = stuS.assignStudentsToSubjects(544,556);
//  		assertNotNull(stu.getSubjectsAssigned(),"Subject Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignStudentsToSubjects8() {
//  		Students stu = stuS.assignStudentsToSubjects(613,592);
//  		assertNotNull(stu.getSubjectsAssigned(),"Subject Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignStudentsToSubjects9() {
//  		Students stu = stuS.assignStudentsToSubjects(610,591);
//  		assertNotNull(stu.getSubjectsAssigned(),"Subject Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignStudentsToSubjects10() {
//  		Students stu = stuS.assignStudentsToSubjects(607,581);
//  		assertNotNull(stu.getSubjectsAssigned(),"Subject Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignTeacherToSubjects() {
//  		Teacher tea = teaS.assignTeacherToSubjects(557,545);
//  		assertNotNull(tea.getCurrentSubjects(),"Subject Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignTeacherToSubjects2() {
//  		Teacher tea = teaS.assignTeacherToSubjects(558,545);
//  		assertNotNull(tea.getCurrentSubjects(),"Subject Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignTeacherToSubjects3() {
//  		Teacher tea = teaS.assignTeacherToSubjects(559,545);
//  		assertNotNull(tea.getCurrentSubjects(),"Subject Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignTeacherToSubjects4() {
//  		Teacher tea = teaS.assignTeacherToSubjects(563,546);
//  		assertNotNull(tea.getCurrentSubjects(),"Subject Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignTeacherToSubjects5() {
//  		Teacher tea = teaS.assignTeacherToSubjects(564,546);
//  		assertNotNull(tea.getCurrentSubjects(),"Subject Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignTeacherToSubjects6() {
//  		Teacher tea = teaS.assignTeacherToSubjects(565,546);
//  		assertNotNull(tea.getCurrentSubjects(),"Subject Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignTeacherToSubjects7() {
//  		Teacher tea = teaS.assignTeacherToSubjects(566,546);
//  		assertNotNull(tea.getCurrentSubjects(),"Subject Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignTeacherToSubjects8() {
//  		Teacher tea = teaS.assignTeacherToSubjects(567,546);
//  		assertNotNull(tea.getCurrentSubjects(),"Subject Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignTeacherToSubjects9() {
//  		Teacher tea = teaS.assignTeacherToSubjects(568,546);
//  		assertNotNull(tea.getCurrentSubjects(),"Subject Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignTeacherToSubjects10() {
//  		Teacher tea = teaS.assignTeacherToSubjects(569,546);
//  		assertNotNull(tea.getCurrentSubjects(),"Subject Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignTeacherToSubjects11() {
//  		Teacher tea = teaS.assignTeacherToSubjects(570,546);
//  		assertNotNull(tea.getCurrentSubjects(),"Subject Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignTeacherToSubjects12() {
//  		Teacher tea = teaS.assignTeacherToSubjects(579,547);
//  		assertNotNull(tea.getCurrentSubjects(),"Subject Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignTeacherToSubjects13() {
//  		Teacher tea = teaS.assignTeacherToSubjects(593,548);
//  		assertNotNull(tea.getCurrentSubjects(),"Subject Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignTeacherToSubjects14() {
//  		Teacher tea = teaS.assignTeacherToSubjects(594,548);
//  		assertNotNull(tea.getCurrentSubjects(),"Subject Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignTeacherToSubjects15() {
//  		Teacher tea = teaS.assignTeacherToSubjects(595,548);
//  		assertNotNull(tea.getCurrentSubjects(),"Subject Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignTeacherToSubjects16() {
//  		Teacher tea = teaS.assignTeacherToSubjects(599,549);
//  		assertNotNull(tea.getCurrentSubjects(),"Subject Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignTeacherToSubjects17() {
//  		Teacher tea = teaS.assignTeacherToSubjects(600,549);
//  		assertNotNull(tea.getCurrentSubjects(),"Subject Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignTeacherToSubjects18() {
//  		Teacher tea = teaS.assignTeacherToSubjects(601,549);
//  		assertNotNull(tea.getCurrentSubjects(),"Subject Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignTeacherToSubjects19() {
//  		Teacher tea = teaS.assignTeacherToSubjects(601,550);
//  		assertNotNull(tea.getCurrentSubjects(),"Subject Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignTeacherToSubjects20() {
//  		Teacher tea = teaS.assignTeacherToSubjects(602,551);
//  		assertNotNull(tea.getCurrentSubjects(),"Subject Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignTeacherToSubjects21() {
//  		Teacher tea = teaS.assignTeacherToSubjects(603,552);
//  		assertNotNull(tea.getCurrentSubjects(),"Subject Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignTeacherToSubjects22() {
//  		Teacher tea = teaS.assignTeacherToSubjects(604,553);
//  		assertNotNull(tea.getCurrentSubjects(),"Subject Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignTeacherToSubjects23() {
//  		Teacher tea = teaS.assignTeacherToSubjects(605,554);
//  		assertNotNull(tea.getCurrentSubjects(),"Subject Not Assigned");
//  	}
//  	
//  	@Test
//  	void testAssignTeacherToSubjects24() {
//  		Teacher tea = teaS.assignTeacherToSubjects(606,555);
//  		assertNotNull(tea.getCurrentSubjects(),"Subject Not Assigned");
//  	}

}