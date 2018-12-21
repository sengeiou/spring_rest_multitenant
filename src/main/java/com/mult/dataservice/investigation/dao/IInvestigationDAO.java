package com.mult.dataservice.investigation.dao;

import java.util.List;

import com.mult.dataservice.investigation.model.Investigation;

public interface IInvestigationDAO {

	public Investigation findById(Long id);
	public List<Investigation> findAll();
	public void saveOrUpdate(Investigation investigation);
}
