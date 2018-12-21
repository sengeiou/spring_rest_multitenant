package com.mult.dataservice.kycnatural.service;

import java.util.List;

import com.mult.dataservice.kycnatural.model.KycnBase;

public interface IKycnService {
	public KycnBase findById(Long id) throws Exception;
	public List<KycnBase> findAllKycn() throws Exception;
	public Long save(KycnBase kycnBase) throws Exception;
}
