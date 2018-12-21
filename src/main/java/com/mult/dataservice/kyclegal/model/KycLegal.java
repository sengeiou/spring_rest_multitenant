package com.mult.dataservice.kyclegal.model;

import java.sql.Date;

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

@Entity
@Table(name = "kycl_legal")
@JsonIgnoreProperties(ignoreUnknown = true)
public class KycLegal {

	@Id
	@SequenceGenerator(name = "kycl_legal_id_seq", sequenceName = "kycl_legal_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kycl_legal_id_seq")
	private Long id;

	@JsonIgnore
	@OneToOne
	@JoinColumn(name = "kycl_id")
	private Kycl kycl;

	@JsonProperty("screening_id")
	@Column(name = "screening_id")
	private Long screeningId;

	@JsonProperty("primary_sol_id")
	@Column(name = "primary_sol_id")
	private String primarySolId;

	@JsonProperty("salutation")
	private String salutation;

	@JsonProperty("name_of_the_institution")
	@Column(name = "name_of_the_institution")
	private String nameOfTheInstitution;

	@JsonProperty("ls_name")
	@Column(name = "ls_name")
	private String lsName;

	@JsonProperty("cust_short_name")
	@Column(name = "cust_short_names")
	private String custShortName;

	@JsonProperty("date_of_establishment")
	@Column(name = "date_of_establishment")
	private String dateOfEstablishment;

	@JsonProperty("notes")
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

	@JsonProperty("customer_employee_id")
	@Column(name = "customer_employee_id")
	private String customerEmployeeId;

	@JsonProperty("customer_open_date")
	@Column(name = "customer_open_date")
	private String customerOpenDate;
	
	@JsonProperty("goaml_customer_constitution")
	@Column(name = "goaml_customer_constitution")
	private String goamlCustomerConstitution;

	@JsonProperty("customer_maker")
	@Column(name = "customer_maker")
	private String customerMaker;

	@JsonProperty("pan_number")
	@Column(name = "pan_number")
	private String panNumber;

	@JsonProperty("minor")
	private boolean minor;

	@JsonProperty("customer_status_code")
	@Column(name = "customer_status_code")
	private String customerStatusCode;

	@JsonProperty("card_holder")
	@Column(name = "card_holder")
	private boolean cardHolder;

	@JsonProperty("non_resident_external")
	@Column(name = "non_resident_external")
	private boolean nonResidentExternal;

	@JsonProperty("cust_id")
	@Column(name = "cust_id")
	private String custId;

	@JsonProperty("kycl_status")
	@Column(name = "kycl_status")
	private String kyclStatus;

	@JsonProperty("last_update_date")
	@Column(name = "last_update_date")
	private String lastUpdateDate;

	@JsonProperty("last_screened_date")
	@Column(name = "last_screened_date")
	private String lastScreenedDate;

	@JsonProperty("verified_record")
	@Column(name = "verified_record")
	boolean verifiedRecord;

	@JsonProperty("audited_fiscal_year")
	@Column(name = "audited_fiscal_year")
	private String auditedFiscalYear;

	@JsonProperty("net_profit")
	@Column(name = "net_profit")
	private String netProfit;

	@JsonProperty("net_loss")
	@Column(name = "net_loss")
	private String netLoss;

	@JsonProperty("tax_clearence_certificate_date")
	@Column(name = "tax_clearence_certificate_date")
	private String taxClearenceCertificateDate;

	@JsonProperty("tax_clearence_fiscal_year")
	@Column(name = "tax_clearence_fiscal_year")
	private String taxClearenceFiscalYear;

	@JsonProperty("next_clearence_certificate_date")
	@Column(name = "next_clearence_certificate_date")
	private String nextClearenceCertificateDate;

	@JsonProperty("taxable_amount")
	@Column(name = "taxable_amount")
	private String taxableAmount;

	@JsonProperty("taxable_income")
	@Column(name = "taxable_income")
	private String taxableIncome;

	@JsonProperty("tax_paid")
	@Column(name = "tax_paid")
	private String taxPaid;

	@JsonProperty("tax_paid_date")
	@Column(name = "tax_paid_date")
	private String taxPaidDate;

	@JsonProperty("types_of_industry")
	@Column(name = "types_of_industry")
	private String typeOfIndustry;

	@JsonProperty("change")
	private boolean change;

	@JsonProperty("date_of_establishment_bs")
	@Column(name = "date_of_establishment_bs")
	private Date dateOfEstablishmentBS;


	public Long getId() {
		return id;
	}

	public Kycl getKycl() {
		return kycl;
	}

	

	public String getPrimarySolId() {
		return primarySolId;
	}

	public String getSalutation() {
		return salutation;
	}

	public String getNameOfTheInstitution() {
		return nameOfTheInstitution;
	}

	public String getLsName() {
		return lsName;
	}

	public String getCustShortName() {
		return custShortName;
	}

	public String getDateOfEstablishment() {
		return dateOfEstablishment;
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

	public String getCustomerEmployeeId() {
		return customerEmployeeId;
	}

	public String getCustomerOpenDate() {
		return customerOpenDate;
	}

	public String getCustomerMaker() {
		return customerMaker;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public boolean isMinor() {
		return minor;
	}

	public String getCustomerStatusCode() {
		return customerStatusCode;
	}

	public boolean isCardHolder() {
		return cardHolder;
	}

	public boolean isNonResidentExternal() {
		return nonResidentExternal;
	}

	public String getCustId() {
		return custId;
	}

	public String getKyclStatus() {
		return kyclStatus;
	}

	public String getLastUpdateDate() {
		return lastUpdateDate;
	}

	public String getLastScreenedDate() {
		return lastScreenedDate;
	}

	public boolean isVerifiedRecord() {
		return verifiedRecord;
	}

	public String getAuditedFiscalYear() {
		return auditedFiscalYear;
	}

	public String getNetProfit() {
		return netProfit;
	}

	public String getNetLoss() {
		return netLoss;
	}

	public String getTaxClearenceCertificateDate() {
		return taxClearenceCertificateDate;
	}

	public String getTaxClearenceFiscalYear() {
		return taxClearenceFiscalYear;
	}

	public String getNextClearenceCertificateDate() {
		return nextClearenceCertificateDate;
	}

	public String getTaxableAmount() {
		return taxableAmount;
	}

	public String getTaxableIncome() {
		return taxableIncome;
	}

	public String getTaxPaid() {
		return taxPaid;
	}

	public String getTaxPaidDate() {
		return taxPaidDate;
	}

	public String getTypeOfIndustry() {
		return typeOfIndustry;
	}

	public boolean isChange() {
		return change;
	}

	public Date getDateOfEstablishmentBS() {
		return dateOfEstablishmentBS;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setKycl(Kycl kycl) {
		this.kycl = kycl;
	}

	

	public void setPrimarySolId(String primarySolId) {
		this.primarySolId = primarySolId;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public void setNameOfTheInstitution(String nameOfTheInstitution) {
		this.nameOfTheInstitution = nameOfTheInstitution;
	}

	public void setLsName(String lsName) {
		this.lsName = lsName;
	}

	public void setCustShortName(String custShortName) {
		this.custShortName = custShortName;
	}

	public void setDateOfEstablishment(String dateOfEstablishment) {
		this.dateOfEstablishment = dateOfEstablishment;
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

	public void setCustomerEmployeeId(String customerEmployeeId) {
		this.customerEmployeeId = customerEmployeeId;
	}

	public void setCustomerOpenDate(String customerOpenDate) {
		this.customerOpenDate = customerOpenDate;
	}

	public void setCustomerMaker(String customerMaker) {
		this.customerMaker = customerMaker;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public void setMinor(boolean minor) {
		this.minor = minor;
	}

	public void setCustomerStatusCode(String customerStatusCode) {
		this.customerStatusCode = customerStatusCode;
	}

	public void setCardHolder(boolean cardHolder) {
		this.cardHolder = cardHolder;
	}

	public void setNonResidentExternal(boolean nonResidentExternal) {
		this.nonResidentExternal = nonResidentExternal;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public void setKyclStatus(String kyclStatus) {
		this.kyclStatus = kyclStatus;
	}

	public void setLastUpdateDate(String lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public void setLastScreenedDate(String lastScreenedDate) {
		this.lastScreenedDate = lastScreenedDate;
	}

	public void setVerifiedRecord(boolean verifiedRecord) {
		this.verifiedRecord = verifiedRecord;
	}

	public void setAuditedFiscalYear(String auditedFiscalYear) {
		this.auditedFiscalYear = auditedFiscalYear;
	}

	public void setNetProfit(String netProfit) {
		this.netProfit = netProfit;
	}

	public void setNetLoss(String netLoss) {
		this.netLoss = netLoss;
	}

	public void setTaxClearenceCertificateDate(String taxClearenceCertificateDate) {
		this.taxClearenceCertificateDate = taxClearenceCertificateDate;
	}

	public void setTaxClearenceFiscalYear(String taxClearenceFiscalYear) {
		this.taxClearenceFiscalYear = taxClearenceFiscalYear;
	}

	public void setNextClearenceCertificateDate(String nextClearenceCertificateDate) {
		this.nextClearenceCertificateDate = nextClearenceCertificateDate;
	}

	public void setTaxableAmount(String taxableAmount) {
		this.taxableAmount = taxableAmount;
	}

	public void setTaxableIncome(String taxableIncome) {
		this.taxableIncome = taxableIncome;
	}

	public void setTaxPaid(String taxPaid) {
		this.taxPaid = taxPaid;
	}

	public void setTaxPaidDate(String taxPaidDate) {
		this.taxPaidDate = taxPaidDate;
	}

	public void setTypeOfIndustry(String typeOfIndustry) {
		this.typeOfIndustry = typeOfIndustry;
	}

	public void setChange(boolean change) {
		this.change = change;
	}

	public void setDateOfEstablishmentBS(Date dateOfEstablishmentBS) {
		this.dateOfEstablishmentBS = dateOfEstablishmentBS;
	}

	public Long getScreeningId() {
		return screeningId;
	}

	public String getGoamlCustomerConstitution() {
		return goamlCustomerConstitution;
	}

	public void setScreeningId(Long screeningId) {
		this.screeningId = screeningId;
	}

	public void setGoamlCustomerConstitution(String goamlCustomerConstitution) {
		this.goamlCustomerConstitution = goamlCustomerConstitution;
	}

}
