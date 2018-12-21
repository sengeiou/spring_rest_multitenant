package com.mult.dataservice.screeninglegal.service;

import java.util.List;

import com.mult.dataservice.screeninglegal.model.ScreeningLRequest;
import com.mult.dataservice.screeninglegal.model.ScreeningLRequestData;
import com.mult.dataservice.screeningnatural.model.ScreeningAction;

public interface IScreeningLegalService {

	public Long save(ScreeningLRequest screening) throws Exception;	
	public ScreeningLRequest findById(Long id) throws Exception;
	public List<ScreeningLRequest> findAll() throws Exception;
	public void screeningActionUpdate(ScreeningAction action, Long screeningId) throws Exception;
	public List<ScreeningLRequest> findByAction(boolean action) throws Exception;
	public List<ScreeningLRequest> findByReply(boolean replied, boolean action) throws Exception;
	public void screeningReplyUpdate(ScreeningLRequestData requestData, Long screeningId) throws Exception;
	
}
