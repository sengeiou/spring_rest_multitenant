package com.mult.dataservice.adversemedia.model;

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
import com.mult.dataservice.hotlist.model.HotList;
import com.mult.dataservice.investigation.model.Investigation;
import com.mult.dataservice.pepentry.model.Pepentry;

@Entity
@Table(name = "address_info")
public class AddressInfo {

	@Id
	@SequenceGenerator(name = "adverse_media_address_info_id_seq", sequenceName = "adverse_media_address_info_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "adverse_media_address_info_id_seq")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "adverse_media_id")
	@JsonIgnore
	private AdverseMedia adverseMedia;

	@ManyToOne
	@JoinColumn(name = "hot_list_id")
	@JsonIgnore
	private HotList hotList;

	@ManyToOne
	@JoinColumn(name = "investigation_id")
	@JsonIgnore
	private Investigation investigation;

	@ManyToOne
	@JoinColumn(name = "pepentry_id")
	@JsonIgnore
	private Pepentry pepentry;

	@JsonProperty("country")
	private String country;

	@JsonProperty("state")
	private String state;

	@JsonProperty("province")
	private String province;

	@JsonProperty("district")
	private String district;

	@JsonProperty("mn_vdc")
	@Column(name = "mn_vdc")
	private String mnVdc;

	@JsonProperty("town_city")
	@Column(name = "town_city")
	private String townCityVillage;

	@JsonProperty("tole")
	private String tole;

	@JsonProperty("street")
	private String street;

	@JsonProperty("house_number")
	@Column(name = "house_number")
	private String houseNumber;

	@JsonProperty("notes")
	private String notes;

	@JsonProperty("pager_no")
	@Column(name = "pager_no")
	private String pagerNo;

	@JsonProperty("phone_no_country_code")
	@Column(name = "phone_no_country_code")
	private String phoneNoCountryCode;

	@JsonProperty("telex_no_country_code")
	@Column(name = "telex_no_country_code")
	private String telexNoCountryCode;

	@JsonProperty("pager_no_area_code")
	@Column(name = "pager_no_area_code")
	private String pagerNoAreaCode;

	@JsonProperty("telex_no_area_code")
	@Column(name = "telex_no_area_code")
	private String telexNoAreaCode;

	@JsonProperty("pager_no_country_code")
	@Column(name = "pager_no_country_code")
	private String pagerNoCountryCode;

	@JsonProperty("phone_no")
	@Column(name = "phone_no")
	private String phoneNo;

	@JsonProperty("telex_no")
	@Column(name = "telex_no")
	private String telexNo;

	@JsonProperty("phone_no_area_code")
	@Column(name = "phone_no_area_code")
	private String phoneNoAreaCode;

	@JsonProperty("contact_type")
	@Column(name = "contact_type")
	private String communicationType;

	@JsonProperty("change")
	private boolean change;

	@Override
	public String toString() {
		return "AdverseAddressInfo [id=" + id + ", country=" + country + ", state=" + state + ", province=" + province
				+ ", district=" + district + ", mnVdc=" + mnVdc + ", townCityVillage=" + townCityVillage + ", tole="
				+ tole + ", street=" + street + ", houseNumber=" + houseNumber + ", notes=" + notes + ", pagerNo="
				+ pagerNo + ", phoneNoCountryCode=" + phoneNoCountryCode + ", telexNoCountryCode=" + telexNoCountryCode
				+ ", pagerNoAreaCode=" + pagerNoAreaCode + ", telexNoAreaCode=" + telexNoAreaCode
				+ ", pagerNoCountryCode=" + pagerNoCountryCode + ", phoneNo=" + phoneNo + ", telexNo=" + telexNo
				+ ", phoneNoAreaCode=" + phoneNoAreaCode + ", communicationType=" + communicationType + ", change="
				+ change + "]";
	}

	public Long getId() {
		return id;
	}

	public AdverseMedia getAdverseMedia() {
		return adverseMedia;
	}

	public HotList getHotList() {
		return hotList;
	}

	public Investigation getInvestigation() {
		return investigation;
	}

	public Pepentry getPepentry() {
		return pepentry;
	}

	public String getCountry() {
		return country;
	}

	public String getState() {
		return state;
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

	public String getTownCityVillage() {
		return townCityVillage;
	}

	public String getTole() {
		return tole;
	}

	public String getStreet() {
		return street;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public String getNotes() {
		return notes;
	}

	public String getPagerNo() {
		return pagerNo;
	}

	public String getPhoneNoCountryCode() {
		return phoneNoCountryCode;
	}

	public String getTelexNoCountryCode() {
		return telexNoCountryCode;
	}

	public String getPagerNoAreaCode() {
		return pagerNoAreaCode;
	}

	public String getTelexNoAreaCode() {
		return telexNoAreaCode;
	}

	public String getPagerNoCountryCode() {
		return pagerNoCountryCode;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public String getTelexNo() {
		return telexNo;
	}

	public String getPhoneNoAreaCode() {
		return phoneNoAreaCode;
	}

	public String getCommunicationType() {
		return communicationType;
	}

	public boolean isChange() {
		return change;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setAdverseMedia(AdverseMedia adverseMedia) {
		this.adverseMedia = adverseMedia;
	}

	public void setHotList(HotList hotList) {
		this.hotList = hotList;
	}

	public void setInvestigation(Investigation investigation) {
		this.investigation = investigation;
	}

	public void setPepentry(Pepentry pepentry) {
		this.pepentry = pepentry;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setState(String state) {
		this.state = state;
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

	public void setTownCityVillage(String townCityVillage) {
		this.townCityVillage = townCityVillage;
	}

	public void setTole(String tole) {
		this.tole = tole;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setPagerNo(String pagerNo) {
		this.pagerNo = pagerNo;
	}

	public void setPhoneNoCountryCode(String phoneNoCountryCode) {
		this.phoneNoCountryCode = phoneNoCountryCode;
	}

	public void setTelexNoCountryCode(String telexNoCountryCode) {
		this.telexNoCountryCode = telexNoCountryCode;
	}

	public void setPagerNoAreaCode(String pagerNoAreaCode) {
		this.pagerNoAreaCode = pagerNoAreaCode;
	}

	public void setTelexNoAreaCode(String telexNoAreaCode) {
		this.telexNoAreaCode = telexNoAreaCode;
	}

	public void setPagerNoCountryCode(String pagerNoCountryCode) {
		this.pagerNoCountryCode = pagerNoCountryCode;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void setTelexNo(String telexNo) {
		this.telexNo = telexNo;
	}

	public void setPhoneNoAreaCode(String phoneNoAreaCode) {
		this.phoneNoAreaCode = phoneNoAreaCode;
	}

	public void setCommunicationType(String communicationType) {
		this.communicationType = communicationType;
	}

	public void setChange(boolean change) {
		this.change = change;
	}

}
