package com.mult.dataservice.kyclegal.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mult.dataservice.kyclegal.dao.IKyclDAO;
import com.mult.dataservice.kyclegal.model.Kycl;

@Service("kyclService")
@Transactional
public class KyclServiceImpl implements IKyclService {

	@Autowired
	IKyclDAO kyclDao;

	@Override
	public Kycl findById(Long id) throws Exception {
		return kyclDao.findById(id);
	}

	@Override
	public List<Kycl> findAllKycl() throws Exception {
		return kyclDao.findAllKycl();
	}

	@Override
	public Long save(Kycl kycl) throws Exception {

		try{
			kycl.getComplianceInfo().setKycl(kycl);
		}catch(NullPointerException ex){
			ex.getMessage();
		}

		try{
			kycl.getFinancialInfo().setKycl(kycl);
		}catch(NullPointerException ex){
			ex.getMessage();
		}

		try{
			kycl.getLegal().setKycl(kycl);
		}catch(NullPointerException ex){
			ex.getMessage();
		}

		try{
			kycl.getUser().setKycl(kycl);
		}catch(NullPointerException ex){
			ex.getMessage();
		}

		try{
		kycl.getListAccountInfo().stream().filter(Objects::nonNull).forEach(r -> r.setKycl(kycl));
		}catch(NullPointerException ex){
			ex.getMessage();
		}
		try{
		kycl.getListAddress().stream().filter(Objects::nonNull).forEach(r -> r.setKycl(kycl));
		}catch(NullPointerException ex){
			ex.getMessage();
		}
		try{
		kycl.getListAuditInfo().stream().filter(Objects::nonNull).forEach(r -> r.setKycl(kycl));
		}catch(NullPointerException ex){
			ex.getMessage();
		}
		try{
		kycl.getListBusinessInfo().stream().filter(Objects::nonNull).forEach(r -> r.setKycl(kycl));
		}catch(NullPointerException ex){
			ex.getMessage();
		}
		try{
		kycl.getListDocumentStatus().stream().filter(Objects::nonNull).forEach(r -> r.setKycl(kycl));
		}catch(NullPointerException ex){
			ex.getMessage();
		}
		try{
		kycl.getListLandlordAddress().stream().filter(Objects::nonNull).forEach(r -> r.setKycl(kycl));
		}catch(NullPointerException ex){
			ex.getMessage();
		}
		try{
		kycl.getListRegistrationAddress().stream().filter(Objects::nonNull).forEach(r -> r.setKycl(kycl));
		}catch(NullPointerException ex){
			ex.getMessage();
		}
		try{
		kycl.getListRegistrationInfo().stream().filter(Objects::nonNull).forEach(r -> r.setKycl(kycl));
		}catch(NullPointerException ex){
			ex.getMessage();
		}
		try{
		kycl.getListRelatedEntityInfo().stream().filter(Objects::nonNull).forEach(r -> r.setKycl(kycl));
		}catch(NullPointerException ex){
			ex.getMessage();
		}
		try{
		kycl.getListRelatedPerson().stream().filter(Objects::nonNull).forEach(r -> r.setKycl(kycl));
		}catch(NullPointerException ex){
			ex.getMessage();
		}
		
		
		return kyclDao.saveOrUpdate(kycl);

	}

}
