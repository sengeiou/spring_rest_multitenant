package com.mult.dataservice.investigation.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mult.dataservice.common.AbstractDAO;
import com.mult.dataservice.investigation.model.Investigation;

@Repository
public class InvestigationDAOImpl extends AbstractDAO implements IInvestigationDAO{
	

	@Override
	public Investigation findById(Long id) {
		return getSession().find(Investigation.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Investigation> findAll() {
		return getSession().createQuery("SELECT r FROM Investigation r ORDER BY r.id ASC").getResultList();
	}

	@Override
	public void saveOrUpdate(Investigation investigation) {
	   if(investigation.getId() == null){
		   getSession().persist(investigation);
	   }else{
		   getSession().saveOrUpdate(investigation);
	   }
		
	}

}
