package com.student.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.system.model.Student;
import com.student.system.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student student) {
		Student savedStudent = studentRepository.save(student);
		return savedStudent;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> result = studentRepository.findAll();
		return result;
	}

}
