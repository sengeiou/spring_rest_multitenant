package com.mult.dataservice.kyclegal.model;

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
@Table(name = "kycl_compliance_info")
public class ComplianceInfo {

	@Id
	@SequenceGenerator(name = "kycl_compliance_id_seq", sequenceName = "kycl_compliance_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kycl_compliance_id_seq")
	private Long id;

	@OneToOne
	@JoinColumn(name = "kycl_id")
	@JsonIgnore
	private Kycl kycl;

	@JsonProperty("level_of_compliance_on_aml")
	@Column(name = "level_of_compliance_on_aml")
	private String levelOfComplianceOnAml;

	@JsonProperty("level_of_compliance_on_tax")
	@Column(name = "level_of_compliance_on_tax")
	private String levelOfComplianceOnTax;

	@JsonProperty("level_of_compliance_on_corruption")
	@Column(name = "level_of_compliance_on_corruption")
	private String levelOfComplianceOnCorruption;

	@JsonProperty("level_of_compliance_on_others")
	@Column(name = "level_of_compliance_on_others")
	private String levelOfComplianceOnOthers;

	@JsonProperty("notes")
	private String notes;

	private String recommendations;

	@JsonProperty("risk_categorization")
	@Column(name = "risk_categorization")
	private String riskCategorization;

	@JsonProperty("change")
	boolean change;

	public Long getId() {
		return id;
	}

	public Kycl getKycl() {
		return kycl;
	}

	public String getLevelOfComplianceOnAml() {
		return levelOfComplianceOnAml;
	}

	public String getLevelOfComplianceOnTax() {
		return levelOfComplianceOnTax;
	}

	public String getLevelOfComplianceOnCorruption() {
		return levelOfComplianceOnCorruption;
	}

	public String getLevelOfComplianceOnOthers() {
		return levelOfComplianceOnOthers;
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

	public void setLevelOfComplianceOnAml(String levelOfComplianceOnAml) {
		this.levelOfComplianceOnAml = levelOfComplianceOnAml;
	}

	public void setLevelOfComplianceOnTax(String levelOfComplianceOnTax) {
		this.levelOfComplianceOnTax = levelOfComplianceOnTax;
	}

	public void setLevelOfComplianceOnCorruption(String levelOfComplianceOnCorruption) {
		this.levelOfComplianceOnCorruption = levelOfComplianceOnCorruption;
	}

	public void setLevelOfComplianceOnOthers(String levelOfComplianceOnOthers) {
		this.levelOfComplianceOnOthers = levelOfComplianceOnOthers;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setChange(boolean change) {
		this.change = change;
	}

	public String getRecommendations() {
		return recommendations;
	}

	public String getRiskCategorization() {
		return riskCategorization;
	}

	public void setRecommendations(String recommendations) {
		this.recommendations = recommendations;
	}

	public void setRiskCategorization(String riskCategorization) {
		this.riskCategorization = riskCategorization;
	}

}
