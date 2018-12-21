package com.mult.dataservice.kycnatural.model;

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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "kycn_base")
@JsonIgnoreProperties(ignoreUnknown = true)
public class KycnBase {
	@Id
	@SequenceGenerator(name = "kycn_base_id_seq", sequenceName = "kycn_base_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kycn_base_id_seq")
	private Long id;

	@OneToOne(mappedBy = "kycnBase", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JsonProperty("personal_info")
	private KycnPersonalInfo kycnPersonalInfo;

	@OneToMany(mappedBy = "kycnBase", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JsonProperty("accounts_info")
	private Set<KycnAccountsInfo> kycnAccountsInfo = new HashSet<>();

	@OneToMany(mappedBy = "kycnBase", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JsonProperty("address_info")
	private Set<KycnAddressInfo> kycnAddressInfo = new HashSet<>();

	@JsonProperty("education_info")
	@OneToMany(mappedBy = "kycnBase", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<KycnEducationInfo> kycnEducationInfo = new HashSet<>();

	@OneToMany(mappedBy = "kycnBase", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JsonProperty("financial_info")
	private Set<KycnFinancialInfo> kycnFinancialInfo = new HashSet<>();

	@OneToMany(mappedBy = "kycnBase", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JsonProperty("identification_info")
	private Set<KycnIdentificationInfo> kycnIdentificationInfo = new HashSet<>();

	@OneToMany(mappedBy = "kycnBase", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JsonProperty("involvement_info")
	private Set<KycnInvolvementInfo> kycnInvolvementInfo = new HashSet<>();

	@OneToMany(mappedBy = "kycnBase", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JsonProperty("internal_observation_info")
	private Set<KycnObservationInfo> kycnObservationInfo = new HashSet<>();

	@OneToMany(mappedBy = "kycnBase", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JsonProperty("related_entity_info")
	private Set<KycnRelatedEntityInfo> kycnRelatedEntityInfo = new HashSet<>();

	@OneToMany(mappedBy = "kycnBase", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JsonProperty("related_person_info")
	private Set<KycnRelatedPersonInfo> kycnRelatedPersonInfo = new HashSet<>();

	@OneToMany(mappedBy = "kycnBase", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JsonProperty("relation_info")
	private Set<KycnRelationInfo> kycnRelationInfo = new HashSet<>();

	@Column(name = "is_updated")
	@JsonProperty("is_updated")
	private boolean isUpdated;

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
		return "KycnBase [id=" + id + ", kycnPersonalInfo=" + kycnPersonalInfo + ", kycnAccountsInfo="
				+ kycnAccountsInfo + ", kycnAddressInfo=" + kycnAddressInfo + ", kycnEducationInfo=" + kycnEducationInfo
				+ ", kycnFinancialInfo=" + kycnFinancialInfo + ", kycnIdentificationInfo=" + kycnIdentificationInfo
				+ ", kycnInvolvementInfo=" + kycnInvolvementInfo + ", kycnObservationInfo=" + kycnObservationInfo
				+ ", kycnRelatedEntityInfo=" + kycnRelatedEntityInfo + ", kycnRelatedPersonInfo="
				+ kycnRelatedPersonInfo + ", kycnRelationInfo=" + kycnRelationInfo + ", isUpdated=" + isUpdated
				+ ", maker=" + maker + ", checker=" + checker + ", approved=" + approved + ", updateDate=" + updateDate
				+ ", approvedDate=" + approvedDate + ", reason=" + reason + ", searchText=" + searchText + "]";
	}

	public Long getId() {
		return id;
	}

	public KycnPersonalInfo getKycnPersonalInfo() {
		return kycnPersonalInfo;
	}

	public Set<KycnAccountsInfo> getKycnAccountsInfo() {
		return kycnAccountsInfo;
	}

	public Set<KycnAddressInfo> getKycnAddressInfo() {
		return kycnAddressInfo;
	}

	public Set<KycnEducationInfo> getKycnEducationInfo() {
		return kycnEducationInfo;
	}

	public Set<KycnFinancialInfo> getKycnFinancialInfo() {
		return kycnFinancialInfo;
	}

	public Set<KycnIdentificationInfo> getKycnIdentificationInfo() {
		return kycnIdentificationInfo;
	}

	public Set<KycnInvolvementInfo> getKycnInvolvementInfo() {
		return kycnInvolvementInfo;
	}

	public Set<KycnObservationInfo> getKycnObservationInfo() {
		return kycnObservationInfo;
	}

	public Set<KycnRelatedEntityInfo> getKycnRelatedEntityInfo() {
		return kycnRelatedEntityInfo;
	}

	public Set<KycnRelatedPersonInfo> getKycnRelatedPersonInfo() {
		return kycnRelatedPersonInfo;
	}

	public Set<KycnRelationInfo> getKycnRelationInfo() {
		return kycnRelationInfo;
	}

	public boolean isUpdated() {
		return isUpdated;
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

	public void setKycnPersonalInfo(KycnPersonalInfo kycnPersonalInfo) {
		this.kycnPersonalInfo = kycnPersonalInfo;
	}

	public void setKycnAccountsInfo(Set<KycnAccountsInfo> kycnAccountsInfo) {
		this.kycnAccountsInfo = kycnAccountsInfo;
	}

	public void setKycnAddressInfo(Set<KycnAddressInfo> kycnAddressInfo) {
		this.kycnAddressInfo = kycnAddressInfo;
	}

	public void setKycnEducationInfo(Set<KycnEducationInfo> kycnEducationInfo) {
		this.kycnEducationInfo = kycnEducationInfo;
	}

	public void setKycnFinancialInfo(Set<KycnFinancialInfo> kycnFinancialInfo) {
		this.kycnFinancialInfo = kycnFinancialInfo;
	}

	public void setKycnIdentificationInfo(Set<KycnIdentificationInfo> kycnIdentificationInfo) {
		this.kycnIdentificationInfo = kycnIdentificationInfo;
	}

	public void setKycnInvolvementInfo(Set<KycnInvolvementInfo> kycnInvolvementInfo) {
		this.kycnInvolvementInfo = kycnInvolvementInfo;
	}

	public void setKycnObservationInfo(Set<KycnObservationInfo> kycnObservationInfo) {
		this.kycnObservationInfo = kycnObservationInfo;
	}

	public void setKycnRelatedEntityInfo(Set<KycnRelatedEntityInfo> kycnRelatedEntityInfo) {
		this.kycnRelatedEntityInfo = kycnRelatedEntityInfo;
	}

	public void setKycnRelatedPersonInfo(Set<KycnRelatedPersonInfo> kycnRelatedPersonInfo) {
		this.kycnRelatedPersonInfo = kycnRelatedPersonInfo;
	}

	public void setKycnRelationInfo(Set<KycnRelationInfo> kycnRelationInfo) {
		this.kycnRelationInfo = kycnRelationInfo;
	}

	public void setUpdated(boolean isUpdated) {
		this.isUpdated = isUpdated;
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
