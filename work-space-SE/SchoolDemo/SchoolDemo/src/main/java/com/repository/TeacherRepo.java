package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Teacher;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher,Integer> {
	

}
