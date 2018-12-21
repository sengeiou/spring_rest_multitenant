package com.mult.dataservice.screeningnatural.dao;

import java.util.List;

import com.mult.dataservice.screeningnatural.model.ScreeningAction;
import com.mult.dataservice.screeningnatural.model.ScreeningNRequest;

public interface IScreeningNRequestDAO {


	public ScreeningNRequest findByFirstName(String firstName);
	public Long saveOrUpdate(ScreeningNRequest screeningN);
	public void deleteScreeningN(ScreeningNRequest screeningN);
	public ScreeningNRequest findById(Long id);
	public List<ScreeningNRequest> findAll();	
	public void screeningActionUpdate(ScreeningAction action, Long screeningId);
	
	public List<ScreeningNRequest> findByApproved(boolean approved);
	public List<ScreeningNRequest> findByAction(boolean approved);
	public List<ScreeningNRequest> findByRepliedAndAction(boolean replied,boolean action);
	public String findScreeningDataProcedure();
}
