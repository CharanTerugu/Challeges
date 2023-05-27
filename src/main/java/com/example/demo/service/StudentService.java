package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.entity.StudentEntity;

@Component
public interface StudentService {

	void addStudent(StudentEntity student);

	StudentEntity getSudentById(int id);

	List<StudentEntity> getAllStudents();

	void updateBranch(int id, String branch);

	void deleteStudent(int id);
}
