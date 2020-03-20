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
class SchoolAppApplicationTests {

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
	
	@Test
	void testStudentAdd() {
		Students Stu = new Students();
		Stu.setStudentName("New Student");
		Stu.setGender(Gender.MALE);
		Stu.setStudentEmail("New Email");
		Stu.setDateOfBirth("01/01/1970");
		Stu.setStudentAddress("New Address");
		Stu.setStudentEmergencyContact("New Emergency Contact");
		Stu.setStudentLearningDifficulty(false);
		
		Stu = stuDAO.save(Stu);
		assertNotNull(Stu, "Student Not Saved");
	}
	
	@Test
	void testTeacherAdd() {
		Teacher Tea = new Teacher();
		Tea.setTeacherName("New Teacher");
		Tea.setGender(Gender.FEMALE);
		Tea.setTeacherEmail("New Email Address");
		Tea.setDepartment(Department.SCIENCES);
		Tea.setPosition(Position.PERMANENT);
		Tea.setSalary(Salary.M1);
		
		Tea = teaDAO.save(Tea);
		assertNotNull(Tea, "Teacher Not Saved");
	}

	@Test
	void testSubjectAdd() {
		Subjects Sub = new Subjects();
		Sub.setSubjectName(SubjectName.SCIENCE);
		Sub.setSubjectAssessmentType(SubjectAssessmentType.EXAM);
		
		Sub = subDAO.save(Sub);
		assertNotNull(Sub, "Subject Not Saved");
	}
	
	@Test
	void testStudentAdd2() {
		Students Stu = new Students();
		Stu.setStudentName("Emily");
		Stu.setGender(Gender.FEMALE);
		Stu.setStudentEmail("New Email");
		Stu.setDateOfBirth("04/09/1970");
		Stu.setStudentAddress("New Address");
		Stu.setStudentEmergencyContact("Parent");
		Stu.setStudentLearningDifficulty(true);
		
		Stu = stuDAO.save(Stu);
		assertNotNull(Stu, "Student Not Saved");
	}
	
	@Test
	void testTeacherAdd2() {
		Teacher Tea = new Teacher();
		Tea.setTeacherName("Bob");
		Tea.setGender(Gender.MALE);
		Tea.setTeacherEmail("New Email Address");
		Tea.setDepartment(Department.SCIENCES);
		Tea.setPosition(Position.TEMPORARY);
		Tea.setSalary(Salary.M2);
		
		Tea = teaDAO.save(Tea);
		assertNotNull(Tea, "Teacher Not Saved");
	}

	@Test
	void testSubjectAdd2() {
		Subjects Sub = new Subjects();
		Sub.setSubjectName(SubjectName.MATHS);
		Sub.setSubjectAssessmentType(SubjectAssessmentType.COURSEWORK);
		
		Sub = subDAO.save(Sub);
		assertNotNull(Sub, "Subject Not Saved");
	}
	
	@Test
	void testStudentAdd3() {
		Students Stu = new Students();
		Stu.setStudentName("Barry");
		Stu.setGender(Gender.MALE);
		Stu.setStudentEmail("New Email");
		Stu.setDateOfBirth("04/09/1980");
		Stu.setStudentAddress("New Address");
		Stu.setStudentEmergencyContact("Guardian");
		Stu.setStudentLearningDifficulty(true);
		
		Stu = stuDAO.save(Stu);
		assertNotNull(Stu, "Student Not Saved");
	}
	
	@Test
	void testTeacherAdd3() {
		Teacher Tea = new Teacher();
		Tea.setTeacherName("Jeremy");
		Tea.setGender(Gender.MALE);
		Tea.setTeacherEmail("New Email Address");
		Tea.setDepartment(Department.ARTS);
		Tea.setPosition(Position.SUBSTITUTE);
		Tea.setSalary(Salary.M3);
		
		Tea = teaDAO.save(Tea);
		assertNotNull(Tea, "Teacher Not Saved");
	}

	@Test
	void testSubjectAdd3() {
		Subjects Sub = new Subjects();
		Sub.setSubjectName(SubjectName.ENGLISH);
		Sub.setSubjectAssessmentType(SubjectAssessmentType.PRESENTATION);
		
		Sub = subDAO.save(Sub);
		assertNotNull(Sub, "Subject Not Saved");
	}
	
	@Test
	void testStudentAdd4() {
		Students Stu = new Students();
		Stu.setStudentName("Karen");
		Stu.setGender(Gender.FEMALE);
		Stu.setStudentEmail("New Email");
		Stu.setDateOfBirth("03/04/1990");
		Stu.setStudentAddress("New Address");
		Stu.setStudentEmergencyContact("Grandparent");
		Stu.setStudentLearningDifficulty(false);
		
		Stu = stuDAO.save(Stu);
		assertNotNull(Stu, "Student Not Saved");
	}
	
	@Test
	void testTeacherAdd4() {
		Teacher Tea = new Teacher();
		Tea.setTeacherName("Sameer");
		Tea.setGender(Gender.MALE);
		Tea.setTeacherEmail("New Email Address");
		Tea.setDepartment(Department.TECHNOLOGY);
		Tea.setPosition(Position.PERMANENT);
		Tea.setSalary(Salary.M4);
		
		Tea = teaDAO.save(Tea);
		assertNotNull(Tea, "Teacher Not Saved");
	}

	@Test
	void testSubjectAdd4() {
		Subjects Sub = new Subjects();
		Sub.setSubjectName(SubjectName.SCIENCE);
		Sub.setSubjectAssessmentType(SubjectAssessmentType.COURSEWORK);
		
		Sub = subDAO.save(Sub);
		assertNotNull(Sub, "Subject Not Saved");
	}
	
	@Test
	void testStudentAdd5() {
		Students Stu = new Students();
		Stu.setStudentName("Jerome");
		Stu.setGender(Gender.MALE);
		Stu.setStudentEmail("New Email");
		Stu.setDateOfBirth("23/09/2000");
		Stu.setStudentAddress("New Address");
		Stu.setStudentEmergencyContact("Sibling");
		Stu.setStudentLearningDifficulty(true);
		
		Stu = stuDAO.save(Stu);
		assertNotNull(Stu, "Student Not Saved");
	}
	
	@Test
	void testTeacherAdd5() {
		Teacher Tea = new Teacher();
		Tea.setTeacherName("Robert");
		Tea.setGender(Gender.MALE);
		Tea.setTeacherEmail("New Email Address");
		Tea.setDepartment(Department.PE);
		Tea.setPosition(Position.PERMANENT);
		Tea.setSalary(Salary.M5);
		
		Tea = teaDAO.save(Tea);
		assertNotNull(Tea, "Teacher Not Saved");
	}

	@Test
	void testSubjectAdd5() {
		Subjects Sub = new Subjects();
		Sub.setSubjectName(SubjectName.PE);
		Sub.setSubjectAssessmentType(SubjectAssessmentType.EXAM);
		
		Sub = subDAO.save(Sub);
		assertNotNull(Sub, "Subject Not Saved");
	}
	
	@Test
	void testStudentAdd6() {
		Students Stu = new Students();
		Stu.setStudentName("Harriet");
		Stu.setGender(Gender.FEMALE);
		Stu.setStudentEmail("New Email");
		Stu.setDateOfBirth("14/12/1990");
		Stu.setStudentAddress("New Address");
		Stu.setStudentEmergencyContact("Parent");
		Stu.setStudentLearningDifficulty(false);
		
		Stu = stuDAO.save(Stu);
		assertNotNull(Stu, "Student Not Saved");
	}
	
	@Test
	void testTeacherAdd6() {
		Teacher Tea = new Teacher();
		Tea.setTeacherName("Jeremy");
		Tea.setGender(Gender.MALE);
		Tea.setTeacherEmail("New Email Address");
		Tea.setDepartment(Department.ARTS);
		Tea.setPosition(Position.PERMANENT);
		Tea.setSalary(Salary.M3);
		
		Tea = teaDAO.save(Tea);
		assertNotNull(Tea, "Teacher Not Saved");
	}

	@Test
	void testSubjectAdd6() {
		Subjects Sub = new Subjects();
		Sub.setSubjectName(SubjectName.ENGLISH);
		Sub.setSubjectAssessmentType(SubjectAssessmentType.PRESENTATION);
		
		Sub = subDAO.save(Sub);
		assertNotNull(Sub, "Subject Not Saved");
	}
	
	@Test
	void testStudentAdd7() {
		Students Stu = new Students();
		Stu.setStudentName("New Student");
		Stu.setGender(Gender.MALE);
		Stu.setStudentEmail("New Email");
		Stu.setDateOfBirth("01/01/1970");
		Stu.setStudentAddress("New Address");
		Stu.setStudentEmergencyContact("New Emergency Contact");
		Stu.setStudentLearningDifficulty(false);
		
		Stu = stuDAO.save(Stu);
		assertNotNull(Stu, "Student Not Saved");
	}
	
	@Test
	void testTeacherAdd7() {
		Teacher Tea = new Teacher();
		Tea.setTeacherName("New Teacher");
		Tea.setGender(Gender.FEMALE);
		Tea.setTeacherEmail("New Email Address");
		Tea.setDepartment(Department.SCIENCES);
		Tea.setPosition(Position.PERMANENT);
		Tea.setSalary(Salary.M1);
		
		Tea = teaDAO.save(Tea);
		assertNotNull(Tea, "Teacher Not Saved");
	}

	@Test
	void testSubjectAdd7() {
		Subjects Sub = new Subjects();
		Sub.setSubjectName(SubjectName.SCIENCE);
		Sub.setSubjectAssessmentType(SubjectAssessmentType.EXAM);
		
		Sub = subDAO.save(Sub);
		assertNotNull(Sub, "Subject Not Saved");
	}
	
	@Test
	void testStudentAdd8() {
		Students Stu = new Students();
		Stu.setStudentName("Kate");
		Stu.setGender(Gender.FEMALE);
		Stu.setStudentEmail("New Email");
		Stu.setDateOfBirth("04/09/1970");
		Stu.setStudentAddress("New Address");
		Stu.setStudentEmergencyContact("Parent");
		Stu.setStudentLearningDifficulty(true);
		
		Stu = stuDAO.save(Stu);
		assertNotNull(Stu, "Student Not Saved");
	}
	
	@Test
	void testTeacherAdd8() {
		Teacher Tea = new Teacher();
		Tea.setTeacherName("Jon");
		Tea.setGender(Gender.MALE);
		Tea.setTeacherEmail("New Email Address");
		Tea.setDepartment(Department.SCIENCES);
		Tea.setPosition(Position.TEMPORARY);
		Tea.setSalary(Salary.M2);
		
		Tea = teaDAO.save(Tea);
		assertNotNull(Tea, "Teacher Not Saved");
	}

	@Test
	void testSubjectAdd8() {
		Subjects Sub = new Subjects();
		Sub.setSubjectName(SubjectName.MATHS);
		Sub.setSubjectAssessmentType(SubjectAssessmentType.COURSEWORK);
		
		Sub = subDAO.save(Sub);
		assertNotNull(Sub, "Subject Not Saved");
	}
	
	@Test
	void testStudentAdd9() {
		Students Stu = new Students();
		Stu.setStudentName("Dave");
		Stu.setGender(Gender.MALE);
		Stu.setStudentEmail("New Email");
		Stu.setDateOfBirth("04/09/1980");
		Stu.setStudentAddress("New Address");
		Stu.setStudentEmergencyContact("Guardian");
		Stu.setStudentLearningDifficulty(true);
		
		Stu = stuDAO.save(Stu);
		assertNotNull(Stu, "Student Not Saved");
	}
	
	@Test
	void testTeacherAdd9() {
		Teacher Tea = new Teacher();
		Tea.setTeacherName("Atiq");
		Tea.setGender(Gender.MALE);
		Tea.setTeacherEmail("New Email Address");
		Tea.setDepartment(Department.ARTS);
		Tea.setPosition(Position.SUBSTITUTE);
		Tea.setSalary(Salary.M3);
		
		Tea = teaDAO.save(Tea);
		assertNotNull(Tea, "Teacher Not Saved");
	}

	@Test
	void testSubjectAdd9() {
		Subjects Sub = new Subjects();
		Sub.setSubjectName(SubjectName.ENGLISH);
		Sub.setSubjectAssessmentType(SubjectAssessmentType.PRESENTATION);
		
		Sub = subDAO.save(Sub);
		assertNotNull(Sub, "Subject Not Saved");
	}
	
	@Test
	void testStudentAdd10() {
		Students Stu = new Students();
		Stu.setStudentName("Katelyn");
		Stu.setGender(Gender.FEMALE);
		Stu.setStudentEmail("New Email");
		Stu.setDateOfBirth("03/04/1990");
		Stu.setStudentAddress("New Address");
		Stu.setStudentEmergencyContact("Grandparent");
		Stu.setStudentLearningDifficulty(false);
		
		Stu = stuDAO.save(Stu);
		assertNotNull(Stu, "Student Not Saved");
	}
	
	@Test
	void testTeacherAdd10() {
		Teacher Tea = new Teacher();
		Tea.setTeacherName("Leslie");
		Tea.setGender(Gender.MALE);
		Tea.setTeacherEmail("New Email Address");
		Tea.setDepartment(Department.TECHNOLOGY);
		Tea.setPosition(Position.PERMANENT);
		Tea.setSalary(Salary.M4);
		
		Tea = teaDAO.save(Tea);
		assertNotNull(Tea, "Teacher Not Saved");
	}

	@Test
	void testSubjectAdd10() {
		Subjects Sub = new Subjects();
		Sub.setSubjectName(SubjectName.SCIENCE);
		Sub.setSubjectAssessmentType(SubjectAssessmentType.COURSEWORK);
		
		Sub = subDAO.save(Sub);
		assertNotNull(Sub, "Subject Not Saved");
	}
	
	@Test
	void testStudentAdd11() {
		Students Stu = new Students();
		Stu.setStudentName("Dominic");
		Stu.setGender(Gender.MALE);
		Stu.setStudentEmail("New Email");
		Stu.setDateOfBirth("23/09/2000");
		Stu.setStudentAddress("New Address");
		Stu.setStudentEmergencyContact("Sibling");
		Stu.setStudentLearningDifficulty(true);
		
		Stu = stuDAO.save(Stu);
		assertNotNull(Stu, "Student Not Saved");
	}
	
	@Test
	void testTeacherAdd11() {
		Teacher Tea = new Teacher();
		Tea.setTeacherName("Geoffrey");
		Tea.setGender(Gender.MALE);
		Tea.setTeacherEmail("New Email Address");
		Tea.setDepartment(Department.PE);
		Tea.setPosition(Position.PERMANENT);
		Tea.setSalary(Salary.M5);
		
		Tea = teaDAO.save(Tea);
		assertNotNull(Tea, "Teacher Not Saved");
	}

	@Test
	void testSubjectAdd11() {
		Subjects Sub = new Subjects();
		Sub.setSubjectName(SubjectName.PE);
		Sub.setSubjectAssessmentType(SubjectAssessmentType.EXAM);
		
		Sub = subDAO.save(Sub);
		assertNotNull(Sub, "Subject Not Saved");
	}
	
	@Test
	void testStudentAdd12() {
		Students Stu = new Students();
		Stu.setStudentName("Holly");
		Stu.setGender(Gender.FEMALE);
		Stu.setStudentEmail("New Email");
		Stu.setDateOfBirth("14/12/1990");
		Stu.setStudentAddress("New Address");
		Stu.setStudentEmergencyContact("Parent");
		Stu.setStudentLearningDifficulty(false);
		
		Stu = stuDAO.save(Stu);
		assertNotNull(Stu, "Student Not Saved");
	}
	
	@Test
	void testTeacherAdd12() {
		Teacher Tea = new Teacher();
		Tea.setTeacherName("Jack");
		Tea.setGender(Gender.MALE);
		Tea.setTeacherEmail("New Email Address");
		Tea.setDepartment(Department.ARTS);
		Tea.setPosition(Position.PERMANENT);
		Tea.setSalary(Salary.M3);
		
		Tea = teaDAO.save(Tea);
		assertNotNull(Tea, "Teacher Not Saved");
	}

	@Test
	void testSubjectAdd12() {
		Subjects Sub = new Subjects();
		Sub.setSubjectName(SubjectName.ENGLISH);
		Sub.setSubjectAssessmentType(SubjectAssessmentType.PRESENTATION);
		
		Sub = subDAO.save(Sub);
		assertNotNull(Sub, "Subject Not Saved");
	}
}