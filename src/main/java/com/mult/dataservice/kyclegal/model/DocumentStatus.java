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
@Table(name = "kycl_document_status")
public class DocumentStatus {

	@Id
	@SequenceGenerator(name = "kycl_document_status_id_seq", sequenceName = "kycl_document_status_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kycl_document_status_id_seq")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="kycl_id")
	@JsonIgnore
	private Kycl kycl;

	@JsonProperty("document_type")
	@Column(name = "document_type")
	String documentType;

	@JsonProperty("document_status")
	@Column(name = "document_status")
	String documentStatus;

	@JsonProperty("application_submitted_date")
	@Column(name = "application_submitted_date")
	String applictionSubmittedDate;

	@JsonProperty("refresh_date")
	@Column(name = "refresh_date")
	String refreshDate;

	@JsonProperty("notes")
	String notes;

	@JsonProperty("change")
	boolean change;

	@Override
	public String toString() {
		return "DocumentStatus [id=" + id + ", documentType=" + documentType + ", documentStatus=" + documentStatus
				+ ", applictionSubmittedDate=" + applictionSubmittedDate + ", refreshDate=" + refreshDate + ", notes="
				+ notes + ", change=" + change + "]";
	}

	public Long getId() {
		return id;
	}

	public Kycl getKycl() {
		return kycl;
	}

	public String getDocumentType() {
		return documentType;
	}

	public String getDocumentStatus() {
		return documentStatus;
	}

	public String getApplictionSubmittedDate() {
		return applictionSubmittedDate;
	}

	public String getRefreshDate() {
		return refreshDate;
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

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public void setDocumentStatus(String documentStatus) {
		this.documentStatus = documentStatus;
	}

	public void setApplictionSubmittedDate(String applictionSubmittedDate) {
		this.applictionSubmittedDate = applictionSubmittedDate;
	}

	public void setRefreshDate(String refreshDate) {
		this.refreshDate = refreshDate;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setChange(boolean change) {
		this.change = change;
	}

}
