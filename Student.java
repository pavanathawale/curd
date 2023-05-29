package com.Internshipe.DemoAPI;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int studid;
	String name;
	String lastname;
	int Standerd;
	String location;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studid, String name, String lastname, int standerd, String location) {
		super();
		this.studid = studid;
		this.name = name;
		this.lastname = lastname;
		this.Standerd = standerd;
		this.location = location;
	}

	public int getStudid() {
		return studid;
	}

	public void setStudid(int studid) {
		this.studid = studid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getStanderd() {
		return Standerd;
	}

	public void setStanderd(int standerd) {
		Standerd = standerd;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Student [studid=" + studid + ", name=" + name + ", lastname=" + lastname + ", Standerd=" + Standerd
				+ ", location=" + location + "]";
	}

}
