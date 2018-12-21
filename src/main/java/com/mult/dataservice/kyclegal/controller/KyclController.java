package com.mult.dataservice.kyclegal.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mult.dataservice.common.TrustAmlApiResponse;
import com.mult.dataservice.kyclegal.model.Kycl;
import com.mult.dataservice.kyclegal.service.IKyclService;
import com.mult.dataservice.util.TenantContextHolder;

@RestController
@RequestMapping("api/kycl")
public class KyclController {

	@Autowired 
	IKyclService kyclService;
	
	
	@RequestMapping(value="/create", method= RequestMethod.POST, consumes="application/json")
	public ResponseEntity<TrustAmlApiResponse> createKycl(HttpServletRequest request,@RequestBody Kycl kycl) throws Exception{
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		if(kycl == null){
			return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.NO_CONTENT, "Invalid input"), HttpStatus.NO_CONTENT);
		}
		Long id = kyclService.save(kycl);
		return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.CREATED,"Your kyc_id is: "+ id),HttpStatus.OK);
	}

	
	@RequestMapping(value="/update", method= RequestMethod.PUT, consumes="application/json")
	public ResponseEntity<TrustAmlApiResponse> updateKycl(HttpServletRequest request,@RequestBody Kycl kycl) throws Exception{
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		if(kycl == null){
			return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.NO_CONTENT, "Invalid input"), HttpStatus.NO_CONTENT);
		}
		kyclService.save(kycl);
		return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.OK),HttpStatus.OK);
	}
	
	@RequestMapping(value="/retrive/", method = RequestMethod.GET, produces ="application/json")
	public ResponseEntity<TrustAmlApiResponse> getById(HttpServletRequest request,@RequestParam("id") Long id) throws Exception{
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		if(kyclService.findById(id) == null){
			return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.NO_CONTENT,"Empty"), HttpStatus.NO_CONTENT);
		}
		TrustAmlApiResponse response = new TrustAmlApiResponse(HttpStatus.FOUND);
		response.setKycl(kyclService.findById(id));
		return new ResponseEntity<TrustAmlApiResponse>(response, HttpStatus.OK);
	}
	
	@RequestMapping(value="/all", method= RequestMethod.GET, produces="application/json")
	public ResponseEntity<TrustAmlApiResponse> findAll(HttpServletRequest request) throws Exception{
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		if(kyclService.findAllKycl().isEmpty()){
			return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.NO_CONTENT,"Empty"), HttpStatus.NO_CONTENT);
		}
		TrustAmlApiResponse response = new TrustAmlApiResponse(HttpStatus.FOUND);
		response.setKyclList(kyclService.findAllKycl());
		return new ResponseEntity<TrustAmlApiResponse>(response, HttpStatus.OK);
	}
	
	
}
