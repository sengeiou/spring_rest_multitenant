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
@Table(name = "kycl_landlord_info")
public class LandlordInfo {

	@Id
	@SequenceGenerator(name = "kycl_landlord_info_id_seq", sequenceName = "kycl_landlord_info_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kycl_landlord_info_id_seq")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "kycl_id")
	@JsonIgnore
	private Kycl kycl;

	@JsonProperty("land_lord_first_name")
	@Column(name = "land_lord_first_name")
	private String landLordFirstName;

	@JsonProperty("land_lord_middle_name")
	@Column(name = "land_lord_middle_name")
	private String landLordMiddleName;

	@JsonProperty("land_lord_last_name")
	@Column(name = "land_lord_last_name")
	private String landLordLastName;

	@JsonProperty("country")
	private String country;

	@JsonProperty("province")
	private String province;

	@JsonProperty("district")
	private String district;

	@JsonProperty("mn_vdc")
	@Column(name = "mn_vdc")
	private String mnVdc;

	@JsonProperty("ward_no")
	@Column(name = "ward_no")
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
	boolean change;

	@Override
	public String toString() {
		return "LandlordInfo [id=" + id + ", landLordFirstName=" + landLordFirstName + ", landLordMiddleName="
				+ landLordMiddleName + ", landLordLastName=" + landLordLastName + ", country=" + country + ", province="
				+ province + ", district=" + district + ", mnVdc=" + mnVdc + ", wardNo=" + wardNo + ", townCity="
				+ townCity + ", notes=" + notes + ", phoneNoCountryCode=" + phoneNoCountryCode + ", phoneNoAreaCode="
				+ phoneNoAreaCode + ", phoneNo=" + phoneNo + ", telexNoCountryCode=" + telexNoCountryCode
				+ ", telexNoAreaCode=" + telexNoAreaCode + ", telexNo=" + telexNo + ", pagerNoCountryCode="
				+ pagerNoCountryCode + ", pagerNoAreaCode=" + pagerNoAreaCode + ", pagerNo=" + pagerNo + ", emailId="
				+ emailId + ", zone=" + zone + ", change=" + change + "]";
	}

	public Long getId() {
		return id;
	}

	public Kycl getKycl() {
		return kycl;
	}

	public String getLandLordFirstName() {
		return landLordFirstName;
	}

	public String getLandLordMiddleName() {
		return landLordMiddleName;
	}

	public String getLandLordLastName() {
		return landLordLastName;
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

	public void setLandLordFirstName(String landLordFirstName) {
		this.landLordFirstName = landLordFirstName;
	}

	public void setLandLordMiddleName(String landLordMiddleName) {
		this.landLordMiddleName = landLordMiddleName;
	}

	public void setLandLordLastName(String landLordLastName) {
		this.landLordLastName = landLordLastName;
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
