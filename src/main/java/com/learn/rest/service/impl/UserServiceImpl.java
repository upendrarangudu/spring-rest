package com.learn.rest.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.rest.repository.UserRepository;
import com.learn.rest.services.UserService;
import com.learn.rest.vo.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userDao;
	
	@Override
	public List<User> getUsers() {
		return userDao.findAll();
	}

	@Override
	public Optional<User> getUser(String id) {
		return userDao.findById(Integer.parseInt(id));
	}

	@Override
	public void addUser(User user) {
		userDao.save(user);
	}

	@Override
	public void updateUser(User user) {
		userDao.save(user);
	}

	@Override
	public void deleteUser(String id) {
		userDao.deleteById(Integer.parseInt(id));
	}

	@Override
	public User getUserByName(String userName) {
		return userDao.getUserByName(userName);
	}
	
	
}
