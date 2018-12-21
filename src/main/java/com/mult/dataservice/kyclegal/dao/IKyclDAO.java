package com.mult.dataservice.kyclegal.dao;

import java.util.List;

import com.mult.dataservice.kyclegal.model.Kycl;

public interface IKyclDAO {
	
	public Kycl findById(Long id);
	public List<Kycl> findAllKycl();
	public Long saveOrUpdate(Kycl kycl);

}
