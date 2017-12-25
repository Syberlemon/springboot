package com.anbc.service;

import java.util.List;

import com.anbc.model.UserModel;

public interface ParallelService {

	List<UserModel> getUsers(String relation, String language);

	boolean addUser(String relation, String language, UserModel userModel);

}
