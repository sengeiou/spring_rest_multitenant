package com.mult.dataservice.bfibank.dao;

import java.util.List;

import com.mult.dataservice.bfibank.model.Bfi;

public interface IBfiDAO {

	public Bfi findById(Long id);
	public List<Bfi> findAll();
	public void saveOrUpdate(Bfi bfi);
	
}
