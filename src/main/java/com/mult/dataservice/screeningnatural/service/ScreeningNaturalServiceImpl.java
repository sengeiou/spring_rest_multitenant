package com.mult.dataservice.screeningnatural.service;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mult.dataservice.screeningnatural.dao.IScreeningNRequestDAO;
import com.mult.dataservice.screeningnatural.model.ScreeningAction;
import com.mult.dataservice.screeningnatural.model.ScreeningNRequest;
import com.mult.dataservice.screeningnatural.model.ScreeningNRequestData;

@Service("screeningNaturalService")
@Transactional
public class ScreeningNaturalServiceImpl implements IScreeningNaturalService {

	@Autowired
	IScreeningNRequestDAO screeningDao;

	@Override
	public Long save(ScreeningNRequest screeningN) {

		try {
			screeningN.getListOfRelated().stream().filter(Objects::nonNull).forEach(related -> {
				related.getScreeningNRequestData().setScreeningRelatedRequest(related);
				try {
					related.getAttachment().stream().forEach(attachment -> attachment.setScreeningNRelated(related));
					related.getScreeningNMatchInfo().stream().forEach(match -> match.setScreeningNRelated(related));
				} catch (NullPointerException ex) {
					ex.getMessage();
				}

			}
			);
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}

		try {
			screeningN.getRelatedEntityRequest().stream().filter(Objects::nonNull).forEach(entity -> {
				entity.setScreeningNRequest(screeningN);
				entity.getScreeningRelatedEntityRequestData().setScreeningRelatedEntityRequest(entity);
				try {
					entity.getMatchInfo().stream().forEach(r -> r.setRequestRelatedEntityRequestData(entity));
				} catch (NullPointerException ex) {
					ex.getMessage();
				}
			});
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}

		try {
			screeningN.getAttachment().stream().filter(Objects::nonNull)
					.forEach(r -> r.setScreeningNRequest(screeningN));
		} catch (NullPointerException ex) {
			ex.getMessage();
		}

		try {
			screeningN.getScreeningNMatchInfo().stream().filter(Objects::nonNull)
					.forEach(r -> r.setScreeningNRequest(screeningN));
		} catch (NullPointerException ex) {
			ex.getMessage();
		}
		try {
			screeningN.getScreeningNAction().stream().filter(Objects::nonNull)
					.forEach(r -> r.setScreeningNRequest(screeningN));
		} catch (NullPointerException ex) {
			ex.getMessage();
		}

		try {
			screeningN.getScreeningNRequestData().setScreeningNRequest(screeningN);
		} catch (NullPointerException ex) {
			ex.getMessage();
		}
		return screeningDao.saveOrUpdate(screeningN);

	}

	@Override
	public ScreeningNRequest findById(Long id) {
		return screeningDao.findById(id);
	}

	@Override
	public List<ScreeningNRequest> findAll() {
		return screeningDao.findAll();
	}

	@Override
	public void screeningActionUpdate(ScreeningAction action, Long screeningId) {
		ScreeningNRequest screeningN = findById(screeningId);
		Set<ScreeningAction> actionList = new HashSet<>();
		action.setReplied(true);
		actionList.add(action);
		screeningN.setScreeningNAction(actionList);
		if (action.getAction() != "reject") {
			screeningN.setApproved(true);
		} else {
			screeningN.setApproved(false);
		}
		screeningN.setAction(true);
		save(screeningN);

	}

	@Override
	public List<ScreeningNRequest> findByAction(boolean status) throws Exception {
		
		return screeningDao.findByAction(status);
	}

	@Override
	public List<ScreeningNRequest> findByReply(boolean replied, boolean action) throws Exception {

		return screeningDao.findByRepliedAndAction(replied, action);
	}

	@Override
	public void screeningReplyUpdate(ScreeningNRequestData requestData, Long screeningId) throws Exception {
		ScreeningNRequest screeningN = findById(screeningId);
		ScreeningNRequestData  data = screeningN.getScreeningNRequestData();
		if(data!=null){
			data.setCustId(requestData.getCustId());
			data.setCbsName(requestData.getCbsName());
			data.setAccountId(requestData.getAccountId());
		}
		screeningN.setReplied(true);
		save(screeningN);
		
	}

	@Override
	public String findScreeningStored() throws Exception {
		
		return screeningDao.findScreeningDataProcedure();
	}

}
