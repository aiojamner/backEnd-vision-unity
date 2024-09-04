package com.vision_unity.company.student;

public record Student(
		int student_id,
		String student_name,
		String student_qulification,
		long student_contact,
		String student_address,
		String[] student_skills) {

}
