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
@Table(name = "kycn_identification_info")
@JsonIgnoreProperties(ignoreUnknown = true)
public class KycnIdentificationInfo {

	@Id
	@SequenceGenerator(name = "kycn_identification_info_id_seq", sequenceName = "kycn_identification_info_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kycn_identification_info_id_seq")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "kycn_base_id")
	@JsonIgnore
	private KycnBase kycnBase;

	@JsonProperty("primary_identification_document_type")
	@Column(name = "primary_identification_document_type")
	private String primaryIdentificationDocumentType;
	
	@JsonProperty("goaml_primary_identification_document_type")
	@Column(name = "goaml_primary_identification_document_type")
	private String gomalPrimaryIdentificationDocumentType;

	@JsonProperty("primary_identification_document_no")
	@Column(name = "primary_identification_document_no")
	private String primaryIdentificationDocumentNo;

	@JsonProperty("country_of_issue")
	@Column(name = "country_of_issue")
	private String countryOfIssue;

	@JsonProperty("expiry_date")
	@Column(name = "expiry_date")
	private Date expiryDate;

	@JsonProperty("visa_no")
	@Column(name = "visa_no")
	private String visaNo;

	@JsonProperty("visa_expiry_date")
	@Column(name = "visa_expiry_date")
	private Date visaExpiryDate;

	@JsonProperty("nepal_entry_date")
	@Column(name = "nepal_entry_date")
	private Date nepalEntryDate;

	@JsonProperty("notes")
	@Column(name = "notes")
	private String notes;

	@JsonProperty("identification_number")
	@Column(name = "identification_number")
	private String identificationNumber;

	@JsonProperty("issuing_authority")
	@Column(name = "issuing_authority")
	private String issuingAuthority;

	@JsonProperty("place_of_issue")
	@Column(name = "place_of_issue")
	private String placeOfIssue;

	@JsonProperty("issue_date")
	@Column(name = "issue_date")
	private java.sql.Date issueDate;

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
		return "KycnIdentificationInfo [id=" + id + ", primaryIdentificationDocumentType="
				+ primaryIdentificationDocumentType + ", primaryIdentificationDocumentNo="
				+ primaryIdentificationDocumentNo + ", countryOfIssue=" + countryOfIssue + ", expiryDate=" + expiryDate
				+ ", visaNo=" + visaNo + ", visaExpiryDate=" + visaExpiryDate + ", nepalEntryDate=" + nepalEntryDate
				+ ", notes=" + notes + ", identificationNumber=" + identificationNumber + ", issuingAuthority="
				+ issuingAuthority + ", placeOfIssue=" + placeOfIssue + ", issueDate=" + issueDate + ", change="
				+ change + ", maker=" + maker + ", checker=" + checker + ", approved=" + approved + ", updateDate="
				+ updateDate + ", approvedDate=" + approvedDate + ", reason=" + reason + "]";
	}

	public Long getId() {
		return id;
	}

	public KycnBase getKycnBase() {
		return kycnBase;
	}

	public String getPrimaryIdentificationDocumentType() {
		return primaryIdentificationDocumentType;
	}

	public String getPrimaryIdentificationDocumentNo() {
		return primaryIdentificationDocumentNo;
	}

	public String getCountryOfIssue() {
		return countryOfIssue;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public String getVisaNo() {
		return visaNo;
	}

	public Date getVisaExpiryDate() {
		return visaExpiryDate;
	}

	public Date getNepalEntryDate() {
		return nepalEntryDate;
	}

	public String getNotes() {
		return notes;
	}

	public String getIdentificationNumber() {
		return identificationNumber;
	}

	public String getIssuingAuthority() {
		return issuingAuthority;
	}

	public String getPlaceOfIssue() {
		return placeOfIssue;
	}

	public java.sql.Date getIssueDate() {
		return issueDate;
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

	public void setPrimaryIdentificationDocumentType(String primaryIdentificationDocumentType) {
		this.primaryIdentificationDocumentType = primaryIdentificationDocumentType;
	}

	public void setPrimaryIdentificationDocumentNo(String primaryIdentificationDocumentNo) {
		this.primaryIdentificationDocumentNo = primaryIdentificationDocumentNo;
	}

	public void setCountryOfIssue(String countryOfIssue) {
		this.countryOfIssue = countryOfIssue;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public void setVisaNo(String visaNo) {
		this.visaNo = visaNo;
	}

	public void setVisaExpiryDate(Date visaExpiryDate) {
		this.visaExpiryDate = visaExpiryDate;
	}

	public void setNepalEntryDate(Date nepalEntryDate) {
		this.nepalEntryDate = nepalEntryDate;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public void setIssuingAuthority(String issuingAuthority) {
		this.issuingAuthority = issuingAuthority;
	}

	public void setPlaceOfIssue(String placeOfIssue) {
		this.placeOfIssue = placeOfIssue;
	}

	public void setIssueDate(java.sql.Date issueDate) {
		this.issueDate = issueDate;
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

	public String getGomalPrimaryIdentificationDocumentType() {
		return gomalPrimaryIdentificationDocumentType;
	}

	public void setGomalPrimaryIdentificationDocumentType(String gomalPrimaryIdentificationDocumentType) {
		this.gomalPrimaryIdentificationDocumentType = gomalPrimaryIdentificationDocumentType;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	
	
}
