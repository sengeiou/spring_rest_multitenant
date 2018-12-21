package com.mult.dataservice.pepentry.dao;

import java.util.List;

import com.mult.dataservice.pepentry.model.Pepentry;

public interface IPepentryDAO {

	public Pepentry findById(Long id);
	public List<Pepentry>  findAll();
	public void saveOrUpdate(Pepentry pepentry);
}
