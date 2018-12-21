package com.mult.dataservice.screeninglegal.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mult.dataservice.screeningnatural.model.ScreeningAction;
import com.mult.dataservice.screeningnatural.model.ScreeningAttachment;
import com.mult.dataservice.screeningnatural.model.ScreeningMatchInfo;
import com.mult.dataservice.screeningnatural.model.ScreeningRelatedEntityRequest;
import com.mult.dataservice.screeningnatural.model.ScreeningRelatedPersonRequest;

@Entity
@Table(name = "screening_l_request")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ScreeningLRequest implements Serializable {

	private static final long serialVersionUID = -8607418092110776545L;

	@Id
	@JsonProperty("id")
	@SequenceGenerator(name = "screening_l_id_seq", sequenceName = "screening_l_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "screening_l_id_seq")
	private Long id;

	@OneToOne(mappedBy = "screeningLRequest", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JsonProperty("screening_l_request_data")
	private ScreeningLRequestData screeningLRequestData;

	@JsonProperty("screening_l_related_person")
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "legal_related", joinColumns = @JoinColumn(name = "legal_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "related_id", referencedColumnName = "id"))
	private Set<ScreeningRelatedPersonRequest> listOfRelated = new HashSet<>();

	@JsonProperty("screening_l_attachment")
	@OneToMany(mappedBy = "screeningLRequest", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<ScreeningAttachment> attachment = new HashSet<>();

	@JsonProperty("screening_match_info")
	@OneToMany(mappedBy = "screeningLRequest", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<ScreeningMatchInfo> screeningLMatchInfo = new HashSet<>();

	@JsonProperty("screening_l_related_entity")
	@OneToMany(mappedBy = "screeningLRequest", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<ScreeningRelatedEntityRequest> relatedEntityRequestData = new HashSet<>();

	@JsonProperty("screening_l_action")
	@OneToMany(mappedBy = "screeningLRequest", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<ScreeningAction> screeningLAction = new HashSet<>();

	private boolean updated;

	@Column(name = "approved")
	private boolean approved;

	@Column(name = "replied")
	private boolean replied;

	@Column(name = "action")
	private boolean action;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ScreeningLRequestData getScreeningLRequestData() {
		return screeningLRequestData;
	}

	public void setScreeningLRequestData(ScreeningLRequestData screeningLRequestData) {
		this.screeningLRequestData = screeningLRequestData;
	}

	public Set<ScreeningRelatedPersonRequest> getListOfRelated() {
		return listOfRelated;
	}

	public void setListOfRelated(Set<ScreeningRelatedPersonRequest> listOfRelated) {
		this.listOfRelated = listOfRelated;
	}

	public Set<ScreeningAttachment> getAttachment() {
		return attachment;
	}

	public void setAttachment(Set<ScreeningAttachment> attachment) {
		this.attachment = attachment;
	}

	public Set<ScreeningMatchInfo> getScreeningLMatchInfo() {
		return screeningLMatchInfo;
	}

	public void setScreeningLMatchInfo(Set<ScreeningMatchInfo> screeningLMatchInfo) {
		this.screeningLMatchInfo = screeningLMatchInfo;
	}

	public Set<ScreeningRelatedEntityRequest> getRelatedEntityRequestData() {
		return relatedEntityRequestData;
	}

	public void setRelatedEntityRequestData(Set<ScreeningRelatedEntityRequest> relatedEntityRequestData) {
		this.relatedEntityRequestData = relatedEntityRequestData;
	}

	public Set<ScreeningAction> getScreeningLAction() {
		return screeningLAction;
	}

	public void setScreeningLAction(Set<ScreeningAction> screeningLAction) {
		this.screeningLAction = screeningLAction;
	}

	public boolean isUpdated() {
		return updated;
	}

	public void setUpdated(boolean updated) {
		this.updated = updated;
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	public boolean isReplied() {
		return replied;
	}

	public void setReplied(boolean replied) {
		this.replied = replied;
	}

	public boolean isAction() {
		return action;
	}

	public void setAction(boolean action) {
		this.action = action;
	}

}
