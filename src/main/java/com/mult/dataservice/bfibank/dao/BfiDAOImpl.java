package com.mult.dataservice.bfibank.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mult.dataservice.bfibank.model.Bfi;
import com.mult.dataservice.common.AbstractDAO;

@Repository
public class BfiDAOImpl extends AbstractDAO implements IBfiDAO {

	@Override
	public Bfi findById(Long id) {

		return getSession().find(Bfi.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Bfi> findAll() {
		List<Bfi> bfiList = getSession().createQuery("SELECT r FROM Bfi r ORDER BY r.id ASC").getResultList();
		return bfiList;
	}

	@Override
	public void saveOrUpdate(Bfi bfi) {
		if (bfi.getId() == null) {
			getSession().persist(bfi);
		} else {
			getSession().saveOrUpdate(bfi);
		}

	}

}
