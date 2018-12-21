package com.mult.dataservice.hotlist.controller;

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
import com.mult.dataservice.hotlist.model.HotList;
import com.mult.dataservice.hotlist.service.IHotListService;
import com.mult.dataservice.util.TenantContextHolder;

@RestController
@RequestMapping("api/hotlist")
public class HotListController {
	@Autowired
	IHotListService hotService;
	

	
	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = "application/json")
	private ResponseEntity<TrustAmlApiResponse> createHotList(HttpServletRequest request,@RequestBody HotList hotList) throws Exception {
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		if (hotList == null) {
			return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.BAD_REQUEST,"Invalid input"),HttpStatus.BAD_REQUEST);
		}
		Long hotId = hotService.save(hotList);
		return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.CREATED,"Your hotListId is " + hotId),HttpStatus.OK);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT, consumes = "application/json")
	private ResponseEntity<TrustAmlApiResponse> updateHotList(HttpServletRequest request,@RequestBody HotList hotList) throws Exception {
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		if (hotList == null) {
			return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.BAD_REQUEST, "Invalid input"),HttpStatus.BAD_REQUEST);
		}
		hotService.save(hotList);
		return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.OK),HttpStatus.OK);
	}

	@RequestMapping(value = "/retrive/", method = RequestMethod.GET, produces = "application/json")
	private ResponseEntity<TrustAmlApiResponse> findById(HttpServletRequest request,@RequestParam("id") Long id) throws Exception {
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		HotList hotList = hotService.findById(id);
		if (hotList == null) {
			return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.NO_CONTENT, "Empty"), HttpStatus.NO_CONTENT);
		}
		TrustAmlApiResponse response = new TrustAmlApiResponse(HttpStatus.FOUND);
		response.setHotList(hotList);
		return new ResponseEntity<TrustAmlApiResponse>(response, HttpStatus.OK);

	}
	
	@RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json")
	private ResponseEntity<TrustAmlApiResponse> findAll(HttpServletRequest request) throws Exception {
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		List<HotList> hotList = hotService.findAll();
		if (hotList.isEmpty()) {
			return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.NO_CONTENT,"Empty"), HttpStatus.NO_CONTENT);
		}
		TrustAmlApiResponse response = new TrustAmlApiResponse(HttpStatus.FOUND);
		response.setHotListList(hotList);
		return new ResponseEntity<TrustAmlApiResponse>(response, HttpStatus.OK);

	}

	

}
