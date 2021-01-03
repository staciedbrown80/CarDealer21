package com.web.dealer.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.web.dealer.model.Users;


public interface UsersRepository extends JpaRepository<Users, Long>{

	//add queries for search
	@Query("FROM Users WHERE email=?1 OR fname=?1 OR lname=?1")
		List<Users> seachUser(String keyword);
		
		@Query("SELECT u FROM Users u WHERE u.email =:email AND " +
	  		  "u.fname LIKE (CONCAT('%',:name, '%')) OR u.lname =:name")
		List<Users> customerseachUser(@Param("name") String name, @Param("email") String email);

	
}
