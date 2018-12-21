package com.mult.dataservice.investigation.model;

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
import com.mult.dataservice.adversemedia.model.AddressInfo;
import com.mult.dataservice.adversemedia.model.FamilyInfo;
import com.mult.dataservice.adversemedia.model.OfficeInfo;
import com.mult.dataservice.adversemedia.model.PersonalInfo;

@Entity
@Table(name = "investigation")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Investigation {

	@Id
	@SequenceGenerator(name = "investigation_media_info_id_seq", sequenceName = "investigation_media_info_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "investigation_media_info_id_seq")
	private Long id;

	@JsonProperty("personal_info")
	@OneToOne(mappedBy = "investigation", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private PersonalInfo personalInfo;

	@JsonProperty("office_info")
	@OneToMany(mappedBy = "investigation", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<OfficeInfo> officeInfo = new HashSet<>();

	@JsonProperty("family_info")
	@OneToMany(mappedBy = "investigation", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<FamilyInfo> familyInfo = new HashSet<>();

	@JsonProperty("address_info")
	@OneToMany(mappedBy = "investigation", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<AddressInfo> addressInfo = new HashSet<>();

	@JsonProperty("investigation_media_info")
	@OneToMany(mappedBy = "investigation", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<InvestigationMediaInfo> investigationMediaInfo = new HashSet<>();

	private boolean updated;

	@JsonProperty("approved_by")
	@Column(name = "approved_by")
	private String approvedBy;

	@JsonProperty("approved_date")
	@Column(name = "approved_date")
	private String approvedDate;

	@Override
	public String toString() {
		return "Investigation [id=" + id + ", personalInfo=" + personalInfo + ", officeInfo=" + officeInfo
				+ ", familyInfo=" + familyInfo + ", addressInfo=" + addressInfo + ", investigationMediaInfo="
				+ investigationMediaInfo + ", updated=" + updated + ", approvedBy=" + approvedBy + ", approvedDate="
				+ approvedDate + "]";
	}

	public Long getId() {
		return id;
	}

	public PersonalInfo getPersonalInfo() {
		return personalInfo;
	}

	public Set<OfficeInfo> getOfficeInfo() {
		return officeInfo;
	}

	public Set<FamilyInfo> getFamilyInfo() {
		return familyInfo;
	}

	public Set<AddressInfo> getAddressInfo() {
		return addressInfo;
	}

	public Set<InvestigationMediaInfo> getInvestigationMediaInfo() {
		return investigationMediaInfo;
	}

	public boolean isUpdated() {
		return updated;
	}

	public String getApprovedBy() {
		return approvedBy;
	}

	public String getApprovedDate() {
		return approvedDate;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPersonalInfo(PersonalInfo personalInfo) {
		this.personalInfo = personalInfo;
	}

	public void setOfficeInfo(Set<OfficeInfo> officeInfo) {
		this.officeInfo = officeInfo;
	}

	public void setFamilyInfo(Set<FamilyInfo> familyInfo) {
		this.familyInfo = familyInfo;
	}

	public void setAddressInfo(Set<AddressInfo> addressInfo) {
		this.addressInfo = addressInfo;
	}

	public void setInvestigationMediaInfo(Set<InvestigationMediaInfo> investigationMediaInfo) {
		this.investigationMediaInfo = investigationMediaInfo;
	}

	public void setUpdated(boolean updated) {
		this.updated = updated;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	public void setApprovedDate(String approvedDate) {
		this.approvedDate = approvedDate;
	}

}
