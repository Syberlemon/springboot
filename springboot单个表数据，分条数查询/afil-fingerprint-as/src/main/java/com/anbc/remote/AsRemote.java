package com.anbc.remote;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.anbc.model.DistributeModel;
import com.anbc.model.FingerPrintModel;


@FeignClient("afil-fingerprint-ds")
public interface AsRemote {
	@RequestMapping(value = "/getDistributeByRelation/{relation}", method = RequestMethod.GET)
	public List<DistributeModel> getDistributeByRelation(@RequestParam("relation")String relation);
		
	@RequestMapping(value = "/getFingerPrints/{relation}/{start}/{end}", method = RequestMethod.GET)
	public List<FingerPrintModel> getFingerPrints(@RequestParam("relation")String relation,@RequestParam("start")int start,@RequestParam("end")int end);

	@RequestMapping(value = "/addFingerPrint", method = RequestMethod.POST)
	public boolean addFingerPrint(@RequestParam("relation")String relation,@RequestBody FingerPrintModel fingerPrintModel);
}
