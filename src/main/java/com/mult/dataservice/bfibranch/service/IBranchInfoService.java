package com.mult.dataservice.bfibranch.service;

import java.util.List;

import com.mult.dataservice.bfibranch.model.DetailBranchInfo;

public interface IBranchInfoService {

	public DetailBranchInfo findById(Long id) throws Exception;
	public List<DetailBranchInfo> findAllBranchInfo() throws Exception;
	public void save(DetailBranchInfo branchInfo) throws Exception;
}
