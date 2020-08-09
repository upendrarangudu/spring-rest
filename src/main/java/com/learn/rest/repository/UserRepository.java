package com.learn.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.learn.rest.vo.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	@Query("SELECT u from User u where u.userName=:user")
	public User getUserByName(@Param("user") String userName);

}
 