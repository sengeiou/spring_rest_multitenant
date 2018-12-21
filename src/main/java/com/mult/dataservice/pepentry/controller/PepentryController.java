package com.mult.dataservice.pepentry.controller;

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

import com.mult.dataservice.common.TrustAmlApiResponse;
import com.mult.dataservice.pepentry.model.Pepentry;
import com.mult.dataservice.pepentry.service.IPepentryService;
import com.mult.dataservice.util.TenantContextHolder;

@RestController
@RequestMapping("api/pepentry")
public class PepentryController {
	@Autowired
	IPepentryService pepentryService;
	
	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = "application/json")
	private ResponseEntity<TrustAmlApiResponse> createPepentry(HttpServletRequest request,@RequestBody Pepentry pepentry) throws Exception {
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		if (pepentry == null) {
			return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.BAD_REQUEST,"Invalid Input"),HttpStatus.BAD_REQUEST);
		}
		pepentryService.save(pepentry);
		return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.CREATED),HttpStatus.OK);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT, consumes = "application/json")
	private ResponseEntity<TrustAmlApiResponse> updatePepentry(HttpServletRequest request,@RequestBody Pepentry pepentry) throws Exception {
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		if (pepentry == null) {
			return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.BAD_REQUEST,"Invalid Input"),HttpStatus.BAD_REQUEST);
		}
		pepentryService.save(pepentry);
		return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.OK),HttpStatus.OK);
	}

	@RequestMapping(value = "/retrive/", method = RequestMethod.GET, produces = "application/json")
	private ResponseEntity<TrustAmlApiResponse> findById(HttpServletRequest request,@RequestParam("id") Long id) throws Exception {
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		Pepentry pepentry = pepentryService.findById(id);
		if (pepentry == null) {
			return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.NO_CONTENT, "Empty"), HttpStatus.NO_CONTENT);
		}
		TrustAmlApiResponse response = new TrustAmlApiResponse(HttpStatus.FOUND);
		response.setPepentry(pepentry);
		return new ResponseEntity<TrustAmlApiResponse>(response, HttpStatus.OK);

	}
	
	@RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json")
	private ResponseEntity<TrustAmlApiResponse> findAll(HttpServletRequest request) throws Exception {
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		List<Pepentry> pepentry = pepentryService.findAll();
		if (pepentry.isEmpty()) {
			return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.NO_CONTENT, "Empty"), HttpStatus.NO_CONTENT);
		}
		TrustAmlApiResponse response = new TrustAmlApiResponse(HttpStatus.FOUND);
		response.setPepentryList(pepentry);
		return new ResponseEntity<TrustAmlApiResponse>(response, HttpStatus.OK);

	}

}
