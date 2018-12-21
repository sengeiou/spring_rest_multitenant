package com.mult.dataservice.kycnatural.model;

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
@Table(name = "kycn_observation_info")
@JsonIgnoreProperties(ignoreUnknown = true)
public class KycnObservationInfo {

	@Id
	@SequenceGenerator(name = "kycn_observation_info_id_seq", sequenceName = "kycn_observation_info_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kycn_observation_info_id_seq")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "kycn_base_id")
	@JsonIgnore
	private KycnBase kycnBase;

	@JsonProperty("observation_type")
	@Column(name = "observation_type")
	private String observationType;

	@JsonProperty("internal_observation_physical")
	@Column(name = "internal_observation_physical")
	private String internalObservationPhysical;

	@JsonProperty("internal_observation_financial")
	@Column(name = "internal_observation_financial")
	private String internalObservationFinancial;

	@JsonProperty("internal_observation_behavioural")
	@Column(name = "internal_observation_behavioural")
	private String internalObservationBehavioral;

	@JsonProperty("connected_person")
	@Column(name = "connected_person")
	private String internalObservationConnectedPerson;

	@JsonProperty("connected_person_id")
	@Column(name = "connected_person_id")
	private String connectedPersonId;

	@JsonProperty("intended_objective_of_business_relation")
	@Column(name = "intended_objective_of_business_relation")
	private String internalObservationIntendedObjectiveOfBusinessRelation;

	@JsonProperty("observation_media_source")
	@Column(name = "observation_media_source")
	private String observationMediaSource;

	@JsonProperty("observation_date")
	@Column(name = "observation_date")
	private java.sql.Date observationDate;

	@JsonProperty("hour_of_day")
	@Column(name = "hour_of_day")
	private String observationTime;

	@JsonProperty("notes")
	@Column(name = "notes")
	private String notes;

	@JsonProperty("change")
	@Column(name = "change")
	private boolean change;

	@Override
	public String toString() {
		return "KycnObservationInfo [id=" + id + ", observationType=" + observationType
				+ ", internalObservationPhysical=" + internalObservationPhysical + ", internalObservationFinancial="
				+ internalObservationFinancial + ", internalObservationBehavioral=" + internalObservationBehavioral
				+ ", internalObservationConnectedPerson=" + internalObservationConnectedPerson + ", connectedPersonId="
				+ connectedPersonId + ", internalObservationIntendedObjectiveOfBusinessRelation="
				+ internalObservationIntendedObjectiveOfBusinessRelation + ", observationMediaSource="
				+ observationMediaSource + ", observationDate=" + observationDate + ", observationTime="
				+ observationTime + ", notes=" + notes + ", change=" + change + "]";
	}

	public Long getId() {
		return id;
	}

	public KycnBase getKycnBase() {
		return kycnBase;
	}

	public String getObservationType() {
		return observationType;
	}

	public String getInternalObservationPhysical() {
		return internalObservationPhysical;
	}

	public String getInternalObservationFinancial() {
		return internalObservationFinancial;
	}

	public String getInternalObservationBehavioral() {
		return internalObservationBehavioral;
	}

	public String getInternalObservationConnectedPerson() {
		return internalObservationConnectedPerson;
	}

	public String getConnectedPersonId() {
		return connectedPersonId;
	}

	public String getInternalObservationIntendedObjectiveOfBusinessRelation() {
		return internalObservationIntendedObjectiveOfBusinessRelation;
	}

	public String getObservationMediaSource() {
		return observationMediaSource;
	}

	public java.sql.Date getObservationDate() {
		return observationDate;
	}

	public String getObservationTime() {
		return observationTime;
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

	public void setKycnBase(KycnBase kycnBase) {
		this.kycnBase = kycnBase;
	}

	public void setObservationType(String observationType) {
		this.observationType = observationType;
	}

	public void setInternalObservationPhysical(String internalObservationPhysical) {
		this.internalObservationPhysical = internalObservationPhysical;
	}

	public void setInternalObservationFinancial(String internalObservationFinancial) {
		this.internalObservationFinancial = internalObservationFinancial;
	}

	public void setInternalObservationBehavioral(String internalObservationBehavioral) {
		this.internalObservationBehavioral = internalObservationBehavioral;
	}

	public void setInternalObservationConnectedPerson(String internalObservationConnectedPerson) {
		this.internalObservationConnectedPerson = internalObservationConnectedPerson;
	}

	public void setConnectedPersonId(String connectedPersonId) {
		this.connectedPersonId = connectedPersonId;
	}

	public void setInternalObservationIntendedObjectiveOfBusinessRelation(
			String internalObservationIntendedObjectiveOfBusinessRelation) {
		this.internalObservationIntendedObjectiveOfBusinessRelation = internalObservationIntendedObjectiveOfBusinessRelation;
	}

	public void setObservationMediaSource(String observationMediaSource) {
		this.observationMediaSource = observationMediaSource;
	}

	public void setObservationDate(java.sql.Date observationDate) {
		this.observationDate = observationDate;
	}

	public void setObservationTime(String observationTime) {
		this.observationTime = observationTime;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setChange(boolean change) {
		this.change = change;
	}

}
