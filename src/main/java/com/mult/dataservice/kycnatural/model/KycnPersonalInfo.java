package com.mult.dataservice.kycnatural.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
import com.mult.dataservice.identity.model.User;

@Entity
@Table(name = "kycn_personal_info")
@JsonIgnoreProperties(ignoreUnknown = true)
public class KycnPersonalInfo {

	@Id
	@SequenceGenerator(name = "kycn_personal_info_id_seq", sequenceName = "kycn_personal_info_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kycn_personal_info_id_seq")
	private Long id;

	@OneToOne
	@JoinColumn(name = "kycn_base_id")
	@JsonIgnore
	private KycnBase kycnBase;

	@JsonProperty("cust_id")
	@Column(name = "cust_id")
	private String customerId;
	@OneToOne(mappedBy = "personalInfo", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JsonProperty("user")
	private User user;

	@JsonProperty("salutation")
	@Column(name = "salutation")
	private String salutation;

	@JsonProperty("cbs_generated_name")
	@Column(name = "cbs_generated_name")
	private String cbsGeneratedName;

	@JsonProperty("first_name")
	@Column(name = "first_name")
	private String firstName;

	@JsonProperty("middle_name")
	@Column(name = "middle_name")
	private String middleName;

	@JsonProperty("last_name")
	@Column(name = "last_name")
	private String lastName;

	@JsonProperty("screening_id")
	@Column(name = "screening_id")
	private long screeningId;

	@JsonProperty("ls_title")
	@Column(name = "ls_title")
	private String lsTitle;

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

	@JsonProperty("previous_name")
	@Column(name = "previous_name")
	private String previousName;

	@JsonProperty("gender")
	@Column(name = "gender")
	private String gender;

	@JsonProperty("goaml_gender")
	@Column(name = "goaml_gender")
	private String goamlGender;

	@JsonProperty("date_of_birth")
	@Column(name = "date_of_birth")
	private Date dateOfBirth;

	@JsonProperty("age")
	@Column(name = "age")
	private String age;

	@JsonProperty("marital_status")
	@Column(name = "marital_status")
	private String maritalStatus;

	@JsonProperty("notes")
	@Column(name = "notes")
	private String notes;

	@JsonProperty("customer_type")
	@Column(name = "customer_type")
	private String customerType;

	@JsonProperty("customer_group")
	@Column(name = "customer_group")
	private String customerGroup;

	@JsonProperty("customer_constitution")
	@Column(name = "customer_constitution")
	private String customerConstitution;

	@JsonProperty("customer_community")
	@Column(name = "customer_community")
	private String customerCommunity;

	@JsonProperty("customer_caste")
	@Column(name = "customer_caste")
	private String customerCaste;

	@JsonProperty("customer_employee_id")
	@Column(name = "customer_employee_id")
	private String customerEmployeeId;

	@JsonProperty("customer_open_date")
	@Column(name = "customer_open_date")
	private Date customerOpenDate;

	@JsonProperty("customer_maker")
	@Column(name = "customer_maker")
	private String customerMaker;

	@JsonProperty("customer_status_code")
	@Column(name = "customer_status_code")
	private String customerStatusCode;

	@JsonProperty("minor")
	@Column(name = "minor")
	private boolean minor;

	@JsonProperty("customer_nre_flag")
	@Column(name = "customer_nre_flag")
	private boolean nonResidentExternal;

	@JsonProperty("customer_cardholder_flag")
	@Column(name = "customer_cardholder_flag")
	private boolean cardHolder;

	@JsonProperty("pan_number")
	@Column(name = "pan_number")
	private String panNumber;

	@JsonProperty("cbs_imported_date")
	@Column(name = "cbs_imported_date")
	private Date cbsImportedDate;

	@JsonProperty("verified")
	@Column(name = "verified")
	private boolean verified;

	@JsonProperty("change")
	@Column(name = "change")
	private boolean change;

	@JsonProperty("date_of_birth_bs")
	@Column(name = "date_of_birth_bs")
	private Date dateOfBirthBS;

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

	@JsonProperty("screening_n_id")
	@Column(name = "screening_n_id")
	private Long screeningLId;

	@Override
	public String toString() {
		return "KycnPersonalInfo [id=" + id + ", customerId=" + customerId + ", salutation=" + salutation
				+ ", cbsGeneratedName=" + cbsGeneratedName + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", screeningId=" + screeningId + ", lsTitle=" + lsTitle + ", lsfName="
				+ lsfName + ", lsmName=" + lsmName + ", lslName=" + lslName + ", secondName=" + secondName
				+ ", calledByName=" + calledByName + ", previousName=" + previousName + ", gender=" + gender
				+ ", dateOfBirth=" + dateOfBirth + ", age=" + age + ", maritalStatus=" + maritalStatus + ", notes="
				+ notes + ", customerType=" + customerType + ", customerGroup=" + customerGroup
				+ ", customerConstitution=" + customerConstitution + ", customerCommunity=" + customerCommunity
				+ ", customerCaste=" + customerCaste + ", customerEmployeeId=" + customerEmployeeId
				+ ", customerOpenDate=" + customerOpenDate + ", customerMaker=" + customerMaker
				+ ", customerStatusCode=" + customerStatusCode + ", minor=" + minor + ", nonResidentExternal="
				+ nonResidentExternal + ", cardHolder=" + cardHolder + ", panNumber=" + panNumber + ", cbsImportedDate="
				+ cbsImportedDate + ", verified=" + verified + ", change=" + change + ", dateOfBirthBS=" + dateOfBirthBS
				+ ", maker=" + maker + ", checker=" + checker + ", approved=" + approved + ", updateDate=" + updateDate
				+ ", approvedDate=" + approvedDate + ", reason=" + reason + ", screeningLId=" + screeningLId + "]";
	}

	public Long getId() {
		return id;
	}

	public KycnBase getKycnBase() {
		return kycnBase;
	}

	public String getCustomerId() {
		return customerId;
	}

	public String getSalutation() {
		return salutation;
	}

	public String getCbsGeneratedName() {
		return cbsGeneratedName;
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

	public long getScreeningId() {
		return screeningId;
	}

	public String getLsTitle() {
		return lsTitle;
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

	public String getPreviousName() {
		return previousName;
	}

	public String getGender() {
		return gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public String getAge() {
		return age;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public String getNotes() {
		return notes;
	}

	public String getCustomerType() {
		return customerType;
	}

	public String getCustomerGroup() {
		return customerGroup;
	}

	public String getCustomerConstitution() {
		return customerConstitution;
	}

	public String getCustomerCommunity() {
		return customerCommunity;
	}

	public String getCustomerCaste() {
		return customerCaste;
	}

	public String getCustomerEmployeeId() {
		return customerEmployeeId;
	}

	public Date getCustomerOpenDate() {
		return customerOpenDate;
	}

	public String getCustomerMaker() {
		return customerMaker;
	}

	public String getCustomerStatusCode() {
		return customerStatusCode;
	}

	public boolean isMinor() {
		return minor;
	}

	public boolean isNonResidentExternal() {
		return nonResidentExternal;
	}

	public boolean isCardHolder() {
		return cardHolder;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public Date getCbsImportedDate() {
		return cbsImportedDate;
	}

	public boolean isVerified() {
		return verified;
	}

	public boolean isChange() {
		return change;
	}

	public Date getDateOfBirthBS() {
		return dateOfBirthBS;
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

	public Long getScreeningLId() {
		return screeningLId;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setKycnBase(KycnBase kycnBase) {
		this.kycnBase = kycnBase;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public void setCbsGeneratedName(String cbsGeneratedName) {
		this.cbsGeneratedName = cbsGeneratedName;
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

	public void setScreeningId(long screeningId) {
		this.screeningId = screeningId;
	}

	public void setLsTitle(String lsTitle) {
		this.lsTitle = lsTitle;
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

	public void setPreviousName(String previousName) {
		this.previousName = previousName;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public void setCustomerGroup(String customerGroup) {
		this.customerGroup = customerGroup;
	}

	public void setCustomerConstitution(String customerConstitution) {
		this.customerConstitution = customerConstitution;
	}

	public void setCustomerCommunity(String customerCommunity) {
		this.customerCommunity = customerCommunity;
	}

	public void setCustomerCaste(String customerCaste) {
		this.customerCaste = customerCaste;
	}

	public void setCustomerEmployeeId(String customerEmployeeId) {
		this.customerEmployeeId = customerEmployeeId;
	}

	public void setCustomerOpenDate(Date customerOpenDate) {
		this.customerOpenDate = customerOpenDate;
	}

	public void setCustomerMaker(String customerMaker) {
		this.customerMaker = customerMaker;
	}

	public void setCustomerStatusCode(String customerStatusCode) {
		this.customerStatusCode = customerStatusCode;
	}

	public void setMinor(boolean minor) {
		this.minor = minor;
	}

	public void setNonResidentExternal(boolean nonResidentExternal) {
		this.nonResidentExternal = nonResidentExternal;
	}

	public void setCardHolder(boolean cardHolder) {
		this.cardHolder = cardHolder;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public void setCbsImportedDate(Date cbsImportedDate) {
		this.cbsImportedDate = cbsImportedDate;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	public void setChange(boolean change) {
		this.change = change;
	}

	public void setDateOfBirthBS(Date dateOfBirthBS) {
		this.dateOfBirthBS = dateOfBirthBS;
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

	public void setScreeningLId(Long screeningLId) {
		this.screeningLId = screeningLId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getGoamlGender() {
		return goamlGender;
	}

	public void setGoamlGender(String goamlGender) {
		this.goamlGender = goamlGender;
	}

}