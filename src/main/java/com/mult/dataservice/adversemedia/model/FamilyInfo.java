package com.mult.dataservice.adversemedia.model;

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
import com.mult.dataservice.hotlist.model.HotList;
import com.mult.dataservice.investigation.model.Investigation;
import com.mult.dataservice.pepentry.model.Pepentry;

@Entity
@Table(name = "family_info")
public class FamilyInfo {

	@Id
	@SequenceGenerator(name = "adverse_media_family_info_id_seq", sequenceName = "adverse_media_family_info_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "adverse_media_family_info_id_seq")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "adverse_media_id")
	@JsonIgnore
	private AdverseMedia adverseMedia;

	@ManyToOne
	@JoinColumn(name = "hot_list_id")
	@JsonIgnore
	private HotList hotList;

	@ManyToOne
	@JoinColumn(name = "investigation_id")
	@JsonIgnore
	private Investigation investigation;

	@ManyToOne
	@JoinColumn(name = "pepentry_id")
	@JsonIgnore
	private Pepentry pepentry;

	@JsonProperty("first_name")
	@Column(name = "first_name")
	private String firstName;

	@JsonProperty("middle_name")
	@Column(name = "middle_name")
	private String middleName;

	@JsonProperty("last_name")
	@Column(name = "last_name")
	private String lastName;

	@JsonProperty("lsf_name")
	@Column(name = "lsf_name")
	private String lsfName;

	@JsonProperty("lsm_name")
	@Column(name = "lsm_name")
	private String lsmName;

	@JsonProperty("lsl_name")
	@Column(name = "lsl_name")
	private String lslName;

	@JsonProperty("second_name")
	@Column(name = "second_name")
	private String secondName;

	@JsonProperty("called_by_name")
	@Column(name = "called_by_name")
	private String calledByName;

	@JsonProperty("relationship")
	private String relationshipTo;

	@JsonProperty("notes")
	private String notes;

	@JsonProperty("primary_identification_document_no")
	@Column(name = "primary_identification_document_no")
	private String primaryIdentificationDocumentNo;

	@JsonProperty("change")
	private boolean change;

	@Override
	public String toString() {
		return "AdverseFamilyInfo [id=" + id + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", lsfName=" + lsfName + ", lsmName=" + lsmName + ", lslName=" + lslName + ", secondName="
				+ secondName + ", calledByName=" + calledByName + ", relationshipTo=" + relationshipTo + ", notes="
				+ notes + ", primaryIdentificationDocumentNo=" + primaryIdentificationDocumentNo + ", change=" + change
				+ "]";
	}

	public Long getId() {
		return id;
	}

	public AdverseMedia getAdverseMedia() {
		return adverseMedia;
	}

	public HotList getHotList() {
		return hotList;
	}

	public Investigation getInvestigation() {
		return investigation;
	}

	public Pepentry getPepentry() {
		return pepentry;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getLsfName() {
		return lsfName;
	}

	public String getLsmName() {
		return lsmName;
	}

	public String getLslName() {
		return lslName;
	}

	public String getSecondName() {
		return secondName;
	}

	public String getCalledByName() {
		return calledByName;
	}

	public String getRelationshipTo() {
		return relationshipTo;
	}

	public String getNotes() {
		return notes;
	}

	public String getPrimaryIdentificationDocumentNo() {
		return primaryIdentificationDocumentNo;
	}

	public boolean isChange() {
		return change;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setAdverseMedia(AdverseMedia adverseMedia) {
		this.adverseMedia = adverseMedia;
	}

	public void setHotList(HotList hotList) {
		this.hotList = hotList;
	}

	public void setInvestigation(Investigation investigation) {
		this.investigation = investigation;
	}

	public void setPepentry(Pepentry pepentry) {
		this.pepentry = pepentry;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setLsfName(String lsfName) {
		this.lsfName = lsfName;
	}

	public void setLsmName(String lsmName) {
		this.lsmName = lsmName;
	}

	public void setLslName(String lslName) {
		this.lslName = lslName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public void setCalledByName(String calledByName) {
		this.calledByName = calledByName;
	}

	public void setRelationshipTo(String relationshipTo) {
		this.relationshipTo = relationshipTo;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setPrimaryIdentificationDocumentNo(String primaryIdentificationDocumentNo) {
		this.primaryIdentificationDocumentNo = primaryIdentificationDocumentNo;
	}

	public void setChange(boolean change) {
		this.change = change;
	}

}
