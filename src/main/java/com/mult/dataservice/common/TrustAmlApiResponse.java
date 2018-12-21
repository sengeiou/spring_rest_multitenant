package com.mult.dataservice.common;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.mult.dataservice.adversemedia.model.AdverseMedia;
import com.mult.dataservice.bfibank.model.Bfi;
import com.mult.dataservice.bfibranch.model.DetailBranchInfo;
import com.mult.dataservice.hotlist.model.HotList;
import com.mult.dataservice.investigation.model.Investigation;
import com.mult.dataservice.kyclegal.model.Kycl;
import com.mult.dataservice.kycnatural.model.KycnBase;
import com.mult.dataservice.pepentry.model.Pepentry;
import com.mult.dataservice.screeninglegal.model.ScreeningLRequest;
import com.mult.dataservice.screeningnatural.model.ScreeningNRequest;
import com.mult.dataservice.str.model.StrBase;
import com.mult.dataservice.ttr.model.TtrBase;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrustAmlApiResponse {

	private HttpStatus status;
	private String message;
	private List<String> errors;
	private ScreeningNRequest screeningNRequest;
	private List<ScreeningNRequest> screeningNRequestList;
	private ScreeningLRequest screeningLRequest;
	private List<ScreeningLRequest> screeningLRequestList;
	private KycnBase kycn;
	private List<KycnBase> kycnList;
	private Kycl kycl;
	private List<Kycl> kyclList;
	private AdverseMedia adverseMedia;
	private List<AdverseMedia> adverseMediaList;
	private HotList hotList;
	private List<HotList> hotListList;
	private Investigation investigation;
	private List<Investigation> investigationList;
	private Pepentry pepentry;
	private List<Pepentry> pepentryList;
	private TtrBase ttr;
	private List<TtrBase> ttrList;
	private StrBase str;
	private List<StrBase> strList;
	private DetailBranchInfo detailBranchInfo;
	private List<DetailBranchInfo> detailBranchInfoList;
	private Bfi bfi;
	private List<Bfi> bfiList;
	private String payload;

	public TrustAmlApiResponse() {
		super();
	}

	public TrustAmlApiResponse(final HttpStatus status) {
		super();
		this.status = status;
		this.message = "success";
	}

	public TrustAmlApiResponse(final String message) {
		super();
		this.message = message;

	}

	public TrustAmlApiResponse(final HttpStatus status, final String message) {
		super();
		this.status = status;
		this.message = message;

	}

	public TrustAmlApiResponse(final HttpStatus status, final String message, final List<String> errors) {
		super();
		this.status = status;
		this.message = message;
		this.errors = errors;
	}

	public TrustAmlApiResponse(final HttpStatus status, final String message, final String error) {
		super();
		this.status = status;
		this.message = message;
		errors = Arrays.asList(error);
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getErrors() {
		return errors;
	}

	public void setErrors(List<String> errors) {
		this.errors = errors;
	}

	public ScreeningNRequest getScreeningNRequest() {
		return screeningNRequest;
	}

	public List<ScreeningNRequest> getScreeningNRequestList() {
		return screeningNRequestList;
	}

	public void setScreeningNRequest(ScreeningNRequest screeningNRequest) {
		this.screeningNRequest = screeningNRequest;
	}

	public void setScreeningNRequestList(List<ScreeningNRequest> screeningNRequestList) {
		this.screeningNRequestList = screeningNRequestList;
	}

	public ScreeningLRequest getScreeningLRequest() {
		return screeningLRequest;
	}

	public List<ScreeningLRequest> getScreeningLRequestList() {
		return screeningLRequestList;
	}

	public void setScreeningLRequest(ScreeningLRequest screeningLRequest) {
		this.screeningLRequest = screeningLRequest;
	}

	public void setScreeningLRequestList(List<ScreeningLRequest> screeningLRequestList) {
		this.screeningLRequestList = screeningLRequestList;
	}

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}

	public KycnBase getKycn() {
		return kycn;
	}

	public List<KycnBase> getKycnList() {
		return kycnList;
	}

	public void setKycn(KycnBase kycn) {
		this.kycn = kycn;
	}

	public void setKycnList(List<KycnBase> kycnList) {
		this.kycnList = kycnList;
	}

	public Kycl getKycl() {
		return kycl;
	}

	public List<Kycl> getKyclList() {
		return kyclList;
	}

	public void setKycl(Kycl kycl) {
		this.kycl = kycl;
	}

	public void setKyclList(List<Kycl> kyclList) {
		this.kyclList = kyclList;
	}

	public AdverseMedia getAdverseMedia() {
		return adverseMedia;
	}

	public List<AdverseMedia> getAdverseMediaList() {
		return adverseMediaList;
	}

	public void setAdverseMedia(AdverseMedia adverseMedia) {
		this.adverseMedia = adverseMedia;
	}

	public void setAdverseMediaList(List<AdverseMedia> adverseMediaList) {
		this.adverseMediaList = adverseMediaList;
	}

	public HotList getHotList() {
		return hotList;
	}

	public List<HotList> getHotListList() {
		return hotListList;
	}

	public void setHotList(HotList hotList) {
		this.hotList = hotList;
	}

	public void setHotListList(List<HotList> hotListList) {
		this.hotListList = hotListList;
	}

	public Investigation getInvestigation() {
		return investigation;
	}

	public List<Investigation> getInvestigationList() {
		return investigationList;
	}

	public void setInvestigation(Investigation investigation) {
		this.investigation = investigation;
	}

	public void setInvestigationList(List<Investigation> investigationList) {
		this.investigationList = investigationList;
	}

	public Pepentry getPepentry() {
		return pepentry;
	}

	public List<Pepentry> getPepentryList() {
		return pepentryList;
	}

	public void setPepentry(Pepentry pepentry) {
		this.pepentry = pepentry;
	}

	public void setPepentryList(List<Pepentry> pepentryList) {
		this.pepentryList = pepentryList;
	}

	public TtrBase getTtr() {
		return ttr;
	}

	public List<TtrBase> getTtrList() {
		return ttrList;
	}

	public void setTtr(TtrBase ttr) {
		this.ttr = ttr;
	}

	public void setTtrList(List<TtrBase> ttrList) {
		this.ttrList = ttrList;
	}

	public StrBase getStr() {
		return str;
	}

	public List<StrBase> getStrList() {
		return strList;
	}

	public void setStr(StrBase str) {
		this.str = str;
	}

	public void setStrList(List<StrBase> strList) {
		this.strList = strList;
	}

	public DetailBranchInfo getDetailBranchInfo() {
		return detailBranchInfo;
	}

	public List<DetailBranchInfo> getDetailBranchInfoList() {
		return detailBranchInfoList;
	}

	public void setDetailBranchInfo(DetailBranchInfo detailBranchInfo) {
		this.detailBranchInfo = detailBranchInfo;
	}

	public void setDetailBranchInfoList(List<DetailBranchInfo> detailBranchInfoList) {
		this.detailBranchInfoList = detailBranchInfoList;
	}

	public Bfi getBfi() {
		return bfi;
	}

	public List<Bfi> getBfiList() {
		return bfiList;
	}

	public void setBfi(Bfi bfi) {
		this.bfi = bfi;
	}

	public void setBfiList(List<Bfi> bfiList) {
		this.bfiList = bfiList;
	}

}
