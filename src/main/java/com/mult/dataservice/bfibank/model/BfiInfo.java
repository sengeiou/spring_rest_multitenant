package com.mult.dataservice.bfibank.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "bfi_info")
public class BfiInfo {

	@Id
	@SequenceGenerator(name = "bfi_info_id_seq", sequenceName = "bfi_info_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bfi_info_id_seq")
	private Long id;

	@OneToOne
	@JoinColumn(name = "bfi_id")
	@JsonIgnore
	private Bfi bfi;

	@JsonProperty("bfi_name")
	@Column(name = "bfi_name")
	private String bfiName;

	@JsonProperty("fiu_reference_number")
	@Column(name = "fiu_reference_number")
	private String fiuReferenceNo;

	@Column(name = "bank_code")
	@JsonProperty("bank_code")
	private String bankCode;

	@Column(name = "local_currency")
	@JsonProperty("local_currency")
	private String localCurrency;

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
		return "BfiInfo [id=" + id + ", bfiName=" + bfiName + ", fiuReferenceNo=" + fiuReferenceNo + ", bankCode="
				+ bankCode + ", localCurrency=" + localCurrency + ", notes=" + notes + ", makerId=" + makerId
				+ ", checkerId=" + checkerId + ", approved=" + approved + ", updateDate=" + updateDate
				+ ", approvedDate=" + approvedDate + ", reason=" + reason + "]";
	}

	public Long getId() {
		return id;
	}

	public Bfi getBfi() {
		return bfi;
	}

	public String getBfiName() {
		return bfiName;
	}

	public String getFiuReferenceNo() {
		return fiuReferenceNo;
	}

	public String getBankCode() {
		return bankCode;
	}

	public String getLocalCurrency() {
		return localCurrency;
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

	public void setBfiName(String bfiName) {
		this.bfiName = bfiName;
	}

	public void setFiuReferenceNo(String fiuReferenceNo) {
		this.fiuReferenceNo = fiuReferenceNo;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public void setLocalCurrency(String localCurrency) {
		this.localCurrency = localCurrency;
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