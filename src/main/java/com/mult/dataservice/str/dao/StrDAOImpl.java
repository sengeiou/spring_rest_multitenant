package com.mult.dataservice.str.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mult.dataservice.common.AbstractDAO;
import com.mult.dataservice.str.model.StrBase;

@Repository
public class StrDAOImpl extends AbstractDAO implements IStrDAO{
	
	@Override
	public StrBase findById(Long id) {
		return getSession().find(StrBase.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<StrBase> findAll() {
		List<StrBase> strList =  getSession().createQuery("SELECT r FROM StrBase r ORDER BY r.id ASC").getResultList();
		return strList;
	}

	@Override
	public void saveOrUpdate(StrBase str) {
		if(str.getId() == null){
			 getSession().persist(str);
		}else{
			 getSession().saveOrUpdate(str);
		}
		
	}

}
