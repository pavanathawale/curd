package com.Internshipe.DemoAPI;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudDao {
	@Autowired
	SessionFactory sf;

	public boolean insertData(Student student) {
		Session session = sf.openSession();
		session.save(student);
		session.close();
		return true;
	}

	public List<Student> getAllStudent() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Student.class);
		List<Student> student = criteria.list();
		session.close();
		return student;
	}

	public boolean deleteByStudentId(int studid) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Student stud = session.get(Student.class, studid);
		session.delete(stud);
		tr.commit();
		session.close();
		return true;
	}

	public boolean updateByStudentID(int studid) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Student students = session.get(Student.class, studid);
		session.update(students);
		tr.commit();
		session.close();
		return true;
	}

}
