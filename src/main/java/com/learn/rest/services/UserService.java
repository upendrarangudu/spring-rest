package com.learn.rest.services;

import java.util.List;
import java.util.Optional;

import com.learn.rest.vo.User;

public interface UserService {

	public List<User> getUsers();
	
	public Optional<User> getUser(String id);
	
	public void addUser(User user);
	
	public void updateUser (User user);
	
	public void deleteUser(String id);
	
	public User getUserByName(String userName);
}
