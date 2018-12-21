package com.mult.dataservice.identity.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mult.dataservice.adversemedia.model.AdverseMedia;
import com.mult.dataservice.bfibranch.model.DetailBranchInfo;
import com.mult.dataservice.hotlist.model.HotList;
import com.mult.dataservice.kyclegal.model.Kycl;
import com.mult.dataservice.kycnatural.model.KycnPersonalInfo;

@Entity
@Table(name = "user_main")
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

	@Id
	@JsonProperty("id")
	@SequenceGenerator(name = "kycn_user_id_seq", sequenceName = "kycn_user_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kycn_user_id_seq")
	private Long id;

	@OneToOne
	@JoinColumn(name = "personal_info_id")
	@JsonIgnore
	private KycnPersonalInfo personalInfo;

	@OneToOne
	@JoinColumn(name = "adverse_media_id")
	@JsonIgnore
	private AdverseMedia adverseMedia;

	@OneToOne
	@JoinColumn(name = "hot_list_id")
	@JsonIgnore
	private HotList hotList;

	@OneToOne
	@JoinColumn(name = "detail_branch_info_id")
	@JsonIgnore
	private DetailBranchInfo detailBranchInfo;

	@OneToOne
	@JoinColumn(name = "kyc_id")
	@JsonIgnore
	private Kycl kycl;

	@JsonProperty("username")
	@Column(name = "username")
	private String userName;

	@JsonProperty("password")
	@Column(name = "password")
	private String password;

	@JsonProperty("sol_id")
	@Column(name = "sol_id")
	private String solId;

	@JsonProperty("authenticated")
	@Column(name = "authenticated")
	private boolean authenticated;

	@JsonProperty("apikey")
	@Column(name = "apikey")
	private String apikey;

	@JsonProperty("designation")
	@Column(name = "designation")
	private String designation;

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", solId=" + solId
				+ ", authenticated=" + authenticated + ", apikey=" + apikey + ", designation=" + designation + "]";
	}

	public Long getId() {
		return id;
	}

	public KycnPersonalInfo getPersonalInfo() {
		return personalInfo;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getSolId() {
		return solId;
	}

	public boolean isAuthenticated() {
		return authenticated;
	}

	public String getApikey() {
		return apikey;
	}

	public String getDesignation() {
		return designation;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPersonalInfo(KycnPersonalInfo personalInfo) {
		this.personalInfo = personalInfo;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setSolId(String solId) {
		this.solId = solId;
	}

	public void setAuthenticated(boolean authenticated) {
		this.authenticated = authenticated;
	}

	public void setApikey(String apikey) {
		this.apikey = apikey;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Kycl getKycl() {
		return kycl;
	}

	public void setKycl(Kycl kycl) {
		this.kycl = kycl;
	}

	public AdverseMedia getAdverseMedia() {
		return adverseMedia;
	}

	public HotList getHotList() {
		return hotList;
	}

	public void setAdverseMedia(AdverseMedia adverseMedia) {
		this.adverseMedia = adverseMedia;
	}

	public void setHotList(HotList hotList) {
		this.hotList = hotList;
	}

	public DetailBranchInfo getDetailBranchInfo() {
		return detailBranchInfo;
	}

	public void setDetailBranchInfo(DetailBranchInfo detailBranchInfo) {
		this.detailBranchInfo = detailBranchInfo;
	}

}
