package com.anbc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.anbc.model.DistributeModel;
import com.anbc.model.FingerPrintModel;

@Mapper
public interface ParallelDao {
	@Select("select * from afil_distribute where tablename = #{relation}")
	List<DistributeModel> getDistributeByRelation(@Param("relation")String relation);
	
	@Select("select * from ${relation} limit #{start},#{end}")
	List<FingerPrintModel> getFingerPrints(@Param("relation")String relation,@Param("start")int start,@Param("end")int end);

	@Insert("insert into ${relation}(name,finger) values(#{fingerPrintModel.name},#{fingerPrintModel.finger})")
	boolean addFingerPrint(@Param("relation")String relation, @Param("fingerPrintModel") FingerPrintModel fingerPrintModel);
}
