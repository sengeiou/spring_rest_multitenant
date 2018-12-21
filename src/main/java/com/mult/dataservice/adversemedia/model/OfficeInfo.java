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
@Table(name = "office_info")
public class OfficeInfo {

	@Id
	@SequenceGenerator(name = "adverse_media_office_info_id_seq", sequenceName = "adverse_media_office_info_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "adverse_media_office_info_id_seq")
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

	@JsonProperty("designation")
	private String designation;

	@JsonProperty("office_name")
	@Column(name = "office_name")
	private String officeName;

	@JsonProperty("term_years")
	@Column(name = "term_years")
	private long termYears;

	@JsonProperty("date_of_appointment")
	@Column(name = "date_of_appointment")
	private String dateOfAppointment;

	@JsonProperty("prolongation")
	private long prolongation;

	@JsonProperty("pep_office_status")
	@Column(name = "pep_office_status")
	private String pepOfficeStatus;

	@JsonProperty("notes")
	private String notes;

	@JsonProperty("elected_district")
	@Column(name = "elected_district")
	private String electedDistrict;

	@JsonProperty("area_number")
	@Column(name = "area_number")
	private int areaNumber;

	@JsonProperty("party_name")
	@Column(name = "party_name")
	private String partyName;

	@JsonProperty("category")
	@Column(name = "category")
	private String category;

	@JsonProperty("change")
	private boolean change;

	@Override
	public String toString() {
		return "AdverseOfficeInfo [id=" + id + ", designation=" + designation + ", officeName=" + officeName
				+ ", termYears=" + termYears + ", dateOfAppointment=" + dateOfAppointment + ", prolongation="
				+ prolongation + ", pepOfficeStatus=" + pepOfficeStatus + ", notes=" + notes + ", electedDistrict="
				+ electedDistrict + ", areaNumber=" + areaNumber + ", partyName=" + partyName + ", category=" + category
				+ ", change=" + change + "]";
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

	public String getDesignation() {
		return designation;
	}

	public String getOfficeName() {
		return officeName;
	}

	public long getTermYears() {
		return termYears;
	}

	public String getDateOfAppointment() {
		return dateOfAppointment;
	}

	public long getProlongation() {
		return prolongation;
	}

	public String getPepOfficeStatus() {
		return pepOfficeStatus;
	}

	public String getNotes() {
		return notes;
	}

	public String getElectedDistrict() {
		return electedDistrict;
	}

	public int getAreaNumber() {
		return areaNumber;
	}

	public String getPartyName() {
		return partyName;
	}

	public String getCategory() {
		return category;
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

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public void setTermYears(long termYears) {
		this.termYears = termYears;
	}

	public void setDateOfAppointment(String dateOfAppointment) {
		this.dateOfAppointment = dateOfAppointment;
	}

	public void setProlongation(long prolongation) {
		this.prolongation = prolongation;
	}

	public void setPepOfficeStatus(String pepOfficeStatus) {
		this.pepOfficeStatus = pepOfficeStatus;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setElectedDistrict(String electedDistrict) {
		this.electedDistrict = electedDistrict;
	}

	public void setAreaNumber(int areaNumber) {
		this.areaNumber = areaNumber;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setChange(boolean change) {
		this.change = change;
	}

}
