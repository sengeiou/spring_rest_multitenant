package com.mult.dataservice.hotlist.service;

import java.util.List;

import com.mult.dataservice.hotlist.model.HotList;

public interface IHotListService {

	public HotList findById(Long id) throws Exception;
	public List<HotList>  findAll() throws Exception;
	public Long save(HotList hotList) throws Exception;
}
