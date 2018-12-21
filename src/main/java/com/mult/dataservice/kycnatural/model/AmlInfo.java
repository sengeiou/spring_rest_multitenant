package com.mult.dataservice.kycnatural.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="aml_info")
public class AmlInfo {
	
	@Id
	@SequenceGenerator(name="aml_info_id_seq", sequenceName="aml_info_id_seq",allocationSize=1)
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "aml_info_id_seq")
	private Long id;
	
	private String recommendations;
	
	@Column(name="risk_categorization")
	@JsonProperty("risk_categorization")
	private String riskCategorization;
	
	private String notes;

	public Long getId() {
		return id;
	}

	public String getRecommendations() {
		return recommendations;
	}

	public String getRiskCategorization() {
		return riskCategorization;
	}

	public String getNotes() {
		return notes;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setRecommendations(String recommendations) {
		this.recommendations = recommendations;
	}

	public void setRiskCategorization(String riskCategorization) {
		this.riskCategorization = riskCategorization;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	

}
