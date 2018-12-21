package com.mult.dataservice.ttr.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mult.dataservice.common.AbstractDAO;
import com.mult.dataservice.ttr.model.TtrBase;

@Repository
public class TtrDAOImpl extends AbstractDAO implements ITtrDAO {

	@Override
	public TtrBase findById(Long id) {
		return getSession().find(TtrBase.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TtrBase> findAll() {
		List<TtrBase> ttrList = getSession().createQuery("SELECT r FROM TtrBase r ORDER BY r.id ASC").getResultList();
		return ttrList;
	}

	@Override
	public void saveOrUpdate(TtrBase ttr) {
		if (ttr.getId() == null) {
			getSession().persist(ttr);
		} else {
			getSession().saveOrUpdate(ttr);
		}

	}

}
