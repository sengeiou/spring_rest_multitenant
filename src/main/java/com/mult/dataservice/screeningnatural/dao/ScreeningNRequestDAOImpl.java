package com.mult.dataservice.screeningnatural.dao;

import java.util.List;

import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.mult.dataservice.common.AbstractDAO;
import com.mult.dataservice.screeningnatural.model.ScreeningAction;
import com.mult.dataservice.screeningnatural.model.ScreeningNRequest;

@Repository
public class ScreeningNRequestDAOImpl extends AbstractDAO implements IScreeningNRequestDAO {

	@Override
	public ScreeningNRequest findByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long saveOrUpdate(ScreeningNRequest screeningN) {
		if (screeningN.getId() == null) {
			getSession().persist(screeningN);
			getSession().flush();
			return screeningN.getId();
		} else {
			getSession().saveOrUpdate(screeningN);
			return screeningN.getId();
		}

	}

	@Override
	public void deleteScreeningN(ScreeningNRequest screeningN) {
		getSession().delete(screeningN);

	}

	@Override
	public ScreeningNRequest findById(Long id) {
		ScreeningNRequest request = getSession().find(ScreeningNRequest.class, id);
		return request;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ScreeningNRequest> findAll() {
		List<ScreeningNRequest> requestList = getSession().createQuery("SELECT sr FROM ScreeningNRequest sr ORDER  BY sr.id ASC").getResultList();
		return requestList;
	}

	@Override
	public void screeningActionUpdate(ScreeningAction action, Long screeningId) {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<ScreeningNRequest> findByApproved(boolean approved) {
		Criteria criteria = getSession().createCriteria(ScreeningNRequest.class);
		criteria.add(Restrictions.eq("approved",approved));
		return (List<ScreeningNRequest>) criteria.list();
	
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<ScreeningNRequest> findByAction(boolean action) {
		Criteria criteria = getSession().createCriteria(ScreeningNRequest.class);
		criteria.add(Restrictions.eq("action",action));
		return (List<ScreeningNRequest>) criteria.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ScreeningNRequest> findByRepliedAndAction(boolean replied, boolean action) {
		List<ScreeningNRequest> requestList = getSession().
				createQuery("SELECT r FROM ScreeningNRequest r WHERE r.replied="+replied+" AND r.action="+action).getResultList();
		return requestList;
	}

	                                                             

	@SuppressWarnings("unchecked")
	@Override
	public String findScreeningDataProcedure() {
		StoredProcedureQuery procedureQuery = getSession().createStoredProcedureQuery("fetch_n_screening");
        procedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.OUT);
        procedureQuery.execute();
		return procedureQuery.getOutputParameterValue(1).toString();
	}

}
