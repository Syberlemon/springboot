package com.anbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anbc.dao.ParallelDao;
import com.anbc.model.DistributeModel;
import com.anbc.model.FingerPrintModel;

@RestController
public class ParallelController {
	
	@Autowired
	private ParallelDao parallelDao;
	
	@GetMapping(value="/getDistributeByRelation/{relation}")
	List<DistributeModel> getDistributeByRelation(@PathVariable("relation")String relation){
		return parallelDao.getDistributeByRelation(relation);
	}
	
	@GetMapping(value="/getFingerPrints/{relation}/{start}/{end}")
	public List<FingerPrintModel> getFingerPrints(@PathVariable("relation")String relation,@PathVariable("start")int start,@PathVariable("end")int end) {
		return parallelDao.getFingerPrints(relation,start,end);
	}
	
	@PostMapping(value="/addFingerPrint")
	public boolean addFingerPrint(@RequestParam("relation")String relation,@RequestBody FingerPrintModel fingerPrintModel) {
		return parallelDao.addFingerPrint(relation,fingerPrintModel);
	}
}
