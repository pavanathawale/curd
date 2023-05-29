package com.Internshipe.DemoAPI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudService {
	@Autowired
	StudDao dao;

	public boolean insertData(Student student) {
		return dao.insertData(student);

	}

	public List<Student> getAllStudent() {
		List<Student> student = dao.getAllStudent();
		return student;
	}

	public boolean deleteByStudentId(int studid) {
		return dao.deleteByStudentId(studid);

	}

	public boolean updateByStudentID(int studid) {
	return	dao.updateByStudentID(studid);
	}
}
