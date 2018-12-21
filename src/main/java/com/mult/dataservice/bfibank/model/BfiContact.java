package com.mult.dataservice.bfibank.model;

import java.sql.Date;

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
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "bfi_contact")
public class BfiContact {

	@Id
	@SequenceGenerator(name = "bfi_contact_id_seq", sequenceName = "bfi_contact_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bfi_contact_id_seq")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "bfi_id")
	@JsonIgnore
	private Bfi bfi;

	@JsonProperty("contact_number")
	@Column(name = "contact_number")
	private String contactNumber;

	@JsonProperty("contact_country_prefix")
	@Column(name = "contact_country_prefix")
	private String contactCountryPrefix;

	@JsonProperty("contact_extension")
	@Column(name = "contact_extension")
	private String contactExtension;

	@JsonProperty("contact_communication_type")
	@Column(name = "contact_communication_type")
	private String contactCommunicationType;

	@JsonProperty("notes")
	private String notes;

	@Column(name = "maker_id")
	@JsonProperty("maker_id")
	private int makerId;

	@Column(name = "checker_id")
	@JsonProperty("checker_id")
	private int checkerId;

	private boolean approved;
	private Date updateDate;
	private Date approvedDate;
	private String reason;

	@Override
	public String toString() {
		return "BfiContact [id=" + id + ", contactNumber=" + contactNumber + ", contactCountryPrefix="
				+ contactCountryPrefix + ", contactExtension=" + contactExtension + ", contactCommunicationType="
				+ contactCommunicationType + ", notes=" + notes + ", makerId=" + makerId + ", checkerId=" + checkerId
				+ ", approved=" + approved + ", updateDate=" + updateDate + ", approvedDate=" + approvedDate
				+ ", reason=" + reason + "]";
	}

	public Long getId() {
		return id;
	}

	public Bfi getBfi() {
		return bfi;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public String getContactCountryPrefix() {
		return contactCountryPrefix;
	}

	public String getContactExtension() {
		return contactExtension;
	}

	public String getContactCommunicationType() {
		return contactCommunicationType;
	}

	public String getNotes() {
		return notes;
	}

	public int getMakerId() {
		return makerId;
	}

	public int getCheckerId() {
		return checkerId;
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

	public void setBfi(Bfi bfi) {
		this.bfi = bfi;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public void setContactCountryPrefix(String contactCountryPrefix) {
		this.contactCountryPrefix = contactCountryPrefix;
	}

	public void setContactExtension(String contactExtension) {
		this.contactExtension = contactExtension;
	}

	public void setContactCommunicationType(String contactCommunicationType) {
		this.contactCommunicationType = contactCommunicationType;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setMakerId(int makerId) {
		this.makerId = makerId;
	}

	public void setCheckerId(int checkerId) {
		this.checkerId = checkerId;
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
