package com.anbc.service;

import java.util.List;

import com.anbc.model.DistributeModel;
import com.anbc.model.FingerPrintModel;

public interface ParallelService {
	
	List<DistributeModel> getDistributeByRelation(String relation);

	List<FingerPrintModel> getFingerPrints(String relation, int start, int end);

	boolean addFingerPrint(String relation, FingerPrintModel fingerPrintModel);

}
