package com.mult.dataservice.bfibranch.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mult.dataservice.bfibranch.dao.IDetailBranchInfoDAO;
import com.mult.dataservice.bfibranch.model.DetailBranchInfo;

@Service("branchInfoService")
@Transactional
public class BranchInfoServiceImpl implements IBranchInfoService {

	@Autowired
	IDetailBranchInfoDAO branchDao;

	@Override
	public DetailBranchInfo findById(Long id) throws Exception {
		return branchDao.findById(id);
	}

	@Override
	public List<DetailBranchInfo> findAllBranchInfo() throws Exception {
		return branchDao.findAllBranchInfo();
	}

	@Override
	public void save(DetailBranchInfo branchInfo) throws Exception {
		try {
			branchInfo.getBranchInfo().setDetailBranchInfo(branchInfo);
		} catch (NullPointerException ex) {
			ex.getMessage();
		}
		try {
			branchInfo.getListAddress().stream().filter(Objects::nonNull)
					.forEach(r -> r.setDetailBranchInfo(branchInfo));
		} catch (NullPointerException ex) {
			ex.getMessage();
		}
		try {
			branchInfo.getListContact().stream().filter(Objects::nonNull)
					.forEach(r -> r.setDetailBranchInfo(branchInfo));
		} catch (NullPointerException ex) {
			ex.getMessage();
		}
		try {
			branchInfo.getListEmail().stream().filter(Objects::nonNull).forEach(r -> r.setDetailBranchInfo(branchInfo));
		} catch (NullPointerException ex) {
			ex.getMessage();
		}

		branchDao.saveOrUpdate(branchInfo);

	}

}
