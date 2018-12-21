package com.mult.dataservice.adversemedia.dao;

import java.util.List;

import com.mult.dataservice.adversemedia.model.AdverseMedia;

public interface IAdverseMediaDAO {

	public AdverseMedia findById(Long id);
	public List<AdverseMedia> findAll();
	public Long saveOrUpdate(AdverseMedia media);
}
