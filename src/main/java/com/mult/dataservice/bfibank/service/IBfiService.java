package com.mult.dataservice.bfibank.service;

import java.util.List;

import com.mult.dataservice.bfibank.model.Bfi;

public interface IBfiService {

	public Bfi findById(Long id) throws Exception;
	public List<Bfi> findAll() throws Exception;
	public void saveOrUpdate(Bfi bfi) throws Exception;
}
