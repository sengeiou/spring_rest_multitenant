package com.mult.dataservice.kycnatural.model;

import java.sql.Date;

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
@Table(name = "kycn_involvement_info")
@JsonIgnoreProperties(ignoreUnknown = true)
public class KycnInvolvementInfo {

	@Id
	@SequenceGenerator(name = "kycn_involvement_info_id_seq", sequenceName = "kycn_involvement_info_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kycn_involvement_info_id_seq")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "kycn_base_id")
	@JsonIgnore
	private KycnBase kycnBase;

	@JsonProperty("kycl_id")
	@Column(name = "kycl_id")
	private long kyclId;

	@JsonProperty("organization_nature")
	@Column(name = "organization_nature")
	private String organizationNature;

	@JsonProperty("organization_name")
	@Column(name = "organization_name")
	private String organizationName;

	@JsonProperty("country")
	@Column(name = "country")
	private String country;

	@JsonProperty("state")
	@Column(name = "state")
	private String state;

	@JsonProperty("zone")
	@Column(name = "zone")
	private String zone;

	@JsonProperty("district")
	@Column(name = "district")
	private String district;

	@JsonProperty("province") // added looking into jsp
	@Column(name = "province")
	private String province;

	@JsonProperty("mn_vdc")
	@Column(name = "mn_vdc")
	private String mnVdc;

	@JsonProperty("pinzip")
	@Column(name = "pinzip")
	private String pinZip;

	@JsonProperty("involvement_ward_number")
	@Column(name = "involvement_ward_number")
	private String involvementWardNumber;

	@JsonProperty("tole_area")
	@Column(name = "tole_area")
	private String toleArea;

	@JsonProperty("street")
	@Column(name = "street")
	private String street;

	@JsonProperty("latitude")
	@Column(name = "latitude")
	private String latitude;

	@JsonProperty("longitude")
	@Column(name = "longitude")
	private String longitude;

	@JsonProperty("nearest_landmark")
	@Column(name = "nearest_landmark")
	private String nearestLandMark;

	@JsonProperty("house_no")
	@Column(name = "house_no")
	private String houseNo;

	@JsonProperty("unit_number")
	@Column(name = "unit_number")
	private String unitNumber;

	@JsonProperty("phone_no_country_code")
	@Column(name = "phone_no_country_code")
	private String phoneNoCountryCode;

	@JsonProperty("phone_no_area_code")
	@Column(name = "phone_no_area_code")
	private String phoneNoAreaCode;

	@JsonProperty("phone_no")
	@Column(name = "phone_no")
	private String phoneNo;

	@JsonProperty("fax_no_country_code")
	@Column(name = "fax_no_country_code")
	private String faxNoCountryCode;

	@JsonProperty("fax_no_area_code")
	@Column(name = "fax_no_area_code")
	private String faxNoAreaCode;

	@JsonProperty("fax_no")
	@Column(name = "fax_no")
	private String faxNo;

	@JsonProperty("email_id")
	@Column(name = "email_id")
	private String emailId;

	@JsonProperty("website")
	@Column(name = "website")
	private String website;

	@JsonProperty("panvat")
	@Column(name = "panvat")
	private String panVat;

	@JsonProperty("poboxno")
	@Column(name = "poboxno")
	private String poBoxNo;

	@JsonProperty("nature")
	@Column(name = "nature")
	private String nature;

	@JsonProperty("designation")
	@Column(name = "designation")
	private String designation;

	@JsonProperty("start_date")
	@Column(name = "start_date")
	private Date startDate;

	@JsonProperty("end_date")
	@Column(name = "end_date")
	private Date endDate;

	@JsonProperty("involvement_notes")
	@Column(name = "involvement_notes")
	private String involvementNotes;

	@JsonProperty("notes")
	@Column(name = "notes")
	private String notes;

	@JsonProperty("nature_of_involvement")
	@Column(name = "nature_of_involvement")
	private String involvementNature;

	@JsonProperty("occupation_type")
	@Column(name = "occupation_type")
	private String occupationType;

	@JsonProperty("occ_type")
	@Column(name = "occ_type")
	private String occType;

	@JsonProperty("change")
	@Column(name = "change")
	private boolean change;

	@Column(name = "maker")
	private String maker;

	@Column(name = "checker")
	private String checker;

	@Column(name = "approved")
	private boolean approved;

	@Column(name = "updateDate")
	private Date updateDate;

	@Column(name = "approvedDate")
	private Date approvedDate;

	@Column(name = "reason")
	private String reason;

	@Override
	public String toString() {
		return "KycnInvolvementInfo [id=" + id + ", kyclId=" + kyclId + ", organizationNature=" + organizationNature
				+ ", country=" + country + ", state=" + state + ", zone=" + zone + ", district=" + district
				+ ", province=" + province + ", mnVdc=" + mnVdc + ", pinZip=" + pinZip + ", involvementWardNumber="
				+ involvementWardNumber + ", toleArea=" + toleArea + ", street=" + street + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", nearestLandMark=" + nearestLandMark + ", houseNo=" + houseNo
				+ ", unitNumber=" + unitNumber + ", phoneNoCountryCode=" + phoneNoCountryCode + ", phoneNoAreaCode="
				+ phoneNoAreaCode + ", phoneNo=" + phoneNo + ", faxNoCountryCode=" + faxNoCountryCode
				+ ", faxNoAreaCode=" + faxNoAreaCode + ", faxNo=" + faxNo + ", emailId=" + emailId + ", website="
				+ website + ", panVat=" + panVat + ", poBoxNo=" + poBoxNo + ", nature=" + nature + ", designation="
				+ designation + ", startDate=" + startDate + ", endDate=" + endDate + ", involvementNotes="
				+ involvementNotes + ", notes=" + notes + ", involvementNature=" + involvementNature
				+ ", occupationType=" + occupationType + ", change=" + change + ", maker=" + maker + ", checker="
				+ checker + ", approved=" + approved + ", updateDate=" + updateDate + ", approvedDate=" + approvedDate
				+ ", reason=" + reason + "]";
	}

	public Long getId() {
		return id;
	}

	public KycnBase getKycnBase() {
		return kycnBase;
	}

	public long getKyclId() {
		return kyclId;
	}

	public String getOrganizationNature() {
		return organizationNature;
	}

	public String getCountry() {
		return country;
	}

	public String getState() {
		return state;
	}

	public String getZone() {
		return zone;
	}

	public String getDistrict() {
		return district;
	}

	public String getProvince() {
		return province;
	}

	public String getMnVdc() {
		return mnVdc;
	}

	public String getPinZip() {
		return pinZip;
	}

	public String getInvolvementWardNumber() {
		return involvementWardNumber;
	}

	public String getToleArea() {
		return toleArea;
	}

	public String getStreet() {
		return street;
	}

	public String getLatitude() {
		return latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public String getNearestLandMark() {
		return nearestLandMark;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public String getUnitNumber() {
		return unitNumber;
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

	public String getFaxNoCountryCode() {
		return faxNoCountryCode;
	}

	public String getFaxNoAreaCode() {
		return faxNoAreaCode;
	}

	public String getFaxNo() {
		return faxNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getWebsite() {
		return website;
	}

	public String getPanVat() {
		return panVat;
	}

	public String getPoBoxNo() {
		return poBoxNo;
	}

	public String getNature() {
		return nature;
	}

	public String getDesignation() {
		return designation;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public String getInvolvementNotes() {
		return involvementNotes;
	}

	public String getNotes() {
		return notes;
	}

	public String getInvolvementNature() {
		return involvementNature;
	}

	public String getOccupationType() {
		return occupationType;
	}

	public boolean isChange() {
		return change;
	}

	public String getMaker() {
		return maker;
	}

	public String getChecker() {
		return checker;
	}

	public boolean isApproved() {
		return approved;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public Date getApprovedDate() {
		return approvedDate;
	}

	public String getReason() {
		return reason;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setKycnBase(KycnBase kycnBase) {
		this.kycnBase = kycnBase;
	}

	public void setKyclId(long kyclId) {
		this.kyclId = kyclId;
	}

	public void setOrganizationNature(String organizationNature) {
		this.organizationNature = organizationNature;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public void setMnVdc(String mnVdc) {
		this.mnVdc = mnVdc;
	}

	public void setPinZip(String pinZip) {
		this.pinZip = pinZip;
	}

	public void setInvolvementWardNumber(String involvementWardNumber) {
		this.involvementWardNumber = involvementWardNumber;
	}

	public void setToleArea(String toleArea) {
		this.toleArea = toleArea;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public void setNearestLandMark(String nearestLandMark) {
		this.nearestLandMark = nearestLandMark;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public void setUnitNumber(String unitNumber) {
		this.unitNumber = unitNumber;
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

	public void setFaxNoCountryCode(String faxNoCountryCode) {
		this.faxNoCountryCode = faxNoCountryCode;
	}

	public void setFaxNoAreaCode(String faxNoAreaCode) {
		this.faxNoAreaCode = faxNoAreaCode;
	}

	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public void setPanVat(String panVat) {
		this.panVat = panVat;
	}

	public void setPoBoxNo(String poBoxNo) {
		this.poBoxNo = poBoxNo;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public void setInvolvementNotes(String involvementNotes) {
		this.involvementNotes = involvementNotes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setInvolvementNature(String involvementNature) {
		this.involvementNature = involvementNature;
	}

	public void setOccupationType(String occupationType) {
		this.occupationType = occupationType;
	}

	public void setChange(boolean change) {
		this.change = change;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public void setChecker(String checker) {
		this.checker = checker;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public void setApprovedDate(Date approvedDate) {
		this.approvedDate = approvedDate;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public String getOccType() {
		return occType;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public void setOccType(String occType) {
		this.occType = occType;
	}

}