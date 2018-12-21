package com.mult.dataservice.kycnatural.model;

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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "kycn_related_entity_info")
@JsonIgnoreProperties(ignoreUnknown = true)
public class KycnRelatedEntityInfo {

	@Id
	@SequenceGenerator(name = "kycn_related_entity_info_id_seq", sequenceName = "kycn_related_entity_info_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kycn_related_entity_info_id_seq")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "kycn_base_id")
	@JsonIgnore
	private KycnBase kycnBase;

	@JsonProperty("related_entity_type")
	@Column(name = "related_entity_type")
	private String relatedEntityType;

	@JsonProperty("salutatiton")
	@Column(name = "salutatiton")
	private String salutatiton;

	@JsonProperty("cust_id")
	@Column(name = "cust_id")
	private String custId;

	@JsonProperty("kycn_id")
	@Column(name = "kycn_id")
	private long kycnId;

	@JsonProperty("name")
	@Column(name = "name")
	private String name;

	@JsonProperty("ls_name")
	@Column(name = "ls_name")
	private String lsName;

	@JsonProperty("called_by_name")
	@Column(name = "called_by_name")
	private String calledByName;

	@JsonProperty("primary_identification_document_type")
	@Column(name = "primary_identification_document_type")
	private String primaryIdentificationDocumentType;

	@JsonProperty("registration_no")
	@Column(name = "registration_no")
	private String registrationNo;

	@JsonProperty("related_entity_country")
	@Column(name = "related_entity_country")
	private String relatedEntityCountry;

	@JsonProperty("zone")
	@Column(name = "zone")
	private String zone;

	@JsonProperty("district")
	@Column(name = "district")
	private String district;

	@JsonProperty("mn_vdc")
	@Column(name = "mn_vdc")
	private String mnVdc;

	@JsonProperty("pinzip")
	@Column(name = "pinzip")
	private String pinzip;

	@JsonProperty("ward_number")
	@Column(name = "ward_number")
	private String wardNumber;

	@JsonProperty("tole_area")
	@Column(name = "tole_area")
	private String toleArea;

	@JsonProperty("street")
	@Column(name = "street")
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
	@Column(name = "latitude")
	private String latitude;

	@JsonProperty("longitude")
	@Column(name = "longitude")
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

	@JsonProperty("email_id")
	@Column(name = "email_id")
	private String emailId;

	@JsonProperty("notes")
	@Column(name = "notes")
	private String notes;

	@JsonProperty("change")
	@Column(name = "change")
	private boolean change;

	@JsonProperty("province")
	@Column(name = "province")
	private String province;

	@Override
	public String toString() {
		return "KycnRelatedEntityInfo [id=" + id + ", relatedEntityType=" + relatedEntityType + ", salutatiton="
				+ salutatiton + ", custId=" + custId + ", kycnId=" + kycnId + ", name=" + name + ", lsName=" + lsName
				+ ", calledByName=" + calledByName + ", primaryIdentificationDocumentType="
				+ primaryIdentificationDocumentType + ", registrationNo=" + registrationNo + ", relatedEntityCountry="
				+ relatedEntityCountry + ", zone=" + zone + ", district=" + district + ", mnVdc=" + mnVdc + ", pinzip="
				+ pinzip + ", wardNumber=" + wardNumber + ", toleArea=" + toleArea + ", street=" + street + ", houseNo="
				+ houseNo + ", unitNumber=" + unitNumber + ", nearestLandmark=" + nearestLandmark + ", latitude="
				+ latitude + ", longitude=" + longitude + ", phoneNoCountryCode=" + phoneNoCountryCode
				+ ", phoneNoAreaCode=" + phoneNoAreaCode + ", phoneNo=" + phoneNo + ", telexNoCountryCode="
				+ telexNoCountryCode + ", telexNoAreaCode=" + telexNoAreaCode + ", telexNo=" + telexNo + ", emailId="
				+ emailId + ", notes=" + notes + ", change=" + change + ", province=" + province + "]";
	}

	public Long getId() {
		return id;
	}

	public KycnBase getKycnBase() {
		return kycnBase;
	}

	public String getRelatedEntityType() {
		return relatedEntityType;
	}

	public String getSalutatiton() {
		return salutatiton;
	}

	public String getCustId() {
		return custId;
	}

	public long getKycnId() {
		return kycnId;
	}

	public String getName() {
		return name;
	}

	public String getLsName() {
		return lsName;
	}

	public String getCalledByName() {
		return calledByName;
	}

	public String getPrimaryIdentificationDocumentType() {
		return primaryIdentificationDocumentType;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public String getRelatedEntityCountry() {
		return relatedEntityCountry;
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

	public String getEmailId() {
		return emailId;
	}

	public String getNotes() {
		return notes;
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

	public void setKycnBase(KycnBase kycnBase) {
		this.kycnBase = kycnBase;
	}

	public void setRelatedEntityType(String relatedEntityType) {
		this.relatedEntityType = relatedEntityType;
	}

	public void setSalutatiton(String salutatiton) {
		this.salutatiton = salutatiton;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public void setKycnId(long kycnId) {
		this.kycnId = kycnId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLsName(String lsName) {
		this.lsName = lsName;
	}

	public void setCalledByName(String calledByName) {
		this.calledByName = calledByName;
	}

	public void setPrimaryIdentificationDocumentType(String primaryIdentificationDocumentType) {
		this.primaryIdentificationDocumentType = primaryIdentificationDocumentType;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public void setRelatedEntityCountry(String relatedEntityCountry) {
		this.relatedEntityCountry = relatedEntityCountry;
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

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setChange(boolean change) {
		this.change = change;
	}

	public void setProvince(String province) {
		this.province = province;
	}

}
