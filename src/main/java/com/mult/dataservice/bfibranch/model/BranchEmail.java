package com.mult.dataservice.bfibranch.model;

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
@Table(name = "branch_email")
@JsonIgnoreProperties(ignoreUnknown = true)
public class BranchEmail {

	@Id
	@SequenceGenerator(name = "branch_email_id_seq", sequenceName = "branch_email_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "branch_email_id_seq")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "branch_id")
	@JsonIgnore
	private DetailBranchInfo detailBranchInfo;

	@JsonProperty("email")
	private String email;

	@JsonProperty("email_type")
	@Column(name = "email_type")
	private String emailType;

	@JsonProperty("change")
	private boolean change;

	@Override
	public String toString() {
		return "BranchEmail [id=" + id + ", email=" + email + ", emailType=" + emailType + ", change=" + change + "]";
	}

	public Long getId() {
		return id;
	}

	public DetailBranchInfo getDetailBranchInfo() {
		return detailBranchInfo;
	}

	public String getEmail() {
		return email;
	}

	public String getEmailType() {
		return emailType;
	}

	public boolean isChange() {
		return change;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDetailBranchInfo(DetailBranchInfo detailBranchInfo) {
		this.detailBranchInfo = detailBranchInfo;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setEmailType(String emailType) {
		this.emailType = emailType;
	}

	public void setChange(boolean change) {
		this.change = change;
	}

}
