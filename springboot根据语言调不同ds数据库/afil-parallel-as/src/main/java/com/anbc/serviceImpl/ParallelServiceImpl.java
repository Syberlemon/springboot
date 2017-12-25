package com.anbc.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anbc.model.UserModel;
import com.anbc.remote.AsRemote;
import com.anbc.remote.EnAsRemote;
import com.anbc.remote.FraAsRemote;
import com.anbc.service.ParallelService;

@Service
public class ParallelServiceImpl implements ParallelService {
	@Autowired
	private EnAsRemote enAsRemote;
	
	@Autowired
	private FraAsRemote fraAsRemote;

	private AsRemote getAsRemote(String language){
		AsRemote asRemote = null;
		if(language.equals("en")){
			asRemote = enAsRemote;
		}else if(language.equals("fra")){
			asRemote = fraAsRemote;
		}
		return asRemote;
	}
	
	@Override
	public List<UserModel> getUsers(String relation, String language) {
		AsRemote asRemote = getAsRemote(language);
		return asRemote.getUsers(relation);
	}

	@Override
	public boolean addUser(String relation, String language, UserModel userModel) {
		System.out.println(userModel);
		AsRemote asRemote = getAsRemote(language);
		return asRemote.addUser(relation, userModel);
	}

}
