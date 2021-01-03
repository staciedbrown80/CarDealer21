package com.web.dealer.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.web.dealer.model.Accounts;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {
	
	Optional<Accounts> findByEmail(String email);
	
	@Query("FROM Accounts WHERE email=?1 AND password=?2")
	Optional<Accounts> login(String email, String password);
	
	@Query("FROM Accounts WHERE fname = ?1 OR lname=?1 OR email=?1")
	List<Accounts> search(String keyword);
	
	@Query("FROM Accounts WHERE fname = ?1 OR lname=?1 OR email=?2")
	List<Accounts> search(String fname, String email);
	
	
	@Query("SELECT a FROM Accounts a WHERE a.email =:email AND " +
	  		  "a.fname LIKE (CONCAT('%',:name, '%')) OR a.lname =:name")
	List<Accounts> customerseachUser(@Param("name") String name, @Param("email") String email);

}
