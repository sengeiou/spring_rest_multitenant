package com.mult.dataservice.bfibranch.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mult.dataservice.bfibranch.model.DetailBranchInfo;
import com.mult.dataservice.common.AbstractDAO;

@Repository
public class DetailBranchInfoDAOImpl extends AbstractDAO implements IDetailBranchInfoDAO{
	

	@Override
	public DetailBranchInfo findById(Long id) {
		return getSession().find(DetailBranchInfo.class, id);
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly=true)
	@Override
	public List<DetailBranchInfo> findAllBranchInfo() {
		List<DetailBranchInfo> branchList =  getSession().createQuery("SELECT r  FROM DetailBranchInfo r ORDER BY r.id ASC").getResultList();
		return branchList;
	}

	@Override
	public void saveOrUpdate(DetailBranchInfo branchInfo) {
		if(branchInfo.getId() == null){
			 getSession().persist(branchInfo);
		}else{
			 getSession().saveOrUpdate(branchInfo);
		}
		
		
	}

}
