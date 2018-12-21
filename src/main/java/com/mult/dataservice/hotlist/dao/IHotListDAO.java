package com.mult.dataservice.hotlist.dao;

import java.util.List;

import com.mult.dataservice.hotlist.model.HotList;

public interface IHotListDAO {

	public HotList findById(Long id);
	public List<HotList>  findAll();
	public Long saveOrUpdate(HotList hotList);
}
