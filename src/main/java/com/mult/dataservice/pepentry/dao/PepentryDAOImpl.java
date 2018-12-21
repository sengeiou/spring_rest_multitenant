package com.mult.dataservice.pepentry.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mult.dataservice.common.AbstractDAO;
import com.mult.dataservice.pepentry.model.Pepentry;

@Repository
public class PepentryDAOImpl extends AbstractDAO implements IPepentryDAO{
	

	@Override
	public Pepentry findById(Long id) {
		return getSession().find(Pepentry.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Pepentry> findAll() {
		List<Pepentry> pepentry = getSession().createQuery("SELECT r FROM Pepentry r ORDER BY r.id ASC").getResultList();
		return pepentry;
	}

	
	@Override
	public void saveOrUpdate(Pepentry pepentry) {
		if(pepentry == null){
			getSession().persist(pepentry);
		}else{
			getSession().saveOrUpdate(pepentry);
		}
		
	}
	

}
