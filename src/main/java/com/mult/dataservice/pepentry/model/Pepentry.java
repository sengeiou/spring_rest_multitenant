package com.mult.dataservice.pepentry.model;

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
import com.mult.dataservice.adversemedia.model.AddressInfo;
import com.mult.dataservice.adversemedia.model.Attachment;
import com.mult.dataservice.adversemedia.model.FamilyInfo;
import com.mult.dataservice.adversemedia.model.OfficeInfo;
import com.mult.dataservice.adversemedia.model.PersonalInfo;

@Entity
@Table(name = "pepentry")
public class Pepentry {

	@Id
	@SequenceGenerator(name = "pepentry_id_seq", sequenceName = "pepentry_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pepentry_id_seq")
	private Long id;

	@JsonProperty("personal_info")
	@OneToOne(mappedBy = "pepentry", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private PersonalInfo personalInfo;

	@JsonProperty("media_info")
	@OneToMany(mappedBy = "pepentry", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Attachment> attachment = new HashSet<>();

	@JsonProperty("address_info")
	@OneToMany(mappedBy = "pepentry", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<AddressInfo> pepentryAddressInfo = new HashSet<>();

	@JsonProperty("office_info")
	@OneToMany(mappedBy = "pepentry", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<OfficeInfo> pepentryOfficeInfo = new HashSet<>();

	@JsonProperty("family_info")
	@OneToMany(mappedBy = "pepentry", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<FamilyInfo> pepentryFamilyInfos = new HashSet<>();

	private boolean updated;

	@JsonProperty("approved_by")
	@Column(name = "approved_by")
	private String approvedBy;

	@JsonProperty("approved_date")
	@Column(name = "approved_date")
	private String approvedDate;

	@Override
	public String toString() {
		return "Pepentry [id=" + id + ", personalInfo=" + personalInfo + ", attachment=" + attachment
				+ ", pepentryAddressInfo=" + pepentryAddressInfo + ", pepentryOfficeInfo=" + pepentryOfficeInfo
				+ ", pepentryFamilyInfos=" + pepentryFamilyInfos + ", updated=" + updated + ", approvedBy=" + approvedBy
				+ ", approvedDate=" + approvedDate + "]";
	}

	public Long getId() {
		return id;
	}

	public PersonalInfo getPersonalInfo() {
		return personalInfo;
	}

	public Set<Attachment> getAttachment() {
		return attachment;
	}

	public Set<AddressInfo> getPepentryAddressInfo() {
		return pepentryAddressInfo;
	}

	public Set<OfficeInfo> getPepentryOfficeInfo() {
		return pepentryOfficeInfo;
	}

	public Set<FamilyInfo> getPepentryFamilyInfos() {
		return pepentryFamilyInfos;
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

	public void setAttachment(Set<Attachment> attachment) {
		this.attachment = attachment;
	}

	public void setPepentryAddressInfo(Set<AddressInfo> pepentryAddressInfo) {
		this.pepentryAddressInfo = pepentryAddressInfo;
	}

	public void setPepentryOfficeInfo(Set<OfficeInfo> pepentryOfficeInfo) {
		this.pepentryOfficeInfo = pepentryOfficeInfo;
	}

	public void setPepentryFamilyInfos(Set<FamilyInfo> pepentryFamilyInfos) {
		this.pepentryFamilyInfos = pepentryFamilyInfos;
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
