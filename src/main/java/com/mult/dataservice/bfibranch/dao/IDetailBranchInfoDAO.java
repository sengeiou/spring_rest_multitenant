package com.mult.dataservice.bfibranch.dao;

import java.util.List;

import com.mult.dataservice.bfibranch.model.DetailBranchInfo;

public interface IDetailBranchInfoDAO {
	

	public DetailBranchInfo findById(Long id);
	public List<DetailBranchInfo> findAllBranchInfo();
	public void saveOrUpdate(DetailBranchInfo branchInfo);
}
