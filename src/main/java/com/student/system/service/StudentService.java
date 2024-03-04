package com.student.system.service;

import java.util.List;

import com.student.system.model.Student;

//@Component
public interface StudentService {
	
	public Student saveStudent(Student student);
	
	public List<Student> getAllStudent();

}
