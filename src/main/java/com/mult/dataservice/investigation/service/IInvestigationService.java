package com.mult.dataservice.investigation.service;

import java.util.List;

import com.mult.dataservice.investigation.model.Investigation;

public interface IInvestigationService {

	public Investigation findById(Long id) throws Exception;
	public List<Investigation> findAll() throws Exception;
	public void save(Investigation investigation) throws Exception;
}
