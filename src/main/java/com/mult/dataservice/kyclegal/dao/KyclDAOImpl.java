package com.mult.dataservice.kyclegal.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mult.dataservice.common.AbstractDAO;
import com.mult.dataservice.kyclegal.model.Kycl;


@Repository
public class KyclDAOImpl extends AbstractDAO implements IKyclDAO {


	@Override
	@Transactional(readOnly = true)
	public Kycl findById(Long id) {

		return getSession().find(Kycl.class, id);
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<Kycl> findAllKycl() {
		
		List<Kycl> kycl = getSession().createQuery("SELECT r FROM Kycl r ORDER BY r.id ASC").getResultList();
		return kycl;
	}

	@Override
	public Long saveOrUpdate(Kycl kycl) {
		if (kycl.getId() == null) {
			getSession().persist(kycl);
			getSession().flush();
			return kycl.getId();
		} else {
			getSession().saveOrUpdate(kycl);
			return null;
		}

	}

}
