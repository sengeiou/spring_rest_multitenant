package com.mult.dataservice.ttr.service;

import java.util.List;

import org.json.simple.JSONObject;

import com.mult.dataservice.ttr.model.TtrBase;


public interface ITtrService {

	public TtrBase findById(Long id) throws Exception;

	public List<TtrBase> findAll() throws Exception;

	public void save(JSONObject jsonObject) throws Exception;
}
