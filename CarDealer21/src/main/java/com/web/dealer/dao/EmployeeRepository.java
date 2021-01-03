package com.web.dealer.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.web.dealer.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	//add queries for search
	@Query("FROM Employee WHERE email=?1 OR fname=?1 OR lname=?1")
		List<Employee> seachUser(String keyword);
		
		@Query("SELECT e FROM Employee e WHERE e.email =:email AND " +
	  		  "e.fname LIKE (CONCAT('%',:name, '%')) OR e.lname =:name")
		List<Employee> customerseachUser(@Param("name") String name, @Param("email") String email);

	
}
