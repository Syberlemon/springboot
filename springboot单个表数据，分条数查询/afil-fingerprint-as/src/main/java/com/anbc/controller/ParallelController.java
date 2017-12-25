package com.anbc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anbc.model.DistributeModel;
import com.anbc.model.FingerPrintModel;
import com.anbc.service.ParallelService;

@RestController
public class ParallelController {
	
	@Autowired
	private ParallelService parallelService;
	
	@GetMapping(value="/getFingerPrints/{relation}")
	public List<FingerPrintModel> getFingerPrints(@PathVariable("relation")String relation) {
		List<FingerPrintModel> FingerprintList = new ArrayList<FingerPrintModel>();
		List<FingerPrintModel> FingerprintPart = new ArrayList<FingerPrintModel>();
		List<DistributeModel> distributeList = parallelService.getDistributeByRelation(relation);
		for (DistributeModel distributeModel : distributeList) {
			FingerprintPart = parallelService.getFingerPrints(relation,distributeModel.getStart(),distributeModel.getEnd()-distributeModel.getStart());
			FingerprintList.addAll(FingerprintPart);
			FingerprintPart = new ArrayList<FingerPrintModel>();
		}
		return FingerprintList;
	}
	
	@PostMapping(value="/addFingerPrint")
	public boolean addFingerPrint(@RequestParam("relation")String relation,@RequestBody FingerPrintModel fingerPrintModel) {
		return parallelService.addFingerPrint(relation,fingerPrintModel);
	}
}
