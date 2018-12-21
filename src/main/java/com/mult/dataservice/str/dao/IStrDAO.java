package com.mult.dataservice.str.dao;

import java.util.List;

import com.mult.dataservice.str.model.StrBase;

public interface IStrDAO {

	public StrBase findById(Long id);

	public List<StrBase> findAll();

	public void saveOrUpdate(StrBase ttr);
}
