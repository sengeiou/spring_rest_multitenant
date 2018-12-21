package com.mult.dataservice.adversemedia.model;

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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mult.dataservice.hotlist.model.HotList;
import com.mult.dataservice.investigation.model.Investigation;
import com.mult.dataservice.pepentry.model.Pepentry;

@Entity

@Table(name = "personal_info")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonalInfo {

	@Id
	@SequenceGenerator(name = "adverse_media_personal_info_id_seq", sequenceName = "adverse_media_personal_info_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "adverse_media_personal_info_id_seq")
	private Long id;

	@OneToOne
	@JoinColumn(name = "adverse_media_id")
	@JsonIgnore
	private AdverseMedia adverseMedia;

	@OneToOne
	@JoinColumn(name = "hot_list_id")
	@JsonIgnore
	private HotList hotList;

	@OneToOne
	@JoinColumn(name = "investigation_id")
	@JsonIgnore
	private Investigation investigation;

	@OneToOne
	@JoinColumn(name = "pepentry_id")
	@JsonIgnore
	private Pepentry pepentry;

	@JsonProperty("lsl_name")
	@Column(name = "lsl_name")
	private String lslName;

	@JsonProperty("category")
	private String category;

	@JsonProperty("lsf_name")
	@Column(name = "lsf_name")
	private String lsfName;

	private String notes;

	private String gender;

	@JsonProperty("date_of_birth")
	@Column(name = "date_of_birth")
	private String dateOfBirth;

	private String jurisdiction;

	@JsonProperty("previous_name")
	@Column(name = "previous_name")
	private String previousName;

	@JsonProperty("last_name")
	@Column(name = "last_name")
	private String lastName;

	@JsonProperty("middle_name")
	@Column(name = "middle_name")
	private String middleName;

	@JsonProperty("place_of_birth")
	@Column(name = "place_of_birth")
	private String placeOfBirth;

	private String nationality;

	@JsonProperty("called_by_name")
	@Column(name = "called_by_name")
	private String calledByName;

	@JsonProperty("country_of_birth")
	@Column(name = "country_of_birth")
	private String countryOfBirth;

	@JsonProperty("second_name")
	@Column(name = "second_name")
	private String secondName;

	private String salutation;

	@JsonProperty("first_name")
	@Column(name = "first_name")
	private String firstName;

	@JsonProperty("lsm_name")
	@Column(name = "lsm_name")
	private String lsmName;

	private boolean change;

	@JsonProperty("reference_no")
	@Column(name = "reference_no")
	private String referenceNo;

	@JsonProperty("approved_by")
	@Column(name = "approved_by")
	private String approvedBy;

	private String correspondent;

	@JsonProperty("pan_number")
	@Column(name = "pan_number")
	private String panNumber;

	@JsonProperty("citizen_number")
	@Column(name = "citizen_number")
	private String citizenNumber;

	@JsonProperty("approved_date")
	@Column(name = "approved_date")
	private String approvedDate;

	@Override
	public String toString() {
		return "PersonalInfo [id=" + id + ", lslName=" + lslName + ", category=" + category + ", lsfName=" + lsfName
				+ ", notes=" + notes + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + ", jurisdiction="
				+ jurisdiction + ", previousName=" + previousName + ", lastName=" + lastName + ", middleName="
				+ middleName + ", placeOfBirth=" + placeOfBirth + ", nationality=" + nationality + ", calledByName="
				+ calledByName + ", countryOfBirth=" + countryOfBirth + ", secondName=" + secondName + ", salutation="
				+ salutation + ", firstName=" + firstName + ", lsmName=" + lsmName + ", change=" + change
				+ ", referenceNo=" + referenceNo + ", approvedBy=" + approvedBy + ", correspondent=" + correspondent
				+ ", panNumber=" + panNumber + ", citizenNumber=" + citizenNumber + ", approvedDate=" + approvedDate
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

	public String getLslName() {
		return lslName;
	}

	public String getCategory() {
		return category;
	}

	public String getLsfName() {
		return lsfName;
	}

	public String getNotes() {
		return notes;
	}

	public String getGender() {
		return gender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public String getJurisdiction() {
		return jurisdiction;
	}

	public String getPreviousName() {
		return previousName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public String getNationality() {
		return nationality;
	}

	public String getCalledByName() {
		return calledByName;
	}

	public String getCountryOfBirth() {
		return countryOfBirth;
	}

	public String getSecondName() {
		return secondName;
	}

	public String getSalutation() {
		return salutation;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLsmName() {
		return lsmName;
	}

	public boolean isChange() {
		return change;
	}

	public String getReferenceNo() {
		return referenceNo;
	}

	public String getApprovedBy() {
		return approvedBy;
	}

	public String getCorrespondent() {
		return correspondent;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public String getCitizenNumber() {
		return citizenNumber;
	}

	public String getApprovedDate() {
		return approvedDate;
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

	public void setLslName(String lslName) {
		this.lslName = lslName;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setLsfName(String lsfName) {
		this.lsfName = lsfName;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setJurisdiction(String jurisdiction) {
		this.jurisdiction = jurisdiction;
	}

	public void setPreviousName(String previousName) {
		this.previousName = previousName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public void setCalledByName(String calledByName) {
		this.calledByName = calledByName;
	}

	public void setCountryOfBirth(String countryOfBirth) {
		this.countryOfBirth = countryOfBirth;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLsmName(String lsmName) {
		this.lsmName = lsmName;
	}

	public void setChange(boolean change) {
		this.change = change;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	public void setCorrespondent(String correspondent) {
		this.correspondent = correspondent;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public void setCitizenNumber(String citizenNumber) {
		this.citizenNumber = citizenNumber;
	}

	public void setApprovedDate(String approvedDate) {
		this.approvedDate = approvedDate;
	}

}
