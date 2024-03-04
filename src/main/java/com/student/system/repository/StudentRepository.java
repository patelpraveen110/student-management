package com.student.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.system.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
