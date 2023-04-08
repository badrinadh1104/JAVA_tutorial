package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.AddCourse;
import com.model.Course;
import com.model.Teacher;
import com.model.TeacherDetails;
import com.repository.CourseRepo;
import com.repository.TeacherDetailsRepo;
import com.repository.TeacherRepo;

@RestController
@CrossOrigin
public class TeacherController {
	@Autowired
	private TeacherRepo teacherRepo;

	@Autowired
	private TeacherDetailsRepo detailsRepo;
	
	@Autowired
	private CourseRepo courseRepo;

	@PostMapping(value = "addteacher")
	public Teacher addteacher(@RequestBody Teacher teacher) {
		return teacherRepo.save(teacher);
	}

	@PutMapping(value = "updateTeacher")
	public Teacher updateTeacher(@RequestBody Teacher teacher) {
		Teacher t = teacherRepo.findById(teacher.getId()).get();
		if (t != null) {
			teacherRepo.save(teacher);
			return t;
		} else {
			System.out.println("Error");
			return null;
		}
	}

//	@DeleteMapping(value = "deleteTeacher/{id}")
//	public Teacher deleteTeacher(@PathVariable("id") int id) throws Exception {
//		Teacher t = teacherRepo.getById(id);
//		if (t != null) {
//			teacherRepo.deleteById(id);
//			return t;
//		} else {
//			throw new Exception("User details not found ");
//		}
//	}

	@GetMapping(value = "getAllTeachers")
	public List<Teacher> getallTeacher() {
		return teacherRepo.findAll();
	}

	@GetMapping(value = "getAllTeacherDetails")
	public List<TeacherDetails> getallTeacherDetails() {
		return detailsRepo.findAll();
	}

	@DeleteMapping(value = "deleteTeacherDetails/{id}")
	public TeacherDetails deleteTeacherDetails(@PathVariable("id") int id) throws Exception {
		TeacherDetails t = detailsRepo.getById(id);
		if (t != null) {
			detailsRepo.deleteById(id);
			return t;
		} else {
			throw new Exception("User details not found ");
		}
	}
	
	@PutMapping(value = "addcourse")
	public Teacher addcourse(@RequestBody AddCourse course) throws Exception {
		Teacher t = teacherRepo.getById(course.getTid());
		if(t != null) {
			Course c = new Course();
			c.setName(course.getCname());
			c.setTeacher(t);
			t.addcourse(c);
			courseRepo.save(c);
			return t;
		}else {
			throw new Exception("teacher not found");
		}
	}
	@GetMapping(value = "getCourse")
	public List<Course> getallCourses(){
		return courseRepo.findAll();
	}
	
	@DeleteMapping(value = "deletecourse/{id}")
	public Course deleteCourse(@PathVariable("id") int id) {
		Course c = courseRepo.getById(id);
		courseRepo.deleteById(id);
		return c;
		
	}
	
	@DeleteMapping(value = "deleteteacher/{id}")
	public void removeCourseTeacher(@PathVariable("id") int id) {
		Teacher t = teacherRepo.findById(id).get();
		if(t != null) {
			for(Course course: t.getCourses()) {
				course.setTeacher(null);
				courseRepo.save(course);
			}
			teacherRepo.delete(t);
		}
	}

}
