package com.anbc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.anbc.model.UserModel;

@Mapper
public interface ParallelDao {

	@Select("select * from ${relation}")
	List<UserModel> getUsers(@Param("relation")String relation);

	@Insert("insert into ${relation}(name,password) values(#{userModel.name},#{userModel.password})")
	boolean addUser(@Param("relation")String relation, @Param("userModel") UserModel userModel);
}
