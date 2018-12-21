package com.mult.dataservice.kycnatural.controller;

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
import com.mult.dataservice.kycnatural.model.KycnBase;
import com.mult.dataservice.kycnatural.service.IKycnService;
import com.mult.dataservice.util.TenantContextHolder;

@RestController
@RequestMapping("/api/kycn")
public class KycnBaseController {

	@Autowired
	IKycnService kycnService;

	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<TrustAmlApiResponse> createKycn(HttpServletRequest request, @RequestBody KycnBase kycnBase)
			throws Exception {
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		if (kycnBase == null)
			return new ResponseEntity<TrustAmlApiResponse>(
					new TrustAmlApiResponse(HttpStatus.BAD_REQUEST, "Invalid Input"), HttpStatus.BAD_REQUEST);

		Long kycnId = kycnService.save(kycnBase);
		return new ResponseEntity<TrustAmlApiResponse>(
				new TrustAmlApiResponse(HttpStatus.CREATED, "Your kyc_id is: " + kycnId), HttpStatus.OK);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT, consumes = "application/json")
	public ResponseEntity<TrustAmlApiResponse> updateKycn(HttpServletRequest request, @RequestBody KycnBase kycnBase)
			throws Exception {
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		if (kycnBase == null)
			return new ResponseEntity<TrustAmlApiResponse>(
					new TrustAmlApiResponse(HttpStatus.BAD_REQUEST, "Invalid Input"), HttpStatus.BAD_REQUEST);

		kycnService.save(kycnBase);
		return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.OK), HttpStatus.OK);
	}

	@RequestMapping(value = "/retrive/", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<TrustAmlApiResponse> getById(HttpServletRequest request, @RequestParam("id") Long id)
			throws Exception {
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		if (kycnService.findById(id) == null) {
			return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.NO_CONTENT, "Empty"),
					HttpStatus.NO_CONTENT);
		}
		TrustAmlApiResponse response = new TrustAmlApiResponse(HttpStatus.FOUND);
		response.setKycn(kycnService.findById(id));
		return new ResponseEntity<TrustAmlApiResponse>(response, HttpStatus.OK);
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<TrustAmlApiResponse> findAll(HttpServletRequest request) throws Exception {
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		if (kycnService.findAllKycn().isEmpty()) {
			return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.NO_CONTENT, "Empty"),
					HttpStatus.NO_CONTENT);
		}
		TrustAmlApiResponse response = new TrustAmlApiResponse(HttpStatus.FOUND);
		response.setKycnList(kycnService.findAllKycn());
		return new ResponseEntity<TrustAmlApiResponse>(response, HttpStatus.OK);
	}

}
