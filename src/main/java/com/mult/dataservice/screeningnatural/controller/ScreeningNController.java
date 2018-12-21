package com.mult.dataservice.screeningnatural.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.mult.dataservice.common.TrustAmlApiResponse;
import com.mult.dataservice.screeningnatural.model.ScreeningAction;
import com.mult.dataservice.screeningnatural.model.ScreeningNRequest;
import com.mult.dataservice.screeningnatural.model.ScreeningNRequestData;
import com.mult.dataservice.screeningnatural.service.IScreeningNaturalService;
import com.mult.dataservice.util.TenantContextHolder;

@RestController
@RequestMapping("/api/screening_n")
public class ScreeningNController {

	@Autowired
	IScreeningNaturalService screeningService;

	@RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<TrustAmlApiResponse> listAllUsers(HttpServletRequest request) throws Exception {
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		System.out.println("here is: " + request.getHeader("X-TENANT-ID"));
		if (screeningService.findAll().isEmpty()) {
			return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.NO_CONTENT, "Empty"),HttpStatus.NO_CONTENT);
		}
		TrustAmlApiResponse response  = new TrustAmlApiResponse(HttpStatus.FOUND);
		response.setScreeningNRequestList(screeningService.findAll());
		
		return new ResponseEntity<TrustAmlApiResponse>(response, HttpStatus.OK);
	}
	

	@RequestMapping(value = "/fetch_by_action", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<TrustAmlApiResponse> listAllUsersByAction(HttpServletRequest request) throws Exception {
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		if (screeningService.findByAction(false).isEmpty()) {
			return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.NO_CONTENT, "Empty"),HttpStatus.NO_CONTENT);
		}
		TrustAmlApiResponse response  = new TrustAmlApiResponse(HttpStatus.FOUND);
		response.setScreeningNRequestList(screeningService.findByAction(false));
		
		return new ResponseEntity<TrustAmlApiResponse>(response, HttpStatus.OK);
	}
	@RequestMapping(value = "/replies", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<TrustAmlApiResponse> listAllScreeningReplies(HttpServletRequest request) throws Exception {
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		if (screeningService.findByReply(false, true).isEmpty()) {
			return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.NO_CONTENT, "Empty"),HttpStatus.NO_CONTENT);
		}
		TrustAmlApiResponse response  = new TrustAmlApiResponse(HttpStatus.FOUND);
		response.setScreeningNRequestList(screeningService.findByReply(false,true));
		
		return new ResponseEntity<TrustAmlApiResponse>(response, HttpStatus.OK);
	}


    @CrossOrigin
	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<TrustAmlApiResponse> createNatural(@RequestBody ScreeningNRequest screening, HttpServletRequest request)
			throws JsonMappingException, JsonParseException, JsonProcessingException {
    	System.out.println(request.getHeader("X-TENANT-ID"));
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		if(screening == null)
			return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.BAD_REQUEST, "Invalid Input"), HttpStatus.BAD_REQUEST);
		
		Long id = screeningService.save(screening);
		return new ResponseEntity<TrustAmlApiResponse>(
				new TrustAmlApiResponse(HttpStatus.CREATED, "Your screening_id is: " + id + " with tenant: " + request.getHeader("X-TENANT-ID")), HttpStatus.OK);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TrustAmlApiResponse> updateNatural(@RequestBody ScreeningNRequest screening, HttpServletRequest request) throws Exception {
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		if(screening == null)
			return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.BAD_REQUEST, "Invalid Input"), HttpStatus.BAD_REQUEST);
		System.out.println("jackpot");
		screeningService.save(screening);
		return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.OK),HttpStatus.OK);
	}

	@RequestMapping(value = "/retrive/", method = RequestMethod.GET)
	public ResponseEntity<TrustAmlApiResponse> findById(@RequestParam("id") Long id,  HttpServletRequest request) throws Exception {
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		ScreeningNRequest screen = screeningService.findById(id);
		if (screen == null) {
			return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.NO_CONTENT,"Empty"),HttpStatus.NO_CONTENT);
		}

		TrustAmlApiResponse response = new TrustAmlApiResponse(HttpStatus.FOUND);
		response.setScreeningNRequest(screen);
		return new ResponseEntity<TrustAmlApiResponse>(response, HttpStatus.OK);
	}



	@RequestMapping(value = "/action/", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TrustAmlApiResponse> updateNaturalAction(@RequestBody ScreeningAction action,
			@RequestParam("id") String screeningId, HttpServletRequest request ) throws Exception {
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		screeningService.screeningActionUpdate(action, Long.parseLong(screeningId));
		return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.OK),HttpStatus.OK);
	}
	
	@RequestMapping(value = "/reply/", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TrustAmlApiResponse> updateNaturalReply(@RequestBody ScreeningNRequestData requestData,
			@RequestParam("id") String screeningId, HttpServletRequest request ) throws Exception {
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		screeningService.screeningReplyUpdate(requestData, Long.parseLong(screeningId));
		return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.OK),HttpStatus.OK);
	}
	
	@RequestMapping(value = "/fetch_stored", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<TrustAmlApiResponse> fetchStoredScreening(HttpServletRequest request) throws Exception {
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		if (screeningService.findScreeningStored().isEmpty()) {
			return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.NO_CONTENT, "Empty"),HttpStatus.NO_CONTENT);
		}
		TrustAmlApiResponse response  = new TrustAmlApiResponse(HttpStatus.FOUND);
		response.setPayload(screeningService.findScreeningStored());
		
		return new ResponseEntity<TrustAmlApiResponse>(response, HttpStatus.OK);
	}
}
