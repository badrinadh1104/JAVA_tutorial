package com.repository;

import java.util.List;
import java.util.Optional;

import org.hibernate.annotations.SQLDelete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.security.access.method.P;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Customer;



@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	

	Customer findByEmail(String email);
//
//	@Query("select m from Question m where m.id = :id")
//	public Question findbyid(@Param("id") int id);
//
//
//
//	Customer findByUsername(String username);
//	
//
//	
//	@Query("select m from Customer m where m.username like concat('%',:name,'%')")
//	public List<Customer> getCustomersByNamesearch(@Param("name") String name);
//	
//	
//	void save(Question question);
//
//
//	void save(Answer answer);
//	
//	
//	@Modifying
//	@Transactional
//	@Query("update Question m set m.approved = :response where m.id= :id")
//	public void updateQApprove(@Param("response") String response,@Param("id") int id);
//	
//	@Modifying
//	@Transactional
//	@Query("update Answer m set m.approved = :response where m.id= :id")
//	public void updateAnsApprove(@Param("response") String response,@Param("id") int id);
//	
//	
//	
//	@Modifying
//	@Transactional
//	@Query("update Question m set m.imgurl = :response where m.id= :id")
//	public void updateQImg(@Param("response") String response,@Param("id") int id);
//	
//	@Modifying
//	@Transactional
//	@Query("update Answer m set m.imgurl = :response where m.id= :id")
//	public void updateAnsImg(@Param("response") String response,@Param("id") int id);
//
//	
//	
//	
//	
//	
//	@Query("select m from Question m where m.question like concat('%',:name,'%')")
//	public List<Question> getallsearchQuestion(@Param("name") String name);
//	
//	
//	@Query("select m from Question m where m.Category like concat('%',:name,'%')")
//	public List<Question> getallCategoryQuestion(@Param("name") String name);
//	
//	@Modifying
//	@Transactional
//	@Query("delete from Question m where m.id = :id")
//	public void Deletequestion(@Param("id") int id);
//
//	
//	@Query("select m from Question m where m.userid = :id")
//	public List<Question> findUserQuestion(@Param("id") int id);
//	
//	
//	@Query("select m from Question m")
//	public List<Question> getAllQuestion();
//	
//	@Query("select m from Answer m ")
//	public List<Answer> getAllAnswers();
//	
//	@Modifying
//	@Transactional
//	@Query("delete from Answer m where m.id = :id")
//	public void DeleteAnswer(@Param("id") int id);

	Customer findByUsername(String username);
	
	
	
	

	

	
	
	

}
