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
@Table(name = "kycn_address_info")
@JsonIgnoreProperties(ignoreUnknown = true)
public class KycnAddressInfo {

	@Id
	@SequenceGenerator(name = "kycn_address_id_seq", sequenceName = "kycn_address_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kycn_address_id_seq")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "kycn_base_id")
	@JsonIgnore
	private KycnBase kycnBase;

	@JsonProperty("country")
	@Column(name = "country")
	private String country;

	@JsonProperty("goaml_address_type")
	@Column(name = "goaml_address_type")
	private String goamlAddressType;

	@JsonProperty("goaml_country")
	@Column(name = "goaml_country")
	private String goamlCountry;

	private String city;

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

	@JsonProperty("ward_number")
	@Column(name = "ward_number")
	private String wardNumber;

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
	@Column(name = "notes")
	private String notes;

	@JsonProperty("type")
	@Column(name = "type")
	private String type;

	@JsonProperty("town") // Edited as per jsp
	@Column(name = "town")
	private String townCity;

	@JsonProperty("primary_contact")
	@Column(name = "primary_contact")
	private String primaryContactNumber;

	@JsonProperty("fax_number")
	@Column(name = "fax_number")
	private String faxNumber;

	@JsonProperty("secondary_contact_number")
	@Column(name = "secondary_contact_number")
	private String secondaryContactNumber;

	@JsonProperty("email_address")
	@Column(name = "email_address")
	private String emailAddress;

	@JsonProperty("post_box_number")
	@Column(name = "post_box_number")
	private String postBoxNumber;

	@JsonProperty("is_rent")
	@Column(name = "is_rent")
	private String isRent;

	@JsonProperty("landlord_name")
	@Column(name = "landlord_name")
	private String landlordName;

	@JsonProperty("utility_bill_number")
	@Column(name = "utility_bill_number")
	private String utilityBillnuber;

	@JsonProperty("utility_bill_type")
	@Column(name = "utility_bill_type")
	private String utilityBillType;

	@JsonProperty("address_type")
	@Column(name = "address_type")
	private String addressType;

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
		return "KycnAddressInfo [id=" + id + ", country=" + country + ", state=" + state + ", zone=" + zone
				+ ", district=" + district + ", province=" + province + ", mnVdc=" + mnVdc + ", pinZip=" + pinZip
				+ ", wardNumber=" + wardNumber + ", toleArea=" + toleArea + ", street=" + street + ", latitude="
				+ latitude + ", longitude=" + longitude + ", nearestLandMark=" + nearestLandMark + ", houseNo="
				+ houseNo + ", unitNumber=" + unitNumber + ", phoneNoCountryCode=" + phoneNoCountryCode
				+ ", phoneNoAreaCode=" + phoneNoAreaCode + ", phoneNo=" + phoneNo + ", telexNoCountryCode="
				+ telexNoCountryCode + ", telexNoAreaCode=" + telexNoAreaCode + ", telexNo=" + telexNo
				+ ", pagerNoCountryCode=" + pagerNoCountryCode + ", pagerNoAreaCode=" + pagerNoAreaCode + ", pagerNo="
				+ pagerNo + ", emailId=" + emailId + ", notes=" + notes + ", type=" + type + ", townCity=" + townCity
				+ ", primaryContactNumber=" + primaryContactNumber + ", faxNumber=" + faxNumber
				+ ", secondaryContactNumber=" + secondaryContactNumber + ", emailAddress=" + emailAddress
				+ ", postBoxNumber=" + postBoxNumber + ", isRent=" + isRent + ", landlordName=" + landlordName
				+ ", utilityBillnuber=" + utilityBillnuber + ", utilityBillType=" + utilityBillType + ", addressType="
				+ addressType + ", change=" + change + ", maker=" + maker + ", checker=" + checker + ", approved="
				+ approved + ", updateDate=" + updateDate + ", approvedDate=" + approvedDate + ", reason=" + reason
				+ "]";
	}

	public Long getId() {
		return id;
	}

	public KycnBase getKycnBase() {
		return kycnBase;
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

	public String getWardNumber() {
		return wardNumber;
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

	public String getType() {
		return type;
	}

	public String getTownCity() {
		return townCity;
	}

	public String getPrimaryContactNumber() {
		return primaryContactNumber;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public String getSecondaryContactNumber() {
		return secondaryContactNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getPostBoxNumber() {
		return postBoxNumber;
	}

	public String getIsRent() {
		return isRent;
	}

	public String getLandlordName() {
		return landlordName;
	}

	public String getUtilityBillnuber() {
		return utilityBillnuber;
	}

	public String getUtilityBillType() {
		return utilityBillType;
	}

	public String getAddressType() {
		return addressType;
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

	public void setWardNumber(String wardNumber) {
		this.wardNumber = wardNumber;
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

	public void setType(String type) {
		this.type = type;
	}

	public void setTownCity(String townCity) {
		this.townCity = townCity;
	}

	public void setPrimaryContactNumber(String primaryContactNumber) {
		this.primaryContactNumber = primaryContactNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public void setSecondaryContactNumber(String secondaryContactNumber) {
		this.secondaryContactNumber = secondaryContactNumber;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setPostBoxNumber(String postBoxNumber) {
		this.postBoxNumber = postBoxNumber;
	}

	public void setIsRent(String isRent) {
		this.isRent = isRent;
	}

	public void setLandlordName(String landlordName) {
		this.landlordName = landlordName;
	}

	public void setUtilityBillnuber(String utilityBillnuber) {
		this.utilityBillnuber = utilityBillnuber;
	}

	public void setUtilityBillType(String utilityBillType) {
		this.utilityBillType = utilityBillType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
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

	public String getGoamlAddressType() {
		return goamlAddressType;
	}

	public String getGoamlCountry() {
		return goamlCountry;
	}

	public String getCity() {
		return city;
	}

	public void setGoamlAddressType(String goamlAddressType) {
		this.goamlAddressType = goamlAddressType;
	}

	public void setGoamlCountry(String goamlCountry) {
		this.goamlCountry = goamlCountry;
	}

	public void setCity(String city) {
		this.city = city;
	}

}