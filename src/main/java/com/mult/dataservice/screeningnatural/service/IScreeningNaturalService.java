package com.mult.dataservice.screeningnatural.service;

import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.mult.dataservice.screeningnatural.model.ScreeningAction;
import com.mult.dataservice.screeningnatural.model.ScreeningNRequest;
import com.mult.dataservice.screeningnatural.model.ScreeningNRequestData;

public interface IScreeningNaturalService {
	public Long save(ScreeningNRequest screeningN) throws JsonMappingException, JsonParseException,JsonProcessingException;
	public ScreeningNRequest findById(Long id) throws Exception;
	public List<ScreeningNRequest> findAll() throws Exception;	
	public List<ScreeningNRequest> findByAction(boolean status) throws Exception;	
	public List<ScreeningNRequest> findByReply(boolean replied, boolean action) throws Exception;	
	public void screeningActionUpdate(ScreeningAction action, Long screeningId) throws Exception;
	public void screeningReplyUpdate(ScreeningNRequestData requestData, Long screeningId) throws Exception;
	public String findScreeningStored() throws Exception;
}
