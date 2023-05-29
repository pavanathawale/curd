package com.Internshipe.DemoAPI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudController {
	@Autowired
	StudService service;

	@PostMapping("saveData")
	public boolean insertData(@RequestBody Student student) {
		boolean inserted = service.insertData(student);
		return inserted;

	}

	@GetMapping("show")
	public List<Student> getAllStudent() {
		List<Student> student = service.getAllStudent();
		return student;
	}

	@DeleteMapping("delete/{studid}")
	public boolean deleteByStudentId(@PathVariable int studid) {
		boolean deleted = service.deleteByStudentId(studid);
		return deleted;
	}

	@PostMapping("update/{studid}")
	public boolean updateByStudentID(@RequestBody int studid) {
		boolean updated = service.updateByStudentID(studid);
		return updated;
	}

}
