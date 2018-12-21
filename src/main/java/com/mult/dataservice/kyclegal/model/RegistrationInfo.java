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
@Table(name = "kycl_registration_info")
public class RegistrationInfo {

	@Id
	@SequenceGenerator(name = "kycl_registration_info_id_seq", sequenceName = "kycl_registration_info_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kycl_registration_info_id_seq")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "kycl_id")
	@JsonIgnore
	private Kycl kycl;

	@JsonProperty("registration_authority")
	@Column(name = "registration_authority")
	String registrationAuthority;

	@JsonProperty("self_regulatory_body")
	@Column(name = "self_regulatory_body")
	String selfRegulatoryBody;

	@JsonProperty("regd_number")
	@Column(name = "regd_number")
	String regdNumber;

	@JsonProperty("licensing_authority")
	@Column(name = "licensing_authority")
	String licensingAuthority;

	@JsonProperty("license_number")
	@Column(name = "license_number")
	String licenseNumber;

	@JsonProperty("notes")
	String notes;

	@JsonProperty("change")
	boolean change;

	@Override
	public String toString() {
		return "RegistrationInfo [id=" + id + ", registrationAuthority=" + registrationAuthority
				+ ", selfRegulatoryBody=" + selfRegulatoryBody + ", regdNumber=" + regdNumber + ", licensingAuthority="
				+ licensingAuthority + ", licenseNumber=" + licenseNumber + ", notes=" + notes + ", change=" + change
				+ "]";
	}

	public Long getId() {
		return id;
	}

	public Kycl getKycl() {
		return kycl;
	}

	public String getRegistrationAuthority() {
		return registrationAuthority;
	}

	public String getSelfRegulatoryBody() {
		return selfRegulatoryBody;
	}

	public String getRegdNumber() {
		return regdNumber;
	}

	public String getLicensingAuthority() {
		return licensingAuthority;
	}

	public String getLicenseNumber() {
		return licenseNumber;
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

	public void setKycl(Kycl kycl) {
		this.kycl = kycl;
	}

	public void setRegistrationAuthority(String registrationAuthority) {
		this.registrationAuthority = registrationAuthority;
	}

	public void setSelfRegulatoryBody(String selfRegulatoryBody) {
		this.selfRegulatoryBody = selfRegulatoryBody;
	}

	public void setRegdNumber(String regdNumber) {
		this.regdNumber = regdNumber;
	}

	public void setLicensingAuthority(String licensingAuthority) {
		this.licensingAuthority = licensingAuthority;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setChange(boolean change) {
		this.change = change;
	}

}
