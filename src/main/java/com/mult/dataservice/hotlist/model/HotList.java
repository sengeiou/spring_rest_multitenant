package com.mult.dataservice.hotlist.model;

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
import com.mult.dataservice.identity.model.User;
import com.mult.dataservice.investigation.model.InvestigationMediaInfo;

@Entity
@Table(name = "hot_list")

public class HotList {

	@Id
	@SequenceGenerator(name = "hot_list_id_seq", sequenceName = "hot_list_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hot_list_id_seq")
	private Long id;

	@JsonProperty("personal_info")
	@OneToOne(mappedBy = "hotList", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private PersonalInfo personalInfo;

	@JsonProperty("media_info")
	@OneToMany(mappedBy = "hotList", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Attachment> attachment = new HashSet<>();

	@JsonProperty("address_info")
	@OneToMany(mappedBy = "hotList", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<AddressInfo> hotListAddressInfo = new HashSet<>();

	@JsonProperty("office_info")
	@OneToMany(mappedBy = "hotList", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<OfficeInfo> hotListOfficeInfo = new HashSet<>();

	@JsonProperty("family_info")
	@OneToMany(mappedBy = "hotList", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<FamilyInfo> hotListFamilyInfos = new HashSet<>();

	@JsonProperty("investigation_media_info")
	@OneToMany(mappedBy = "hotList", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<InvestigationMediaInfo> investigationMediaInfo = new HashSet<>();

	@JsonProperty("user")
	@OneToOne(mappedBy = "hotList", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
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
		return "HotList [id=" + id + ", personalInfo=" + personalInfo + ", attachment=" + attachment
				+ ", hotListAddressInfo=" + hotListAddressInfo + ", hotListOfficeInfo=" + hotListOfficeInfo
				+ ", hotListFamilyInfos=" + hotListFamilyInfos + ", investigationMediaInfo=" + investigationMediaInfo
				+ ", user=" + user + ", updated=" + updated + ", approvedBy=" + approvedBy + ", approvedDate="
				+ approvedDate + "]";
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

	public Set<AddressInfo> getHotListAddressInfo() {
		return hotListAddressInfo;
	}

	public Set<OfficeInfo> getHotListOfficeInfo() {
		return hotListOfficeInfo;
	}

	public Set<FamilyInfo> getHotListFamilyInfos() {
		return hotListFamilyInfos;
	}

	public Set<InvestigationMediaInfo> getInvestigationMediaInfo() {
		return investigationMediaInfo;
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

	public void setHotListAddressInfo(Set<AddressInfo> hotListAddressInfo) {
		this.hotListAddressInfo = hotListAddressInfo;
	}

	public void setHotListOfficeInfo(Set<OfficeInfo> hotListOfficeInfo) {
		this.hotListOfficeInfo = hotListOfficeInfo;
	}

	public void setHotListFamilyInfos(Set<FamilyInfo> hotListFamilyInfos) {
		this.hotListFamilyInfos = hotListFamilyInfos;
	}

	public void setInvestigationMediaInfo(Set<InvestigationMediaInfo> investigationMediaInfo) {
		this.investigationMediaInfo = investigationMediaInfo;
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
