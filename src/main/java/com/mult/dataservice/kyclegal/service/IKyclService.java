package com.mult.dataservice.kyclegal.service;

import java.util.List;

import com.mult.dataservice.kyclegal.model.Kycl;

public interface IKyclService {
	public Kycl findById(Long id) throws Exception;
	public List<Kycl> findAllKycl() throws Exception;
	public Long save(Kycl kycl) throws Exception;
}
