package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.service.UserService;

@RestController
@CrossOrigin
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping(value = "AddUser")
	public User AddUser(@RequestBody User user) {
		return userService.AddUser(user);
	}
	@PutMapping(value = "AddtoWishlist/{uid}/{pid}")
	public User AddtoWishlist(@PathVariable("uid") int uid,@PathVariable("pid") int pid) throws Exception {
		return userService.AddtoWishlist(uid,pid);
	}
	@GetMapping(value = "AllUsers")
	public List<User> getAllUsers(){
		return userService.getAllusers();
	}
	@PutMapping(value = "RemoveProductFromWishList/{uid}/{pid}")
	public User RemoveProductFromWishList(@PathVariable("uid") int uid,@PathVariable("pid") int pid) throws Exception {
		return userService.RemoveProductFromWishList(uid,pid);
	}

}
