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
@Table(name = "branch_contact")
@JsonIgnoreProperties
public class BranchContact {

	@Id
	@SequenceGenerator(name = "branch_contact_id_seq", sequenceName = "branch_contact_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "branch_contact_id_seq")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "branch_id")
	@JsonIgnore
	private DetailBranchInfo detailBranchInfo;

	@JsonProperty("type")
	private String type;

	@JsonProperty("contact_number")
	@Column(name = "contact_number")
	private String number;

	@JsonProperty("contact_country_prefix")
	@Column(name = "contact_country_prefix")
	private String prefix;

	@JsonProperty("contact_extension")
	@Column(name = "contact_extension")
	private String extension;

	@JsonProperty("contact_communication_type")
	@Column(name = "contact_communication_type")
	private String communicationType;

	@JsonProperty("email")
	private String email;

	@JsonProperty("notes")
	private String notes;

	@JsonProperty("change")
	private boolean change;

	@Override
	public String toString() {
		return "BranchContact [id=" + id + ", type=" + type + ", number=" + number + ", prefix=" + prefix
				+ ", extension=" + extension + ", communicationType=" + communicationType + ", email=" + email
				+ ", notes=" + notes + ", change=" + change + "]";
	}

	public Long getId() {
		return id;
	}

	public DetailBranchInfo getDetailBranchInfo() {
		return detailBranchInfo;
	}

	public String getType() {
		return type;
	}

	public String getNumber() {
		return number;
	}

	public String getPrefix() {
		return prefix;
	}

	public String getExtension() {
		return extension;
	}

	public String getCommunicationType() {
		return communicationType;
	}

	public String getEmail() {
		return email;
	}

	public String getNotes() {
		return notes;
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

	public void setType(String type) {
		this.type = type;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public void setCommunicationType(String communicationType) {
		this.communicationType = communicationType;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setChange(boolean change) {
		this.change = change;
	}

}
