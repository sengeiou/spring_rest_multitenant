package com.mult.dataservice.kycnatural.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "kycn_relation_info")
@JsonIgnoreProperties(ignoreUnknown = true)
public class KycnRelationInfo {

	@Id
	@SequenceGenerator(name = "kycn_relation_info_id_seq", sequenceName = "kycn_relation_info_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kycn_relation_info_id_seq")
	private Long id;

	@OneToOne
	@JoinColumn(name = "kycn_base_id")
	@JsonIgnore
	private KycnBase kycnBase;

	@Column(name = "relatin_type")
	@JsonProperty("relation_type")
	private String relationType;

	@Column(name = "salutation")
	@JsonProperty("salutation")
	private String salutation;

	@Column(name = "cust_id")
	@JsonProperty("cust_id")
	private String custId;

	@Column(name = "kycn_id")
	@JsonProperty("kycn_id")
	private String kycnId;

	@Column(name = "first_name")
	@JsonProperty("first_name")
	private String firstName;

	@Column(name = "middle_name")
	@JsonProperty("middle_name")
	private String middleName;

	@Column(name = "last_name")
	@JsonProperty("last_name")
	private String lastName;

	@Column(name = "lsf_name")
	@JsonProperty("lsf_name")
	private String lsfName;

	@Column(name = "lsm_name")
	@JsonProperty("lsm_name")
	private String lsmName;

	@Column(name = "lsl_name")
	@JsonProperty("lsl_name")
	private String lslName;

	@Column(name = "second_name")
	@JsonProperty("second_name")
	private String secondName;

	@Column(name = "called_by_name")
	@JsonProperty("called_by_name")
	private String calledByName;

	@Column(name = "primary_identification_document_type")
	@JsonProperty("primary_identification_document_type")
	private String primaryIdentificationDocumentType;

	@Column(name = "primary_identification_document_no")
	@JsonProperty("primary_identification_document_no")
	private String primaryIdentificationDocumentNo;

	@Column(name = "expiry_date")
	@JsonProperty("expiry_date")
	private Date expiryDate;

	@Column(name = "notes")
	@JsonProperty("notes")
	private String notes;

	@Column(name = "issuing_authority")
	@JsonProperty("issuing_authority")
	private String issuingAuthority;

	@Column(name = "place_of_issue")
	@JsonProperty("place_of_issue")
	private String placeOfIssue;

	@Column(name = "issue_date")
	@JsonProperty("issue_date")
	private java.sql.Date issueDate;

	@Column(name = "relation_country")
	@JsonProperty("relation_country")
	private String relationCountry;

	@Column(name = "change")
	@JsonProperty("change")
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
		return "KycnRelationInfo [id=" + id + ", relationType=" + relationType + ", salutation=" + salutation
				+ ", custId=" + custId + ", kycnId=" + kycnId + ", firstName=" + firstName + ", middleName="
				+ middleName + ", lastName=" + lastName + ", lsfName=" + lsfName + ", lsmName=" + lsmName + ", lslName="
				+ lslName + ", secondName=" + secondName + ", calledByName=" + calledByName
				+ ", primaryIdentificationDocumentType=" + primaryIdentificationDocumentType
				+ ", primaryIdentificationDocumentNo=" + primaryIdentificationDocumentNo + ", expiryDate=" + expiryDate
				+ ", notes=" + notes + ", issuingAuthority=" + issuingAuthority + ", placeOfIssue=" + placeOfIssue
				+ ", issueDate=" + issueDate + ", relationCountry=" + relationCountry + ", change=" + change
				+ ", maker=" + maker + ", checker=" + checker + ", approved=" + approved + ", updateDate=" + updateDate
				+ ", approvedDate=" + approvedDate + ", reason=" + reason + "]";
	}

	public Long getId() {
		return id;
	}

	public KycnBase getKycnBase() {
		return kycnBase;
	}

	public String getRelationType() {
		return relationType;
	}

	public String getSalutation() {
		return salutation;
	}

	public String getCustId() {
		return custId;
	}

	public String getKycnId() {
		return kycnId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getLsfName() {
		return lsfName;
	}

	public String getLsmName() {
		return lsmName;
	}

	public String getLslName() {
		return lslName;
	}

	public String getSecondName() {
		return secondName;
	}

	public String getCalledByName() {
		return calledByName;
	}

	public String getPrimaryIdentificationDocumentType() {
		return primaryIdentificationDocumentType;
	}

	public String getPrimaryIdentificationDocumentNo() {
		return primaryIdentificationDocumentNo;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public String getNotes() {
		return notes;
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

	public String getRelationCountry() {
		return relationCountry;
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

	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public void setKycnId(String kycnId) {
		this.kycnId = kycnId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setLsfName(String lsfName) {
		this.lsfName = lsfName;
	}

	public void setLsmName(String lsmName) {
		this.lsmName = lsmName;
	}

	public void setLslName(String lslName) {
		this.lslName = lslName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public void setCalledByName(String calledByName) {
		this.calledByName = calledByName;
	}

	public void setPrimaryIdentificationDocumentType(String primaryIdentificationDocumentType) {
		this.primaryIdentificationDocumentType = primaryIdentificationDocumentType;
	}

	public void setPrimaryIdentificationDocumentNo(String primaryIdentificationDocumentNo) {
		this.primaryIdentificationDocumentNo = primaryIdentificationDocumentNo;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public void setNotes(String notes) {
		this.notes = notes;
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

	public void setRelationCountry(String relationCountry) {
		this.relationCountry = relationCountry;
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
	
	

}
