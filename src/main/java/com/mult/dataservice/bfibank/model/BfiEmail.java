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
@Table(name = "bfi_email")
public class BfiEmail {

	@Id
	@SequenceGenerator(name = "bfi_email_id_seq", sequenceName = "bfi_email_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bfi_email_id_seq")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "bfi_id")
	@JsonIgnore
	private Bfi bfi;

	@JsonProperty("email")
	private String email;

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
		return "BfiEmail [id=" + id + ", email=" + email + ", notes=" + notes + ", makerId=" + makerId + ", checkerId="
				+ checkerId + ", approved=" + approved + ", updateDate=" + updateDate + ", approvedDate=" + approvedDate
				+ ", reason=" + reason + "]";
	}

	public Long getId() {
		return id;
	}

	public Bfi getBfi() {
		return bfi;
	}

	public String getEmail() {
		return email;
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

	public void setEmail(String email) {
		this.email = email;
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
