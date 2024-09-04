package com.vision_unity.company.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	StudentService service;
	
	
	
	//Student Table Operations
	
	@GetMapping("/student-all-details")
	public List<Student> getAllStudentDetails(){
		return service.getAllStudentDetails();
	}
	
	@GetMapping("/student-detail-id/{student_id}")
	public Student getStudentDetailsById(@PathVariable int student_id) {
		return service.getStudentDetailsById(student_id);
	}
	
	@GetMapping("/student-detail-name/{stduent_name}")
	public Student getStudentDetailsByName(@PathVariable String student_name) {
		return service.getStudentDetailsByName(student_name);
	}
	
	@PostMapping("/student-add-details")
	public void addStudentDetails(@RequestBody Student student) {
		service.addStudentDetails(student);
	}
	
	
	//StudentStatus Table Operations
	
	@GetMapping("/student-all-sts-details")
	public List<StudentStatus> getAllStudentStsDetails(){
		return service.getAllStudentStsDetails();
	}
	
	@GetMapping("/student-sts-detail-id/{student_id}")
	public StudentStatus getStudentStsDetailsById(@PathVariable int student_id) {
		return service.getStudentStsDetailsById(student_id);
	}
	
	@GetMapping("/student-sts-detail-name/{stduent_name}")
	public StudentStatus getStudentStsDetailsByName(@PathVariable String student_name) {
		return service.getStudentStsDetailsByName(student_name);
	}
	
	@PostMapping("/student-add-sts-details")
	public void addStudentStsDetails(@RequestBody StudentStatus student) {
		service.addStudentStsDetails(student);
	}
}
