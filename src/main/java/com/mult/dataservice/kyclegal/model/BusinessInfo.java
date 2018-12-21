package com.mult.dataservice.kyclegal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "kycl_business_info")
public class BusinessInfo {

	@Id
	@SequenceGenerator(name = "kycl_business_info_id_seq", sequenceName = "kycl_business_info_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kycl_business_info_id_seq")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "kycl_id")
	@JsonIgnore
	private Kycl kycl;

	@JsonProperty("branches_name")
	@Column(name = "branches_name")
	private String branchesName;

	@JsonProperty("nature_of_business")
	@Column(name = "nature_of_business")
	private String natureOfBusiness;

	@JsonProperty("main_branches_offices")
	@Column(name = "main_branches_offices")
	private String mainBranchesOffices;

	@JsonProperty("geographical_coverage")
	@Column(name = "geographical_coverage")
	private String geographicalCoverage;

	@JsonProperty("country")
	private String country;
	
	@JsonProperty("goaml_country")
	@Column(name="goaml_country")
	private String goamlCountry;

	@JsonProperty("province")
	private String province;

	@JsonProperty("district")
	private String district;

	@JsonProperty("mn_vdc")
	@Column(name = "mn_vdc")
	private String mnVdc;

	@JsonProperty("ward_no")
	private String wardNo;

	@JsonProperty("town_city")
	@Column(name = "town_city")
	private String townCity;

	@JsonProperty("notes")
	private String notes;

	@JsonProperty("phone_no_country_code")
	@Column(name = "phone_no_country_code")
	private String phoneNoCountryCode;

	@JsonProperty("phone_no_area_code")
	@Column(name = "phone_no_area_code")
	private String phoneNoAreaCode;

	@JsonProperty("phone_no")
	@Column(name = "phone_no")
	private String phoneNo;

	@JsonProperty("telex_no_country_code")
	@Column(name = "telex_no_country_code")
	private String telexNoCountryCode;

	@JsonProperty("telex_no_area_code")
	@Column(name = "telex_no_area_code")
	private String telexNoAreaCode;

	@JsonProperty("telex_no")
	@Column(name = "telex_no")
	private String telexNo;

	@JsonProperty("pager_no_country_code")
	@Column(name = "pager_no_country_code")
	private String pagerNoCountryCode;

	@JsonProperty("pager_no_area_code")
	@Column(name = "pager_no_area_code")
	private String pagerNoAreaCode;

	@JsonProperty("pager_no")
	@Column(name = "pager_no")
	private String pagerNo;

	@JsonProperty("email_id")
	@Column(name = "email_id")
	private String emailId;

	@JsonProperty("zone")
	private String zone;

	@JsonProperty("change")
	private boolean change;


	public String getGoamlCountry() {
		return goamlCountry;
	}

	public void setGoamlCountry(String goamlCountry) {
		this.goamlCountry = goamlCountry;
	}

	public Long getId() {
		return id;
	}

	public Kycl getKycl() {
		return kycl;
	}

	public String getBranchesName() {
		return branchesName;
	}

	public String getNatureOfBusiness() {
		return natureOfBusiness;
	}

	public String getMainBranchesOffices() {
		return mainBranchesOffices;
	}

	public String getGeographicalCoverage() {
		return geographicalCoverage;
	}

	public String getCountry() {
		return country;
	}

	public String getProvince() {
		return province;
	}

	public String getDistrict() {
		return district;
	}

	public String getMnVdc() {
		return mnVdc;
	}

	public String getWardNo() {
		return wardNo;
	}

	public String getTownCity() {
		return townCity;
	}

	public String getNotes() {
		return notes;
	}

	public String getPhoneNoCountryCode() {
		return phoneNoCountryCode;
	}

	public String getPhoneNoAreaCode() {
		return phoneNoAreaCode;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public String getTelexNoCountryCode() {
		return telexNoCountryCode;
	}

	public String getTelexNoAreaCode() {
		return telexNoAreaCode;
	}

	public String getTelexNo() {
		return telexNo;
	}

	public String getPagerNoCountryCode() {
		return pagerNoCountryCode;
	}

	public String getPagerNoAreaCode() {
		return pagerNoAreaCode;
	}

	public String getPagerNo() {
		return pagerNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getZone() {
		return zone;
	}

	public boolean isChange() {
		return change;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setKycl(Kycl kycl) {
		this.kycl = kycl;
	}

	public void setBranchesName(String branchesName) {
		this.branchesName = branchesName;
	}

	public void setNatureOfBusiness(String natureOfBusiness) {
		this.natureOfBusiness = natureOfBusiness;
	}

	public void setMainBranchesOffices(String mainBranchesOffices) {
		this.mainBranchesOffices = mainBranchesOffices;
	}

	public void setGeographicalCoverage(String geographicalCoverage) {
		this.geographicalCoverage = geographicalCoverage;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setMnVdc(String mnVdc) {
		this.mnVdc = mnVdc;
	}

	public void setWardNo(String wardNo) {
		this.wardNo = wardNo;
	}

	public void setTownCity(String townCity) {
		this.townCity = townCity;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setPhoneNoCountryCode(String phoneNoCountryCode) {
		this.phoneNoCountryCode = phoneNoCountryCode;
	}

	public void setPhoneNoAreaCode(String phoneNoAreaCode) {
		this.phoneNoAreaCode = phoneNoAreaCode;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void setTelexNoCountryCode(String telexNoCountryCode) {
		this.telexNoCountryCode = telexNoCountryCode;
	}

	public void setTelexNoAreaCode(String telexNoAreaCode) {
		this.telexNoAreaCode = telexNoAreaCode;
	}

	public void setTelexNo(String telexNo) {
		this.telexNo = telexNo;
	}

	public void setPagerNoCountryCode(String pagerNoCountryCode) {
		this.pagerNoCountryCode = pagerNoCountryCode;
	}

	public void setPagerNoAreaCode(String pagerNoAreaCode) {
		this.pagerNoAreaCode = pagerNoAreaCode;
	}

	public void setPagerNo(String pagerNo) {
		this.pagerNo = pagerNo;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public void setChange(boolean change) {
		this.change = change;
	}

}
