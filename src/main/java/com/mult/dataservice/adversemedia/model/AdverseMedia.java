package com.mult.dataservice.adversemedia.model;

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
@Table(name = "adverse_media")
public class AdverseMedia {

	@Id
	@SequenceGenerator(name = "adverse_media_id_seq", sequenceName = "adverse_media_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "adverse_media_id_seq")
	private Long id;

	@JsonProperty("personal_info")
	@OneToOne(mappedBy = "adverseMedia", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private PersonalInfo personalInfo;

	@JsonProperty("media_info")
	@OneToMany(mappedBy = "adverseMedia", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<Attachment> attachment = new HashSet<>();

	@JsonProperty("address_info")
	@OneToMany(mappedBy = "adverseMedia", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<AddressInfo> adverseAddressInfo = new HashSet<>();

	@JsonProperty("office_info")
	@OneToMany(mappedBy = "adverseMedia", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<OfficeInfo> adverseOfficeInfo = new HashSet<>();

	@JsonProperty("family_info")
	@OneToMany(mappedBy = "adverseMedia", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<FamilyInfo> adverseFamilyInfo = new HashSet<>();

	@JsonProperty("user")
	@OneToOne(mappedBy = "adverseMedia", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private User user;

	private boolean updated;

	@JsonProperty("approved_by")
	@Column(name = "approved_by")
	private String approvedBy;

	@JsonProperty("approved_date")
	@Column(name = "approved_date")
	private String approvedDate;

	@Override
	public String toString() {
		return "AdverseMedia [id=" + id + ", personalInfo=" + personalInfo + ", attachment=" + attachment
				+ ", adverseAddressInfo=" + adverseAddressInfo + ", adverseOfficeInfo=" + adverseOfficeInfo
				+ ", adverseFamilyInfo=" + adverseFamilyInfo + ", user=" + user + ", updated=" + updated
				+ ", approvedBy=" + approvedBy + ", approvedDate=" + approvedDate + "]";
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

	public Set<AddressInfo> getAdverseAddressInfo() {
		return adverseAddressInfo;
	}

	public Set<OfficeInfo> getAdverseOfficeInfo() {
		return adverseOfficeInfo;
	}

	public Set<FamilyInfo> getAdverseFamilyInfo() {
		return adverseFamilyInfo;
	}

	public User getUser() {
		return user;
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

	public void setAdverseAddressInfo(Set<AddressInfo> adverseAddressInfo) {
		this.adverseAddressInfo = adverseAddressInfo;
	}

	public void setAdverseOfficeInfo(Set<OfficeInfo> adverseOfficeInfo) {
		this.adverseOfficeInfo = adverseOfficeInfo;
	}

	public void setAdverseFamilyInfo(Set<FamilyInfo> adverseFamilyInfo) {
		this.adverseFamilyInfo = adverseFamilyInfo;
	}

	public void setUser(User user) {
		this.user = user;
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
