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
@Table(name = "kycl_related_person")
public class RelatedPerson {

	@Id
	@SequenceGenerator(name = "kycl_related_person_id_seq", sequenceName = "kycl_related_person_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kycl_related_person_id_seq")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "kycl_id")
	@JsonIgnore
	private Kycl kycl;
	
	@JsonProperty("kycn_id")
	@Column(name = "kycn_id")
	private long kycnId;

	@JsonProperty("person_type")
	@Column(name = "perosn_type")
	private String personType;
	
	@JsonProperty("goaml_person_type")
	@Column(name = "goaml_perosn_type")
	private String goamlPersonType;

	@JsonProperty("cust_id")
	@Column(name = "cust_id")
	private String custId;

	@JsonProperty("salutation")
	private String salutation;

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

	@JsonProperty("primary_identification_document_type")
	@Column(name = "primary_identification_document_type")
	private String primaryIdentificationDocumentType;

	@JsonProperty("primary_identification_document_no")
	@Column(name = "primary_identification_document_no")
	private String primaryIdentificationDocumentNo;

	@JsonProperty("country")
	private String country;

	@JsonProperty("issuing_authority")
	@Column(name = "issuing_authority")
	private String issuingAuthority;

	@JsonProperty("place_of_issue")
	@Column(name = "place_of_issue")
	private String placeOfIssue;

	@JsonProperty("issue_date")
	@Column(name = "issue_date")
	private String issueDate;

	@JsonProperty("expiry_date")
	@Column(name = "expiry_date")
	private String expiryDate;

	@JsonProperty("notes")
	private String notes;

	@JsonProperty("zone")
	private String zone;

	@JsonProperty("district")
	private String district;

	@JsonProperty("mn_vdc")
	@Column(name = "mn_vdc")
	private String mnVdc;

	@JsonProperty("pinzip")
	private String pinzip;

	@JsonProperty("ward_number")
	@Column(name = "ward_number")
	private String wardNumber;

	@JsonProperty("tole_area")
	@Column(name = "tole_area")
	private String toleArea;

	@JsonProperty("street")
	private String street;

	@JsonProperty("house_no")
	private String houseNo;

	@JsonProperty("unit_number")
	@Column(name = "unit_number")
	private String unitNumber;

	@JsonProperty("nearest_landmark")
	@Column(name = "nearest_landmark")
	private String nearestLandmark;

	@JsonProperty("latitude")
	private String latitude;

	@JsonProperty("longitude")
	private String longitude;

	@JsonProperty("phone_no_country_code")
	@Column(name = "phone_no_country_code")
	private String phoneNoCountryCode;

	@JsonProperty("phone_no_area_code")
	@Column(name = "phone_no_area_code")
	private String phoneNoAreaCode;

	@JsonProperty("phone_no")
	@Column(name = "phone_no")
	private String phoneNo;

	@JsonProperty("telex_no_country_code")
	@Column(name = "telex_no_country_code")
	private String telexNoCountryCode;

	@JsonProperty("telex_no_area_code")
	@Column(name = "telex_no_area_code")
	private String telexNoAreaCode;

	@JsonProperty("telex_no")
	@Column(name = "telex_no")
	private String telexNo;

	@JsonProperty("email_id")
	@Column(name = "email_id")
	private String emailId;

	@JsonProperty("change")
	private boolean change;

	@JsonProperty("province")
	private String province;
    
	@JsonProperty("removed_signatory_status")
	@Column(name = "removed_signatory_status")
	private boolean removedSignatoryStatus;

	public Long getId() {
		return id;
	}

	public Kycl getKycl() {
		return kycl;
	}

	public String getPersonType() {
		return personType;
	}

	public String getCustId() {
		return custId;
	}

	public String getSalutation() {
		return salutation;
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

	public String getPrimaryIdentificationDocumentType() {
		return primaryIdentificationDocumentType;
	}

	public String getPrimaryIdentificationDocumentNo() {
		return primaryIdentificationDocumentNo;
	}

	public String getCountry() {
		return country;
	}

	public String getIssuingAuthority() {
		return issuingAuthority;
	}

	public String getPlaceOfIssue() {
		return placeOfIssue;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public String getNotes() {
		return notes;
	}

	public String getZone() {
		return zone;
	}

	public String getDistrict() {
		return district;
	}

	public String getMnVdc() {
		return mnVdc;
	}

	public String getPinzip() {
		return pinzip;
	}

	public String getWardNumber() {
		return wardNumber;
	}

	public String getToleArea() {
		return toleArea;
	}

	public String getStreet() {
		return street;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public String getUnitNumber() {
		return unitNumber;
	}

	public String getNearestLandmark() {
		return nearestLandmark;
	}

	public String getLatitude() {
		return latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public String getPhoneNoCountryCode() {
		return phoneNoCountryCode;
	}

	public String getPhoneNoAreaCode() {
		return phoneNoAreaCode;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public String getTelexNoCountryCode() {
		return telexNoCountryCode;
	}

	public String getTelexNoAreaCode() {
		return telexNoAreaCode;
	}

	public String getTelexNo() {
		return telexNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public boolean isChange() {
		return change;
	}

	public String getProvince() {
		return province;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setKycl(Kycl kycl) {
		this.kycl = kycl;
	}

	public void setPersonType(String personType) {
		this.personType = personType;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGoamlPersonType() {
		return goamlPersonType;
	}

	public boolean isRemovedSignatoryStatus() {
		return removedSignatoryStatus;
	}

	public void setGoamlPersonType(String goamlPersonType) {
		this.goamlPersonType = goamlPersonType;
	}

	public void setRemovedSignatoryStatus(boolean removedSignatoryStatus) {
		this.removedSignatoryStatus = removedSignatoryStatus;
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

	public void setPrimaryIdentificationDocumentType(String primaryIdentificationDocumentType) {
		this.primaryIdentificationDocumentType = primaryIdentificationDocumentType;
	}

	public void setPrimaryIdentificationDocumentNo(String primaryIdentificationDocumentNo) {
		this.primaryIdentificationDocumentNo = primaryIdentificationDocumentNo;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setIssuingAuthority(String issuingAuthority) {
		this.issuingAuthority = issuingAuthority;
	}

	public void setPlaceOfIssue(String placeOfIssue) {
		this.placeOfIssue = placeOfIssue;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setMnVdc(String mnVdc) {
		this.mnVdc = mnVdc;
	}

	public void setPinzip(String pinzip) {
		this.pinzip = pinzip;
	}

	public void setWardNumber(String wardNumber) {
		this.wardNumber = wardNumber;
	}

	public void setToleArea(String toleArea) {
		this.toleArea = toleArea;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public void setUnitNumber(String unitNumber) {
		this.unitNumber = unitNumber;
	}

	public void setNearestLandmark(String nearestLandmark) {
		this.nearestLandmark = nearestLandmark;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public void setPhoneNoCountryCode(String phoneNoCountryCode) {
		this.phoneNoCountryCode = phoneNoCountryCode;
	}

	public void setPhoneNoAreaCode(String phoneNoAreaCode) {
		this.phoneNoAreaCode = phoneNoAreaCode;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void setTelexNoCountryCode(String telexNoCountryCode) {
		this.telexNoCountryCode = telexNoCountryCode;
	}

	public void setTelexNoAreaCode(String telexNoAreaCode) {
		this.telexNoAreaCode = telexNoAreaCode;
	}

	public void setTelexNo(String telexNo) {
		this.telexNo = telexNo;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setChange(boolean change) {
		this.change = change;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public long getKycnId() {
		return kycnId;
	}

	public void setKycnId(long kycnId) {
		this.kycnId = kycnId;
	}

}
