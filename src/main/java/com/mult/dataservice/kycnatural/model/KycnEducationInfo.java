package com.mult.dataservice.kycnatural.model;

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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "kycn_education_info")
@JsonIgnoreProperties(ignoreUnknown = true)
public class KycnEducationInfo {
	@Id
	@SequenceGenerator(name = "kycn_education_info_id_seq", sequenceName = "kycn_education_info_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kycn_education_info_id_seq")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "kycn_base_id")
	@JsonIgnore
	private KycnBase kycnBase;

	@JsonProperty("qualification")
	@Column(name = "qualification")
	private String qualification;

	@Column(name = "name_of_institute")
	@JsonProperty("name_of_institute")
	private String nameOfInstitute;

	@JsonProperty("field_of_study")
	@Column(name = "field_of_study")
	private String fieldOfStudy;

	@JsonProperty("year_of_graduation")
	@Column(name = "year_of_graduation")
	private String yearOfGraduation;

	@JsonProperty("notes")
	@Column(name = "notes")
	private String notes;

	@JsonProperty("change")
	@Column(name = "change")
	private boolean change;

	@Column(name = "maker")
	private String maker;

	@Column(name = "checker")
	private String checker;

	@Column(name = "approved")
	private boolean approved;

	@Column(name = "updateDate")
	private Date updateDate;

	@Column(name = "approvedDate")
	private Date approvedDate;

	@Column(name = "reason")
	private String reason;

	@Override
	public String toString() {
		return "KycnEducationInfo [id=" + id + ", qualification=" + qualification + ", nameOfInstitute="
				+ nameOfInstitute + ", fieldOfStudy=" + fieldOfStudy + ", yearOfGraduation=" + yearOfGraduation
				+ ", notes=" + notes + ", change=" + change + ", maker=" + maker + ", checker=" + checker
				+ ", approved=" + approved + ", updateDate=" + updateDate + ", approvedDate=" + approvedDate
				+ ", reason=" + reason + "]";
	}

	public Long getId() {
		return id;
	}

	public KycnBase getKycnBase() {
		return kycnBase;
	}

	public String getQualification() {
		return qualification;
	}

	public String getNameOfInstitute() {
		return nameOfInstitute;
	}

	public String getFieldOfStudy() {
		return fieldOfStudy;
	}

	public String getYearOfGraduation() {
		return yearOfGraduation;
	}

	public String getNotes() {
		return notes;
	}

	public boolean isChange() {
		return change;
	}

	public String getMaker() {
		return maker;
	}

	public String getChecker() {
		return checker;
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

	public void setKycnBase(KycnBase kycnBase) {
		this.kycnBase = kycnBase;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public void setNameOfInstitute(String nameOfInstitute) {
		this.nameOfInstitute = nameOfInstitute;
	}

	public void setFieldOfStudy(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}

	public void setYearOfGraduation(String yearOfGraduation) {
		this.yearOfGraduation = yearOfGraduation;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setChange(boolean change) {
		this.change = change;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public void setChecker(String checker) {
		this.checker = checker;
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