package com.mult.dataservice.screeninglegal.dao;

import java.util.List;

import com.mult.dataservice.screeninglegal.model.ScreeningLRequest;

public interface IScreeningLDAO {

	public Long saveOrUpdate(ScreeningLRequest screening);

	public void deleteScreeningL(ScreeningLRequest screening);

	public ScreeningLRequest findById(Long id);

	public List<ScreeningLRequest> findAll();
	
	public List<ScreeningLRequest> findByApproved(boolean approved);
	public List<ScreeningLRequest> findByAction(boolean approved);
	public List<ScreeningLRequest> findByRepliedAndAction(boolean replied,boolean action);


}
