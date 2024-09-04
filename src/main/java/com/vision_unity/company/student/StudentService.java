package com.vision_unity.company.student;

import java.util.List;

public interface StudentService {

	List<Student> getAllStudentDetails();

	Student getStudentDetailsById(int student_id);

	Student getStudentDetailsByName(String student_name);

	void addStudentDetails(Student student);

	List<StudentStatus> getAllStudentStsDetails();

	StudentStatus getStudentStsDetailsById(int student_id);

	StudentStatus getStudentStsDetailsByName(String student_name);

	void addStudentStsDetails(StudentStatus studentSts);

}
