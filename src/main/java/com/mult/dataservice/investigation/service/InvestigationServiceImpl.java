package com.mult.dataservice.investigation.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mult.dataservice.investigation.dao.IInvestigationDAO;
import com.mult.dataservice.investigation.model.Investigation;

@Service("investigationService")
@Transactional
public class InvestigationServiceImpl implements IInvestigationService{
	@Autowired
	IInvestigationDAO investigationDao;

	@Override
	public Investigation findById(Long id) throws Exception {
		return investigationDao.findById(id);
	}

	@Override
	public List<Investigation> findAll() throws Exception {
		return investigationDao.findAll();
	}

	@Override
	public void save(Investigation investigation) throws Exception {
	 try{
		 investigation.getPersonalInfo().setInvestigation(investigation);
	 }catch(NullPointerException ex){
		 ex.getMessage();
	 }
	 
	 try{
	 investigation.getAddressInfo().stream().filter(Objects::nonNull).forEach(r -> r.setInvestigation(investigation));
	 }catch(NullPointerException ex){
		 ex.getMessage();
	 }
	 try{
	 investigation.getFamilyInfo().stream().filter(Objects::nonNull).forEach(r -> r.setInvestigation(investigation));
	 }catch(NullPointerException ex){
		 ex.getMessage();
	 }
	 try{
	 investigation.getInvestigationMediaInfo().stream().filter(Objects::nonNull).forEach(r -> r.setInvestigation(investigation));
	 }catch(NullPointerException ex){
		 ex.getMessage();
	 }
	 try
	 {
	 investigation.getOfficeInfo().stream().filter(Objects::nonNull).forEach(r -> r.setInvestigation(investigation));
	 }catch(NullPointerException ex){
		 ex.getMessage();
	 }
	 investigationDao.saveOrUpdate(investigation);
		
	}

}
