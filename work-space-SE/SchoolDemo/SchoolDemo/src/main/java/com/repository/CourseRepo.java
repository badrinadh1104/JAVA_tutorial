package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Course;

public interface CourseRepo extends JpaRepository<Course, Integer>{

}
