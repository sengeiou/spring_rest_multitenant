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
@Table(name = "kycl_related_entity")
public class RelatedEntity {

	@Id
	@SequenceGenerator(name = "kycl_related_entity_id_seq", sequenceName = "kycl_related_entity_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kycl_related_entity_id_seq")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "kycl_id")
	@JsonIgnore
	private Kycl kycl;

	@JsonProperty("entity_type")
	@Column(name = "entity_type")
	private String entityType;

	@JsonProperty("cust_id")
	@Column(name = "cust_id")
	private String custId;

	@JsonProperty("kycn_id")
	@Column(name = "kycn_id")
	private long kycnId;

	@JsonProperty("salutation")
	private String salutation;

	@JsonProperty("name")
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

	@JsonProperty("country")
	private String country;

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

	@JsonProperty("notes")
	private String notes;

	@JsonProperty("change")
	private boolean change;

	@JsonProperty("province")
	private String province;

	@Override
	public String toString() {
		return "RelatedEntity [id=" + id + ", entityType=" + entityType + ", custId=" + custId + ", kycnId=" + kycnId
				+ ", salutation=" + salutation + ", name=" + name + ", lsName=" + lsName + ", calledByName="
				+ calledByName + ", primaryIdentificationDocumentType=" + primaryIdentificationDocumentType
				+ ", registrationNo=" + registrationNo + ", country=" + country + ", zone=" + zone + ", district="
				+ district + ", mnVdc=" + mnVdc + ", pinzip=" + pinzip + ", wardNumber=" + wardNumber + ", toleArea="
				+ toleArea + ", street=" + street + ", houseNo=" + houseNo + ", unitNumber=" + unitNumber
				+ ", nearestLandmark=" + nearestLandmark + ", latitude=" + latitude + ", longitude=" + longitude
				+ ", phoneNoCountryCode=" + phoneNoCountryCode + ", phoneNoAreaCode=" + phoneNoAreaCode + ", phoneNo="
				+ phoneNo + ", telexNoCountryCode=" + telexNoCountryCode + ", telexNoAreaCode=" + telexNoAreaCode
				+ ", telexNo=" + telexNo + ", notes=" + notes + ", change=" + change + ", province=" + province + "]";
	}

	public Long getId() {
		return id;
	}

	public Kycl getKycl() {
		return kycl;
	}

	public String getEntityType() {
		return entityType;
	}

	public String getCustId() {
		return custId;
	}

	public long getKycnId() {
		return kycnId;
	}

	public String getSalutation() {
		return salutation;
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

	public void setKycl(Kycl kycl) {
		this.kycl = kycl;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public void setKycnId(long kycnId) {
		this.kycnId = kycnId;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
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
