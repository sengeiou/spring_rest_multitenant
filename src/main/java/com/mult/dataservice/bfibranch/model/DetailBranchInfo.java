package com.mult.dataservice.bfibranch.model;

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
@Table(name = "detail_branch_info")
public class DetailBranchInfo {

	@Id
	@SequenceGenerator(name = "detail_branch_info_id_seq", sequenceName = "detail_branch_info_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "detail_branch_info_id_seq")
	private Long id;

	@JsonProperty("branch_info")
	@OneToOne(mappedBy = "detailBranchInfo", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private BranchInfo branchInfo;

	@JsonProperty("list_address")
	@OneToMany(mappedBy = "detailBranchInfo", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<BranchAddress> listAddress = new HashSet<>();

	@JsonProperty("list_email")
	@OneToMany(mappedBy = "detailBranchInfo", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<BranchEmail> listEmail = new HashSet<>();

	@JsonProperty("list_contact")
	@OneToMany(mappedBy = "detailBranchInfo", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<BranchContact> listContact = new HashSet<>();

	@JsonProperty("user")
	@OneToOne(mappedBy = "detailBranchInfo", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private User user;

	@Column(name = "updated")
	private boolean updated;

	@Override
	public String toString() {
		return "DetailBranchInfo [id=" + id + ", branchInfo=" + branchInfo + ", listAddress=" + listAddress
				+ ", listEmail=" + listEmail + ", listContact=" + listContact + ", user=" + user + ", updated="
				+ updated + "]";
	}

	public Long getId() {
		return id;
	}

	public BranchInfo getBranchInfo() {
		return branchInfo;
	}

	public Set<BranchAddress> getListAddress() {
		return listAddress;
	}

	public Set<BranchEmail> getListEmail() {
		return listEmail;
	}

	public Set<BranchContact> getListContact() {
		return listContact;
	}

	public User getUser() {
		return user;
	}

	public boolean isUpdated() {
		return updated;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setBranchInfo(BranchInfo branchInfo) {
		this.branchInfo = branchInfo;
	}

	public void setListAddress(Set<BranchAddress> listAddress) {
		this.listAddress = listAddress;
	}

	public void setListEmail(Set<BranchEmail> listEmail) {
		this.listEmail = listEmail;
	}

	public void setListContact(Set<BranchContact> listContact) {
		this.listContact = listContact;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setUpdated(boolean updated) {
		this.updated = updated;
	}

}
