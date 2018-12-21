package com.mult.dataservice.bfibranch.model;

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
@Table(name = "branch_address")
@JsonIgnoreProperties
public class BranchAddress {

	@Id
	@SequenceGenerator(name = "branch_address_id_seq", sequenceName = "branch_address_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "branch_address_id_seq")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "branch_id")
	@JsonIgnore
	private DetailBranchInfo detailBranchInfo;

	@JsonProperty("address_type")
	@Column(name = "address_type")
	private String addressType;

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

	@JsonProperty("town_city_village")
	@Column(name = "town_city_village")
	private String townCityVillage;

	@JsonProperty("tole")
	private String tole;

	@JsonProperty("street")
	private String street;

	@JsonProperty("house_number")
	@Column(name = "house_number")
	private String houseNumber;

	@JsonProperty("po_box_number")
	@Column(name = "po_box_number")
	private String poBoxNumber;

	@JsonProperty("pin_zip_number")
	@Column(name = "pin_zip_number")
	private String pinZipNumber;

	@JsonProperty("notes")
	private String notes;

	@JsonProperty("change")
	private boolean change;

	@Override
	public String toString() {
		return "BranchAddress [id=" + id + ", addressType=" + addressType + ", country=" + country + ", state=" + state
				+ ", province=" + province + ", district=" + district + ", mnVdc=" + mnVdc + ", townCityVillage="
				+ townCityVillage + ", tole=" + tole + ", street=" + street + ", houseNumber=" + houseNumber
				+ ", poBoxNumber=" + poBoxNumber + ", pinZipNumber=" + pinZipNumber + ", notes=" + notes + ", change="
				+ change + "]";
	}

	public Long getId() {
		return id;
	}

	public DetailBranchInfo getDetailBranchInfo() {
		return detailBranchInfo;
	}

	public String getAddressType() {
		return addressType;
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

	public String getPoBoxNumber() {
		return poBoxNumber;
	}

	public String getPinZipNumber() {
		return pinZipNumber;
	}

	public String getNotes() {
		return notes;
	}

	public boolean isChange() {
		return change;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDetailBranchInfo(DetailBranchInfo detailBranchInfo) {
		this.detailBranchInfo = detailBranchInfo;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
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

	public void setPoBoxNumber(String poBoxNumber) {
		this.poBoxNumber = poBoxNumber;
	}

	public void setPinZipNumber(String pinZipNumber) {
		this.pinZipNumber = pinZipNumber;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setChange(boolean change) {
		this.change = change;
	}

}
