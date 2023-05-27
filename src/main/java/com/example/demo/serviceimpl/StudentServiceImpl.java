package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.StudentRepoository;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepoository repo;

	@Override
	public void addStudent(StudentEntity student) {
		// TODO Auto-generated method stub
		repo.save(student);

	}

	@Override
	public StudentEntity getSudentById(int id) {
		// TODO Auto-generated method stub
		return repo.getById(id);
	}

	@Override
	public List<StudentEntity> getAllStudents() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void updateBranch(int id, String branch) {
		// TODO Auto-generated method stub
		StudentEntity s = repo.getById(id);
		s.setBranch(branch);
		repo.save(s);

	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);

	}

}
