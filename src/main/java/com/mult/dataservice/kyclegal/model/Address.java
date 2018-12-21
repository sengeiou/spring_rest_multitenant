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
@Table(name = "kycl_address_info")
public class Address {

	@Id
	@SequenceGenerator(name = "kycl_address_id_seq", sequenceName = "kycl_address_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kycl_address_id_seq")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "kycl_id")
	@JsonIgnore
	private Kycl kycl;

	@JsonProperty("address_type")
	@Column(name = "address_type")
	private String addressType;

	@JsonProperty("goaml_address_type")
	@Column(name = "goaml_address_type")
	private String goamlAddressType;

	@JsonProperty("country")
	private String country;

	private String address;
	private String city;

	@JsonProperty("zone")
	private String zone;

	@JsonProperty("district")
	private String district;

	@JsonProperty("mn_vdc")
	@Column(name = "mn_vdc")
	private String mnVdc;

	@JsonProperty("pinzip")
	private String pinzip;

	@JsonProperty("ward_number")
	@Column(name = "ward_number")
	private String wardNumber;

	@JsonProperty("tole_area")
	@Column(name = "tole_area")
	private String toleArea;

	@JsonProperty("street")
	private String street;

	@JsonProperty("house_no")
	@Column(name = "house_no")
	private String houseNo;

	@JsonProperty("unit_number")
	@Column(name = "unit_number")
	private String unitNumber;

	@JsonProperty("nearest_landmark")
	@Column(name = "nearest_landmark")
	private String nearestLandmark;

	@JsonProperty("latitude")
	private String latitude;

	@JsonProperty("longitude")
	private String longitude;

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

	@JsonProperty("notes")
	private String notes;

	@JsonProperty("state")
	private String state;

	@JsonProperty("change")
	private boolean change;

	@JsonProperty("province")
	private String province;

	public Long getId() {
		return id;
	}

	public Kycl getKycl() {
		return kycl;
	}

	public String getAddressType() {
		return addressType;
	}

	public String getCountry() {
		return country;
	}

	public String getZone() {
		return zone;
	}

	public String getDistrict() {
		return district;
	}

	public String getMnVdc() {
		return mnVdc;
	}

	public String getPinzip() {
		return pinzip;
	}

	public String getWardNumber() {
		return wardNumber;
	}

	public String getToleArea() {
		return toleArea;
	}

	public String getStreet() {
		return street;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public String getUnitNumber() {
		return unitNumber;
	}

	public String getNearestLandmark() {
		return nearestLandmark;
	}

	public String getLatitude() {
		return latitude;
	}

	public String getLongitude() {
		return longitude;
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

	public String getNotes() {
		return notes;
	}

	public String getState() {
		return state;
	}

	public boolean isChange() {
		return change;
	}

	public String getProvince() {
		return province;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setKycl(Kycl kycl) {
		this.kycl = kycl;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setMnVdc(String mnVdc) {
		this.mnVdc = mnVdc;
	}

	public void setPinzip(String pinzip) {
		this.pinzip = pinzip;
	}

	public void setWardNumber(String wardNumber) {
		this.wardNumber = wardNumber;
	}

	public void setToleArea(String toleArea) {
		this.toleArea = toleArea;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getGoamlAddressType() {
		return goamlAddressType;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public void setGoamlAddressType(String goamlAddressType) {
		this.goamlAddressType = goamlAddressType;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setUnitNumber(String unitNumber) {
		this.unitNumber = unitNumber;
	}

	public void setNearestLandmark(String nearestLandmark) {
		this.nearestLandmark = nearestLandmark;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
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

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setChange(boolean change) {
		this.change = change;
	}

	public void setProvince(String province) {
		this.province = province;
	}

}
