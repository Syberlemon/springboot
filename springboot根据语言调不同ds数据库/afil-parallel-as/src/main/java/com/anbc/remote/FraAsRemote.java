package com.anbc.remote;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.anbc.model.UserModel;

@FeignClient(name="afil-parallel-fra-ds")
public interface FraAsRemote extends AsRemote{
	@RequestMapping(value = "/getUsers", method = RequestMethod.GET)
	public List<UserModel> getUsers(@RequestParam("relation")String relation);

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public boolean addUser(@RequestParam("relation")String relation,@RequestBody UserModel userModel);
}
