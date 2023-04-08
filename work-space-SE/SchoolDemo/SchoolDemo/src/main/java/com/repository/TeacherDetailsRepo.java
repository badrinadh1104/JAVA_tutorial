package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.TeacherDetails;

@Repository
public interface TeacherDetailsRepo extends JpaRepository<TeacherDetails, Integer>{

}
