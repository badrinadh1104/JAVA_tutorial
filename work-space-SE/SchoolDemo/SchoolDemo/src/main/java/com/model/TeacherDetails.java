package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class TeacherDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int teacherDetailsId;
	private String firstname;
	private String lastname;
	private String email;
	private String gender;
	private int age;
	@OneToOne(mappedBy = "teacherDetails",cascade = CascadeType.ALL)
	@JsonIgnore
	private Teacher teacher;
	public TeacherDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TeacherDetails(int teacherDetailsId, String firstname, String lastname, String email, String gender,
			int age) {
		super();
		this.teacherDetailsId = teacherDetailsId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}
	public int getTeacherDetailsId() {
		return teacherDetailsId;
	}
	public void setTeacherDetailsId(int teacherDetailsId) {
		this.teacherDetailsId = teacherDetailsId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	


}
