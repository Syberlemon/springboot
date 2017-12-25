package com.anbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anbc.model.UserModel;
import com.anbc.service.ParallelService;

@RestController
public class ParallelController {
	
	@Autowired
	private ParallelService parallelService;
	
	@GetMapping(value="/getUsers")
	public List<UserModel> getUsers(@RequestParam("relation")String relation,@RequestParam("language")String language) {
		return parallelService.getUsers(relation, language);
	}
	
	@PostMapping(value="/addUser")
	public boolean addUser(@RequestParam("relation")String relation,@RequestParam("language")String language,@RequestBody UserModel userModel) {
		return parallelService.addUser(relation,language,userModel);
	}
}
