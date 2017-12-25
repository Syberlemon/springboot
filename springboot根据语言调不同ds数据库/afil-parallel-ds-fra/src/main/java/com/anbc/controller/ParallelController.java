package com.anbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anbc.dao.ParallelDao;
import com.anbc.model.UserModel;

@RestController
public class ParallelController {
	
	@Autowired
	private ParallelDao languageDao;
	
	@GetMapping(value="/getUsers")
	public List<UserModel> getUsers(@RequestParam("relation")String relation) {
		return languageDao.getUsers(relation);
	}
	
	@PostMapping(value="/addUser")
	public boolean addUser(@RequestParam("relation")String relation,@RequestBody UserModel userModel) {
		return languageDao.addUser(relation,userModel);
	}
}
