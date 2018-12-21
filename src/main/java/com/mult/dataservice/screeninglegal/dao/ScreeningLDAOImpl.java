package com.mult.dataservice.screeninglegal.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.mult.dataservice.common.AbstractDAO;
import com.mult.dataservice.screeninglegal.model.ScreeningLRequest;

@Repository
public class ScreeningLDAOImpl extends AbstractDAO implements IScreeningLDAO {

	@Override
	public Long saveOrUpdate(ScreeningLRequest screening) {

		if (screening.getId() == null) {
			getSession().persist(screening);
			getSession().flush();
			return screening.getId();
		} else {
			getSession().saveOrUpdate(screening);
			return screening.getId();

		}

	}

	@Override
	public void deleteScreeningL(ScreeningLRequest screening) {
		getSession().delete(screening);
	}

	@Override
	public ScreeningLRequest findById(Long id) {
		return getSession().find(ScreeningLRequest.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ScreeningLRequest> findAll() {
		List<ScreeningLRequest> screeningList = getSession()
				.createQuery("SELECT sr FROM ScreeningLRequest sr ORDER BY sr.id ASC").getResultList();
		return screeningList;
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<ScreeningLRequest> findByApproved(boolean approved) {
		Criteria criteria = getSession().createCriteria(ScreeningLRequest.class);
		criteria.add(Restrictions.eq("approved", approved));
		return (List<ScreeningLRequest>) criteria.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ScreeningLRequest> findByAction(boolean action) {
		@SuppressWarnings("deprecation")
		Criteria criteria = getSession().createCriteria(ScreeningLRequest.class);
		criteria.add(Restrictions.eq("action", action));
		return (List<ScreeningLRequest>) criteria.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ScreeningLRequest> findByRepliedAndAction(boolean replied, boolean action) {
		List<ScreeningLRequest> requestList = getSession()
				.createQuery("SELECT r FROM ScreeningLRequest r WHERE r.replied=" + replied + " AND r.action=" + action)
				.getResultList();
		return requestList;
	}

}
