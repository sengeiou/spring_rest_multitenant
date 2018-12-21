package com.mult.dataservice.kycnatural.dao;

import java.util.List;

import com.mult.dataservice.kycnatural.model.KycnBase;

public interface IKycnBaseDAO {
	public KycnBase findById(Long id);
	public List<KycnBase> findAllKycn();
	public Long saveOrUpdate(KycnBase kycnBase);

}
