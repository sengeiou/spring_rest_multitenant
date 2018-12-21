package com.mult.dataservice.bfibank.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mult.dataservice.bfibank.model.Bfi;
import com.mult.dataservice.bfibank.service.IBfiService;
import com.mult.dataservice.common.TrustAmlApiResponse;
import com.mult.dataservice.util.TenantContextHolder;

@RestController
@RequestMapping("api/bfi")
public class BfiController {

	@Autowired
	IBfiService bfisService;
	


	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = "application/json")
	private ResponseEntity<TrustAmlApiResponse> createBfi(HttpServletRequest request,@RequestBody Bfi bfi) throws Exception {
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		if (bfi == null) {
			return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.BAD_REQUEST, "Invalid input"),HttpStatus.BAD_REQUEST);
		}
		bfisService.saveOrUpdate(bfi);
		return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.CREATED), HttpStatus.OK);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT, consumes = "application/json")
	private ResponseEntity<TrustAmlApiResponse> updateBfi(HttpServletRequest request,@RequestBody Bfi bfi) throws Exception {
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		if (bfi == null) {
			return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.BAD_REQUEST,"Error while updating"),HttpStatus.BAD_REQUEST);
		}
		bfisService.saveOrUpdate(bfi);
		return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.OK),HttpStatus.OK);
	}

	@RequestMapping(value = "/retrive/", method = RequestMethod.GET, produces = "application/json")
	private ResponseEntity<TrustAmlApiResponse> findById(HttpServletRequest request,@RequestParam("id") Long id) throws Exception {
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		Bfi bfi = bfisService.findById(id);
		if (bfi == null) {
			return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.NO_CONTENT,"Empty"), HttpStatus.NO_CONTENT);
		}
		TrustAmlApiResponse response = new TrustAmlApiResponse(HttpStatus.FOUND);
		response.setBfi(bfi);
		return new ResponseEntity<TrustAmlApiResponse>(response, HttpStatus.OK);

	}
	
	@RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json")
	private ResponseEntity<TrustAmlApiResponse> findAll(HttpServletRequest request) throws Exception {
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		List<Bfi> bfi = bfisService.findAll();
		if (bfi.isEmpty()) {
			return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.NO_CONTENT, "Empty"), HttpStatus.NO_CONTENT);
		}
		TrustAmlApiResponse response = new TrustAmlApiResponse(HttpStatus.FOUND);
		response.setBfiList(bfi);
		return new ResponseEntity<TrustAmlApiResponse>(response, HttpStatus.OK);

	}

	
	
}