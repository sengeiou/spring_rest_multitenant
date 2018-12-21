package com.mult.dataservice.kyclegal.model;

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
@Table(name = "kycl_audit_info")

public class AuditInfo {

	@Id
	@SequenceGenerator(name = "kycl_id_seq", sequenceName = "kycl_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kycl_id_seq")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "kycl_id")
	@JsonIgnore
	private Kycl kycl;

	@JsonProperty("audited_report")
	@Column(name = "audited_report")
	private String auditedReport;

	@JsonProperty("authorized_letter")
	@Column(name = "authorized_letter")
	private String authorizedLetter;

	@JsonProperty("authorized_letter_date")
	@Column(name = "authorized_letter_date")
	private String authorizedLetterDate;

	@JsonProperty("authorized_letter_agency")
	@Column(name = "authorized_letter_agency")
	private String authorizedLetterAgency;

	@JsonProperty("notes")
	private String notes;

	@JsonProperty("change")
	private boolean change;

	@Override
	public String toString() {
		return "AuditInfo [id=" + id + ", auditedReport=" + auditedReport + ", authorizedLetter=" + authorizedLetter
				+ ", authorizedLetterDate=" + authorizedLetterDate + ", authorizedLetterAgency="
				+ authorizedLetterAgency + ", notes=" + notes + ", change=" + change + "]";
	}

	public Long getId() {
		return id;
	}

	public Kycl getKycl() {
		return kycl;
	}

	public String getAuditedReport() {
		return auditedReport;
	}

	public String getAuthorizedLetter() {
		return authorizedLetter;
	}

	public String getAuthorizedLetterDate() {
		return authorizedLetterDate;
	}

	public String getAuthorizedLetterAgency() {
		return authorizedLetterAgency;
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

	public void setKycl(Kycl kycl) {
		this.kycl = kycl;
	}

	public void setAuditedReport(String auditedReport) {
		this.auditedReport = auditedReport;
	}

	public void setAuthorizedLetter(String authorizedLetter) {
		this.authorizedLetter = authorizedLetter;
	}

	public void setAuthorizedLetterDate(String authorizedLetterDate) {
		this.authorizedLetterDate = authorizedLetterDate;
	}

	public void setAuthorizedLetterAgency(String authorizedLetterAgency) {
		this.authorizedLetterAgency = authorizedLetterAgency;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setChange(boolean change) {
		this.change = change;
	}

}
