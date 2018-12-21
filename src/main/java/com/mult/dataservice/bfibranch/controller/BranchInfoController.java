package com.mult.dataservice.bfibranch.controller;

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

import com.mult.dataservice.bfibranch.model.DetailBranchInfo;
import com.mult.dataservice.bfibranch.service.IBranchInfoService;
import com.mult.dataservice.common.TrustAmlApiResponse;
import com.mult.dataservice.util.TenantContextHolder;

@RestController
@RequestMapping("api/branch_info")
public class BranchInfoController {
	
	@Autowired
	IBranchInfoService branchInfoService;
	
	
	@RequestMapping(value="/create", method= RequestMethod.POST, consumes="application/json")
	public ResponseEntity<TrustAmlApiResponse> createBranchInfo(HttpServletRequest request,@RequestBody DetailBranchInfo info) throws Exception{
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		if(info == null)
			return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.BAD_REQUEST, "Invalid Input"), HttpStatus.BAD_REQUEST);
		branchInfoService.save(info);
		return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.CREATED),HttpStatus.OK);
	}

	
	@RequestMapping(value="/update", method= RequestMethod.PUT, consumes="application/json")
	public ResponseEntity<TrustAmlApiResponse> updateBranchInfo(HttpServletRequest request,@RequestBody DetailBranchInfo info) throws Exception{
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		if(info == null)
			return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.BAD_REQUEST, "Invalid Input"), HttpStatus.BAD_REQUEST);
		branchInfoService.save(info);
		return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.OK),HttpStatus.OK);
	}
	
	@RequestMapping(value="/retrive/", method = RequestMethod.GET, produces ="application/json")
	public ResponseEntity<TrustAmlApiResponse> getById(HttpServletRequest request,@RequestParam("id") Long id) throws Exception{
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		DetailBranchInfo branchInfo = branchInfoService.findById(id);
		if(branchInfo == null){
			return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.NO_CONTENT,"Empty"), HttpStatus.NO_CONTENT);
		}
		TrustAmlApiResponse response = new TrustAmlApiResponse(HttpStatus.FOUND);
		response.setDetailBranchInfo(branchInfo);
		return new ResponseEntity<TrustAmlApiResponse>(response, HttpStatus.OK);
	}
	
	@RequestMapping(value="/all", method= RequestMethod.GET, produces="application/json")
	public ResponseEntity<TrustAmlApiResponse> findAll(HttpServletRequest request) throws Exception{
		TenantContextHolder.setTenantId(request.getHeader("X-TENANT-ID"));
		List<DetailBranchInfo> branchList = branchInfoService.findAllBranchInfo();
		if(branchList.isEmpty()){
			return new ResponseEntity<TrustAmlApiResponse>(new TrustAmlApiResponse(HttpStatus.NO_CONTENT, "Empty"), HttpStatus.NO_CONTENT);
		}
		TrustAmlApiResponse response = new TrustAmlApiResponse(HttpStatus.FOUND);
		response.setDetailBranchInfoList(branchList);
		return new ResponseEntity<TrustAmlApiResponse>(response, HttpStatus.OK);
	}
	

}
