package com.vision_unity.company.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

	
	//Student Table Operations
	
	
	List<Student> students = new ArrayList<>(Arrays.asList(
			new Student(101, "Rahul Naik", "B.com", 39475, "Jalgaon", new String[] {"B.com", "M.com"}),
			new Student(102, "Varun Naik", "B.M.S.", 34967, "Jalgaon", new String[] {"B.com", "M.com"})));
	
	
	@Override
	public List<Student> getAllStudentDetails() {
		return students;
	}

	@Override
	public Student getStudentDetailsById(int student_id) {
		return students.stream()
				.filter(c -> c.student_id() == student_id)
				.findFirst().orElse(new Student(0, "No Data", "", 0, "", new String[] {""}));
	}

	@Override
	public Student getStudentDetailsByName(String student_name) {
		return students.stream()
				.filter(c -> c.student_name().equals(student_name))
				.findFirst().orElse(new Student(0, "No Data", "", 0, "", new String[] {""});
	}

	@Override
	public void addStudentDetails(Student student) {
		students.add(student);
	}

	
	//StudentStatus Table Operations
	
	List<StudentStatus> studentSts = new ArrayList<>(Arrays.asList(
			new StudentStatus(101,101,101,"SE","Full Time"),
			new StudentStatus(102,102,102,"SSE","Full Time")));
	
	
	
	@Override
	public List<StudentStatus> getAllStudentStsDetails() {
		return studentSts;
	}

	@Override
	public StudentStatus getStudentStsDetailsById(int student_id) {
		return studentSts.stream()
				.filter(c -> c.student_id() == student_id)
				.findFirst().orElse(new StudentStatus(0, 0, 0, "No Data", ""));
	}

//	@Override
//	public StudentStatus getStudentStsDetailsByName(String student_name) {
//		return studentSts.stream()
//				.filter(c -> c.s);
//	}

	@Override
	public void addStudentStsDetails(StudentStatus student) {
		// TODO Auto-generated method stub
		
	}

	
}
