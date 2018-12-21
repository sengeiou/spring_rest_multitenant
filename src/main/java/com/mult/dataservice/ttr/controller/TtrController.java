package com.mult.dataservice.ttr.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mult.dataservice.common.TrustAmlApiResponse;
import com.mult.dataservice.ttr.model.TtrBase;
import com.mult.dataservice.ttr.service.ITtrService;
import com.mult.dataservice.util.TenantContextHolder;

@RestController
@RequestMapping("api/ttr")
public class TtrController {
	

	@Autowired
	ITtrService ttrService;
	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes="application/json")
	private ResponseEntity<TrustAmlApiResponse> createHotList(HttpServletRequest request,@RequestBody JSONObject jsonObject) throws Exception {
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		if (jsonObject == null) {
			return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.BAD_REQUEST, "Invalid Input"),HttpStatus.BAD_REQUEST);
		}
		ttrService.save(jsonObject);
		return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.CREATED),HttpStatus.OK);
	}
	
	@RequestMapping(value = "/retrive/", method = RequestMethod.GET)
	public ResponseEntity<TrustAmlApiResponse> findById(HttpServletRequest request,@RequestParam("id") Long id) throws Exception{
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		TtrBase ttr = ttrService.findById(id);
		if (ttr == null) {
			return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.NO_CONTENT,"Empty"),HttpStatus.NO_CONTENT);
		}
		TrustAmlApiResponse response = new TrustAmlApiResponse(HttpStatus.FOUND);
		response.setTtr(ttr);
		return new ResponseEntity<TrustAmlApiResponse>(response, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public ResponseEntity<TrustAmlApiResponse> findAll(HttpServletRequest request) throws Exception{
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		List<TtrBase> ttrList = ttrService.findAll();
		if (ttrList.isEmpty()) {
			return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.NO_CONTENT, "Empty"),HttpStatus.NO_CONTENT);
		}
		TrustAmlApiResponse response = new TrustAmlApiResponse(HttpStatus.FOUND);
		response.setTtrList(ttrList);
		return new ResponseEntity<TrustAmlApiResponse>(response, HttpStatus.OK);
	}

}
