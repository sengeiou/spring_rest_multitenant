package com.mult.dataservice.investigation.model;

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
import com.mult.dataservice.hotlist.model.HotList;

@Entity
@Table(name = "investigation_media_info")
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvestigationMediaInfo {

	@Id
	@SequenceGenerator(name = "investigation_media_info_id_seq", sequenceName = "investigation_media_info_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "investigation_media_info_id_seq")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "hot_list_id")
	@JsonIgnore
	private HotList hotList;

	@ManyToOne
	@JoinColumn(name = "investigation_id")
	@JsonIgnore
	private Investigation investigation;

	@JsonProperty("photo_id_number")
	@Column(name = "photo_id_number")
	private String photoIdNumber;

	@JsonProperty("photo_serial_number")
	@Column(name = "photo_serial_number")
	private String photoSerialNumber;

	@JsonProperty("photo_comment")
	@Column(name = "photo_comment")
	private String photoComment;

	@JsonProperty("social_media")
	@Column(name = "social_media")
	private String socialMedia;

	@JsonProperty("social_media_publication_date")
	@Column(name = "social_media_publication_date")
	private String socialMediaPublicationDate;

	@JsonProperty("adverse_media")
	@Column(name = "adverse_media")
	private String adverseMedia;

	@JsonProperty("adverse_media_publication_date")
	@Column(name = "adverse_media_publication_date")
	private String adverseMediaPublicationDate;

	@JsonProperty("date_of_entry")
	@Column(name = "date_of_entry")
	private String dateOfEntry;

	@JsonProperty("date_of_validation")
	@Column(name = "date_of_validation")
	private String dateOfValidation;

	@JsonProperty("source_of_information")
	@Column(name = "source_of_information")
	private String sourceOfInformation;

	@JsonProperty("type_of_source")
	@Column(name = "type_of_source")
	private String typeOfSource;

	@JsonProperty("confidence_level_of_source")
	@Column(name = "confidence_level_of_source")
	private String confidenceLevelOfSource;

	@JsonProperty("notes")
	private String notes;

	@JsonProperty("change")
	private boolean isChange;

	public Long getId() {
		return id;
	}

	public HotList getHotList() {
		return hotList;
	}

	public Investigation getInvestigation() {
		return investigation;
	}

	public String getPhotoIdNumber() {
		return photoIdNumber;
	}

	public String getPhotoSerialNumber() {
		return photoSerialNumber;
	}

	public String getPhotoComment() {
		return photoComment;
	}

	public String getSocialMedia() {
		return socialMedia;
	}

	public String getSocialMediaPublicationDate() {
		return socialMediaPublicationDate;
	}

	public String getAdverseMedia() {
		return adverseMedia;
	}

	public String getAdverseMediaPublicationDate() {
		return adverseMediaPublicationDate;
	}

	public String getDateOfEntry() {
		return dateOfEntry;
	}

	public String getDateOfValidation() {
		return dateOfValidation;
	}

	public String getSourceOfInformation() {
		return sourceOfInformation;
	}

	public String getTypeOfSource() {
		return typeOfSource;
	}

	public String getConfidenceLevelOfSource() {
		return confidenceLevelOfSource;
	}

	public String getNotes() {
		return notes;
	}

	public boolean isChange() {
		return isChange;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setHotList(HotList hotList) {
		this.hotList = hotList;
	}

	public void setInvestigation(Investigation investigation) {
		this.investigation = investigation;
	}

	public void setPhotoIdNumber(String photoIdNumber) {
		this.photoIdNumber = photoIdNumber;
	}

	public void setPhotoSerialNumber(String photoSerialNumber) {
		this.photoSerialNumber = photoSerialNumber;
	}

	public void setPhotoComment(String photoComment) {
		this.photoComment = photoComment;
	}

	public void setSocialMedia(String socialMedia) {
		this.socialMedia = socialMedia;
	}

	public void setSocialMediaPublicationDate(String socialMediaPublicationDate) {
		this.socialMediaPublicationDate = socialMediaPublicationDate;
	}

	public void setAdverseMedia(String adverseMedia) {
		this.adverseMedia = adverseMedia;
	}

	public void setAdverseMediaPublicationDate(String adverseMediaPublicationDate) {
		this.adverseMediaPublicationDate = adverseMediaPublicationDate;
	}

	public void setDateOfEntry(String dateOfEntry) {
		this.dateOfEntry = dateOfEntry;
	}

	public void setDateOfValidation(String dateOfValidation) {
		this.dateOfValidation = dateOfValidation;
	}

	public void setSourceOfInformation(String sourceOfInformation) {
		this.sourceOfInformation = sourceOfInformation;
	}

	public void setTypeOfSource(String typeOfSource) {
		this.typeOfSource = typeOfSource;
	}

	public void setConfidenceLevelOfSource(String confidenceLevelOfSource) {
		this.confidenceLevelOfSource = confidenceLevelOfSource;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setChange(boolean isChange) {
		this.isChange = isChange;
	}

}
