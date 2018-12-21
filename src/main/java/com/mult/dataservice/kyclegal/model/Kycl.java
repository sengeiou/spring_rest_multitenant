package com.mult.dataservice.kyclegal.model;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mult.dataservice.identity.model.User;

@Entity
@Table(name = "kycl")
public class Kycl {

	@Id
	@SequenceGenerator(name = "kycl_id_seq", sequenceName = "kycl_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kycl_id_seq")
	private Long id;

	@JsonProperty("kycl_info")
	@OneToOne(mappedBy = "kycl", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private KycLegal legal;

	@JsonProperty("accounts_info")
	@OneToMany(mappedBy = "kycl", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<AccountInfo> listAccountInfo = new HashSet<>();

	@JsonProperty("address_info")
	@OneToMany(mappedBy = "kycl", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<Address> listAddress = new HashSet<>();

	@JsonProperty("audit_info")
	@OneToMany(mappedBy = "kycl", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<AuditInfo> listAuditInfo = new HashSet<>();

	@JsonProperty("business_info")
	@OneToMany(mappedBy = "kycl", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<BusinessInfo> listBusinessInfo = new HashSet<>();

	@JsonProperty("compliance_info")
	@OneToOne(mappedBy = "kycl", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private ComplianceInfo complianceInfo;

	@JsonProperty("document_status_info")
	@OneToMany(mappedBy = "kycl", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<DocumentStatus> listDocumentStatus = new HashSet<>();

	@JsonProperty("landlord_info")
	@OneToMany(mappedBy = "kycl", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<LandlordInfo> listLandlordAddress = new HashSet<>();

	@JsonProperty("registration_address_info")
	@OneToMany(mappedBy = "kycl", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<RegistrationAddress> listRegistrationAddress = new HashSet<>();

	@JsonProperty("registration_info")
	@OneToMany(mappedBy = "kycl", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<RegistrationInfo> listRegistrationInfo = new HashSet<>();

	@JsonProperty("related_entity_info")
	@OneToMany(mappedBy = "kycl", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<RelatedEntity> listRelatedEntityInfo = new HashSet<>();

	@JsonProperty("related_person_info")
	@OneToMany(mappedBy = "kycl", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<RelatedPerson> listRelatedPerson = new HashSet<>();

	@JsonProperty("user")
	@OneToOne(mappedBy = "kycl", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private User user;

	@JsonProperty("financial_info")
	@OneToOne(mappedBy = "kycl", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private FinancialInfo financialInfo;

	private boolean updated;

	@Column(name = "maker")
	private String maker;

	@Column(name = "checker")
	private String checker;

	@Column(name = "approved")
	private boolean approved;

	@Column(name = "update_Date")
	@JsonProperty("update_Date")
	private Date updateDate;

	@Column(name = "approved_Date")
	@JsonProperty("approved_Date")
	private Date approvedDate;

	@Column(name = "reason")
	private String reason;

	@JsonProperty("search_text")
	@Column(name = "search_text")
	private String searchText;

	@Override
	public String toString() {
		return "Kycl [id=" + id + ", legal=" + legal + ", listAccountInfo=" + listAccountInfo + ", listAddress="
				+ listAddress + ", listAuditInfo=" + listAuditInfo + ", listBusinessInfo=" + listBusinessInfo
				+ ", complianceInfo=" + complianceInfo + ", listDocumentStatus=" + listDocumentStatus
				+ ", listLandlordAddress=" + listLandlordAddress + ", listRegistrationAddress="
				+ listRegistrationAddress + ", listRegistrationInfo=" + listRegistrationInfo
				+ ", listRelatedEntityInfo=" + listRelatedEntityInfo + ", listRelatedPerson=" + listRelatedPerson
				+ ", user=" + user + ", financialInfo=" + financialInfo + ", updated=" + updated + ", searchText="
				+ searchText + "]";
	}

	public Long getId() {
		return id;
	}

	public KycLegal getLegal() {
		return legal;
	}

	public Set<AccountInfo> getListAccountInfo() {
		return listAccountInfo;
	}

	public Set<Address> getListAddress() {
		return listAddress;
	}

	public Set<AuditInfo> getListAuditInfo() {
		return listAuditInfo;
	}

	public Set<BusinessInfo> getListBusinessInfo() {
		return listBusinessInfo;
	}

	public ComplianceInfo getComplianceInfo() {
		return complianceInfo;
	}

	public Set<DocumentStatus> getListDocumentStatus() {
		return listDocumentStatus;
	}

	public Set<LandlordInfo> getListLandlordAddress() {
		return listLandlordAddress;
	}

	public Set<RegistrationAddress> getListRegistrationAddress() {
		return listRegistrationAddress;
	}

	public Set<RegistrationInfo> getListRegistrationInfo() {
		return listRegistrationInfo;
	}

	public Set<RelatedEntity> getListRelatedEntityInfo() {
		return listRelatedEntityInfo;
	}

	public Set<RelatedPerson> getListRelatedPerson() {
		return listRelatedPerson;
	}

	public User getUser() {
		return user;
	}

	public FinancialInfo getFinancialInfo() {
		return financialInfo;
	}

	public boolean isUpdated() {
		return updated;
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

	public String getSearchText() {
		return searchText;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setLegal(KycLegal legal) {
		this.legal = legal;
	}

	public void setListAccountInfo(Set<AccountInfo> listAccountInfo) {
		this.listAccountInfo = listAccountInfo;
	}

	public void setListAddress(Set<Address> listAddress) {
		this.listAddress = listAddress;
	}

	public void setListAuditInfo(Set<AuditInfo> listAuditInfo) {
		this.listAuditInfo = listAuditInfo;
	}

	public void setListBusinessInfo(Set<BusinessInfo> listBusinessInfo) {
		this.listBusinessInfo = listBusinessInfo;
	}

	public void setComplianceInfo(ComplianceInfo complianceInfo) {
		this.complianceInfo = complianceInfo;
	}

	public void setListDocumentStatus(Set<DocumentStatus> listDocumentStatus) {
		this.listDocumentStatus = listDocumentStatus;
	}

	public void setListLandlordAddress(Set<LandlordInfo> listLandlordAddress) {
		this.listLandlordAddress = listLandlordAddress;
	}

	public void setListRegistrationAddress(Set<RegistrationAddress> listRegistrationAddress) {
		this.listRegistrationAddress = listRegistrationAddress;
	}

	public void setListRegistrationInfo(Set<RegistrationInfo> listRegistrationInfo) {
		this.listRegistrationInfo = listRegistrationInfo;
	}

	public void setListRelatedEntityInfo(Set<RelatedEntity> listRelatedEntityInfo) {
		this.listRelatedEntityInfo = listRelatedEntityInfo;
	}

	public void setListRelatedPerson(Set<RelatedPerson> listRelatedPerson) {
		this.listRelatedPerson = listRelatedPerson;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setFinancialInfo(FinancialInfo financialInfo) {
		this.financialInfo = financialInfo;
	}

	public void setUpdated(boolean updated) {
		this.updated = updated;
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

	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}

}
