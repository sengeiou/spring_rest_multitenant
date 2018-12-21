package com.mult.dataservice.screeninglegal.service;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mult.dataservice.screeninglegal.dao.IScreeningLDAO;
import com.mult.dataservice.screeninglegal.model.ScreeningLRequest;
import com.mult.dataservice.screeninglegal.model.ScreeningLRequestData;
import com.mult.dataservice.screeningnatural.model.ScreeningAction;

@Service("screeningLegalService")
@Transactional
public class ScreeningLegalServiceImpl implements IScreeningLegalService {

	@Autowired
	private IScreeningLDAO dao;

	@Override
	public Long save(ScreeningLRequest screening) throws Exception {

		try {
			screening.getListOfRelated().stream().filter(Objects::nonNull).forEach(related -> {

				related.getScreeningNRequestData().setScreeningRelatedRequest(related);
				try {
					related.getAttachment().stream().filter(Objects::nonNull)
							.forEach(r -> r.setScreeningNRelated(related));
					related.getScreeningNMatchInfo().stream().filter(Objects::nonNull)
							.forEach(r -> r.setScreeningNRelated(related));
				} catch (NullPointerException ex) {
					ex.getMessage();
				}

			});
		} catch (NullPointerException ex) {
			ex.getMessage();
		}
		try {
			screening.getRelatedEntityRequestData().stream().filter(Objects::nonNull).forEach(entity -> {

				entity.setScreeningLRequest(screening);
				entity.getScreeningRelatedEntityRequestData().setScreeningRelatedEntityRequest(entity);
				try {
					entity.getMatchInfo().stream().filter(Objects::nonNull)
							.forEach(r -> r.setRequestRelatedEntityRequestData(entity));
				} catch (NullPointerException ex) {
					ex.getMessage();
				}
			});
		} catch (NullPointerException ex) {
			ex.getMessage();
		}
		try {
			screening.getScreeningLRequestData().setScreeningLRequest(screening);
		} catch (NullPointerException ex) {
			ex.getMessage();
		}
		try {
			screening.getAttachment().stream().filter(Objects::nonNull).forEach(r -> r.setScreeningLRequest(screening));
		} catch (NullPointerException ex) {
			ex.getMessage();
		}
		try {
			screening.getScreeningLMatchInfo().stream().filter(Objects::nonNull)
					.forEach(r -> r.setScreeningLRequest(screening));
		} catch (NullPointerException ex) {
			ex.getMessage();
		}
		try {
			screening.getScreeningLAction().stream().filter(Objects::nonNull)
					.forEach(r -> r.setScreeningLRequest(screening));
		} catch (NullPointerException ex) {
			ex.getMessage();
		}

		return dao.saveOrUpdate(screening);

	}

	@Override
	public ScreeningLRequest findById(Long id) throws Exception {
		return dao.findById(id);
	}

	@Override
	public List<ScreeningLRequest> findAll() throws Exception {
		return dao.findAll();
	}

	@Override
	public void screeningActionUpdate(ScreeningAction action, Long screeningId) throws Exception {
		ScreeningLRequest screeningL = findById(screeningId);
		Set<ScreeningAction> actionList = new HashSet<>();
		action.setReplied(true);
		actionList.add(action);
		screeningL.setScreeningLAction(actionList);
		if (action.getAction() != "reject") {
			screeningL.setApproved(true);
		} else {
			screeningL.setApproved(false);
		}
		screeningL.setAction(true);
		save(screeningL);

	}

	@Override
	public List<ScreeningLRequest> findByAction(boolean action) throws Exception {

		return dao.findByAction(action);
	}

	@Override
	public List<ScreeningLRequest> findByReply(boolean replied, boolean action) throws Exception {
		return dao.findByRepliedAndAction(replied, action);
	}

	@Override
	public void screeningReplyUpdate(ScreeningLRequestData requestData, Long screeningId) throws Exception {
		ScreeningLRequest screeningL = findById(screeningId);
		ScreeningLRequestData data = screeningL.getScreeningLRequestData();
		if (data != null) {
			data.setCustId(requestData.getCustId());
			data.setCbsName(requestData.getCbsName());
			data.setAccountId(requestData.getAccountId());
		}
		screeningL.setReplied(true);
		save(screeningL);

	}

}
