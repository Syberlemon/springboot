package com.anbc.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anbc.model.DistributeModel;
import com.anbc.model.FingerPrintModel;
import com.anbc.remote.AsRemote;
import com.anbc.service.ParallelService;

@Service
public class ParallelServiceImpl implements ParallelService {
	@Autowired
	private AsRemote asRemote;
	
	@Override
	public List<DistributeModel> getDistributeByRelation(String relation) {
		return asRemote.getDistributeByRelation(relation);
	}
	
	@Override
	public List<FingerPrintModel> getFingerPrints(String relation, int start, int end) {
		return asRemote.getFingerPrints(relation, start, end);
	}

	@Override
	public boolean addFingerPrint(String relation, FingerPrintModel fingerPrintModel) {
		return asRemote.addFingerPrint(relation, fingerPrintModel);
	}

}
