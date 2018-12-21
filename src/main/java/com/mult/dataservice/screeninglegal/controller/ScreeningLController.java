package com.mult.dataservice.screeninglegal.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mult.dataservice.common.TrustAmlApiResponse;
import com.mult.dataservice.screeninglegal.model.ScreeningLRequest;
import com.mult.dataservice.screeninglegal.model.ScreeningLRequestData;
import com.mult.dataservice.screeninglegal.service.IScreeningLegalService;
import com.mult.dataservice.screeningnatural.model.ScreeningAction;
import com.mult.dataservice.util.TenantContextHolder;

@RestController
@RequestMapping("/api/screening_l")
public class ScreeningLController {

	@Autowired
	IScreeningLegalService screeningService;



	@RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<TrustAmlApiResponse> listAllUsers(HttpServletRequest request) throws Exception{
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		if (screeningService.findAll().isEmpty()) {
			return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.NO_CONTENT, "Empty"),HttpStatus.NO_CONTENT);
		}
		TrustAmlApiResponse response = new TrustAmlApiResponse(HttpStatus.FOUND);
		response.setScreeningLRequestList(screeningService.findAll());
		return new ResponseEntity<TrustAmlApiResponse>(response, HttpStatus.OK);
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<TrustAmlApiResponse> createLegal(HttpServletRequest request,@RequestBody ScreeningLRequest screening) throws Exception{
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		if(screening == null)
			return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.BAD_REQUEST, "Invalid input"), HttpStatus.BAD_REQUEST);
		Long screeningId = screeningService.save(screening);
		return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.CREATED,"Your screening_id is: "+ screeningId),HttpStatus.OK);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT, consumes = "application/json")
	public ResponseEntity<TrustAmlApiResponse> updateLegal(HttpServletRequest request,@RequestBody ScreeningLRequest screening) throws Exception{
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		if(screening == null)
			return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.BAD_REQUEST, "Invalid input"), HttpStatus.BAD_REQUEST);
		screeningService.save(screening);
		return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.OK),HttpStatus.OK);
	}

	@RequestMapping(value = "/retrive/", method = RequestMethod.GET)
	public ResponseEntity<TrustAmlApiResponse> findById(HttpServletRequest request,@RequestParam("id") Long id) throws Exception{
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		ScreeningLRequest screen = screeningService.findById(id);
		if (screen == null) {
			return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.NO_CONTENT, "Empty"),HttpStatus.NO_CONTENT);
		}
		TrustAmlApiResponse response = new TrustAmlApiResponse(HttpStatus.FOUND);
		response.setScreeningLRequest(screen);
		return new ResponseEntity<TrustAmlApiResponse>(response, HttpStatus.OK);
	}
	@RequestMapping(value = "/fetch_by_action", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<TrustAmlApiResponse> listAllUsersByAction(HttpServletRequest request) throws Exception {
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		if (screeningService.findByAction(false).isEmpty()) {
			return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.NO_CONTENT, "Empty"),HttpStatus.NO_CONTENT);
		}
		TrustAmlApiResponse response  = new TrustAmlApiResponse(HttpStatus.FOUND);
		response.setScreeningLRequestList(screeningService.findByAction(false));
		
		return new ResponseEntity<TrustAmlApiResponse>(response, HttpStatus.OK);
	}		
	@RequestMapping(value = "/replies", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<TrustAmlApiResponse> listAllScreeningReplies(HttpServletRequest request) throws Exception {
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		if (screeningService.findByReply(false, true).isEmpty()) {
			return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.NO_CONTENT, "Empty"),HttpStatus.NO_CONTENT);
		}
		TrustAmlApiResponse response  = new TrustAmlApiResponse(HttpStatus.FOUND);
		response.setScreeningLRequestList(screeningService.findByReply(false,true));
		
		return new ResponseEntity<TrustAmlApiResponse>(response, HttpStatus.OK);
	}


	
	@RequestMapping(value = "/action/", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TrustAmlApiResponse> updateNaturalAction(HttpServletRequest request,@RequestBody ScreeningAction action,
			@RequestParam("id") Long screeningId) throws Exception {
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		screeningService.screeningActionUpdate(action, screeningId);
		return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.OK),HttpStatus.OK);
	}
	
	@RequestMapping(value = "/reply/", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TrustAmlApiResponse> updateNaturalReply(@RequestBody ScreeningLRequestData requestData,
			@RequestParam("id") String screeningId, HttpServletRequest request ) throws Exception {
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		screeningService.screeningReplyUpdate(requestData, Long.parseLong(screeningId));
		return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.OK),HttpStatus.OK);
	}
}
