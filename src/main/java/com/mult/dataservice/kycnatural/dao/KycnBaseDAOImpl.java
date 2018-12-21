package com.mult.dataservice.kycnatural.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mult.dataservice.common.AbstractDAO;
import com.mult.dataservice.kycnatural.model.KycnBase;


@Repository
public class KycnBaseDAOImpl extends AbstractDAO implements IKycnBaseDAO {
	

	@Override
	@Transactional(readOnly = true)
	public KycnBase findById(Long id) {
		return getSession().find(KycnBase.class, id);
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<KycnBase> findAllKycn() {
		List<KycnBase> baseList = getSession().createQuery("SELECT r FROM KycnBase r ORDER BY r.id ASC")
				.getResultList();
		return baseList;
	}

	@Override
	public Long saveOrUpdate(KycnBase kycnBase) {			
		if (kycnBase.getId() == null) {
			getSession().persist(kycnBase);
			getSession().flush();
			return kycnBase.getId();
		} else {
			getSession().saveOrUpdate(kycnBase);
			return kycnBase.getId();
		}

	}

}
