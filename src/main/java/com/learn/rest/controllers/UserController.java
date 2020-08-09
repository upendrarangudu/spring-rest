package com.learn.rest.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.rest.services.UserService;
import com.learn.rest.vo.User;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@Value("${user.test}")
	private String firstName;
	
	@GetMapping("/get-users")
	public List<User> getUsers() {
		System.out.println("In getUsers() method" + firstName);
		System.out.println("Testing GIT...");
		return userService.getUsers();
	}

	@GetMapping("/get-user/{id}")
	public Optional<User> getUser(@PathVariable String id) {
		System.out.println("In getUser() method");
		return userService.getUser(id);
	}

	@PostMapping("/add-user")
	public void addUser(@RequestBody User user) {
		System.out.println("In addUser() method");
		userService.addUser(user);
	}

	@PutMapping("/update-user")
	public void updateUser(@RequestBody User user) {
		System.out.println("In updateUser() method");
		userService.updateUser(user);
	}

	@DeleteMapping("/delete-user/{id}")
	public void deleteUser(@PathVariable Integer id) {
		System.out.println("In deleteUser() method");
		userService.deleteUser(id.toString());
	}
	
	@GetMapping("/get-user-by-name/{name}")
	public User getUserByName(@PathVariable("name") String userName) {
		System.out.println("In getUserByName() method " +userName);
		return userService.getUserByName(userName);
	}
}
