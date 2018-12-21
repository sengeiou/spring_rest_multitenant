package com.mult.dataservice.kycnatural.model;

import java.sql.Date;

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
@Table(name="kycn_accounts_info")
@JsonIgnoreProperties(ignoreUnknown = true)
public class KycnAccountsInfo {

	@Id
	@SequenceGenerator(name="kycn_accounts_info_id_seq", sequenceName = "kycn_accounts_info_id_seq", allocationSize = 1)
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "kycn_accounts_info_id_seq")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="kycn_base_id")
	@JsonIgnore
	private KycnBase kycnBase;
	
	@JsonProperty("account_id")
	@Column(name="account_id")
	private String accountId;

	@JsonProperty("for_account_id")
	@Column(name="for_account_id")
	private String forAccountId;

	@Column(name="currency_of_account")
	@JsonProperty("currency_of_account")
	private String currencyOfAccount;

	@Column(name="account_no")
	@JsonProperty("account_no")
	private String accountNo;

	@Column(name="account_name")
	@JsonProperty("account_name")
	private String accountName;

	@Column(name="account_short_name")
	@JsonProperty("account_short_name")
	private String accountShortName;

	@Column(name= "account_ownership")
	@JsonProperty("account_ownership")
	private String accountOwnership;

	@Column(name="scheme_type")
	@JsonProperty("scheme_type")
	private String schemeType;

	@JsonProperty("scheme_code")
	@Column(name="scheme_code")
	private String schemeCode;

	@JsonProperty("gl_sub_head_code")
	@Column(name= "gl_sub_head_code")
	private String glSubHeadCode;

	@JsonProperty("product_group")
	@Column(name="product_group")
	private String productGroup;
	

	@JsonProperty("last_transaction_date")
	@Column(name="last_transaction_date")
	private Date lastTransactionDate;

	@JsonProperty("account_open_date")
	@Column(name="account_open_date")
	private Date accountOpenDate;

	@JsonProperty("estimated_monthly_turnover")
	@Column(name="estimated_monthly_turnover")
	private String estimatedMonthlyTurnOver;

	@JsonProperty("estimated_yearly_turnover")
	@Column(name="estimated_yearly_turnover")
	private String estimatedYearlyTurnOver;

	@JsonProperty("estimated_monthly_transactions")
	@Column(name="estimated_monthly_transactions")
	private String estimatedMonthlyTransaction;

	@JsonProperty("estimated_yearly_transactions")
	@Column(name="estimated_yearly_transactions")
	private String estimatedYearlyTransaction;

	@JsonProperty("source_of_fund")
	@Column(name="source_of_fund")
	private String sourceOfFund;

	@JsonProperty("regular_source_of_income")
	@Column(name="regular_source_of_income")
	private String regularSourceOfIncome;

	@JsonProperty("notes")
	@Column(name="notes")
	private String notes;
	
//	@JsonProperty("accounts_services_subscribed")
//	@Column(name="accounts_services_subscribed")
//	private List<String> accountServiceSubscribed;
//
//	@JsonProperty("accounts_cards_subscribed")
//	@Column(name="accounts_cards_subscribed")
//	private List<String> accountCardSubscribed;

	@JsonProperty("change")
	@Column(name="change")
	private boolean change;
	
	@JsonProperty("nature_of_account")
	@Column(name="")
	String natureOfAccount;

	@JsonProperty("scheme_description")
	@Column(name="scheme_description")
	String schemeDescription;
	
	@JsonProperty("is_blocked")
	@Column(name="is_blocked")
	private String isBlocked;

	@Column(name="maker")
	private String maker;
	
	@Column(name="checker")
	private String checker;
	
	@Column(name="approved")
	private boolean approved;
	
	@Column(name="updateDate")
	private Date updateDate;
	
	@Column(name="approvedDate")
	private Date approvedDate;
	
	@Column(name="reason")
	private String reason;

	@Override
	public String toString() {
		return "KycnAccountsInfo [id=" + id + ", accountId=" + accountId + ", forAccountId=" + forAccountId
				+ ", currencyOfAccount=" + currencyOfAccount + ", accountNo=" + accountNo + ", accountName="
				+ accountName + ", accountShortName=" + accountShortName + ", accountOwnership=" + accountOwnership
				+ ", schemeType=" + schemeType + ", schemeCode=" + schemeCode + ", glSubHeadCode=" + glSubHeadCode
				+ ", productGroup=" + productGroup + ", lastTransactionDate=" + lastTransactionDate
				+ ", accountOpenDate=" + accountOpenDate + ", estimatedMonthlyTurnOver=" + estimatedMonthlyTurnOver
				+ ", estimatedYearlyTurnOver=" + estimatedYearlyTurnOver + ", estimatedMonthlyTransaction="
				+ estimatedMonthlyTransaction + ", estimatedYearlyTransaction=" + estimatedYearlyTransaction
				+ ", sourceOfFund=" + sourceOfFund + ", regularSourceOfIncome=" + regularSourceOfIncome + ", notes="
				+ notes + ", change=" + change + ", natureOfAccount=" + natureOfAccount + ", schemeDescription="
				+ schemeDescription + ", isBlocked=" + isBlocked + ", maker=" + maker + ", checker=" + checker
				+ ", approved=" + approved + ", updateDate=" + updateDate + ", approvedDate=" + approvedDate
				+ ", reason=" + reason + "]";
	}

	public Long getId() {
		return id;
	}

	public KycnBase getKycnBase() {
		return kycnBase;
	}

	public String getAccountId() {
		return accountId;
	}

	public String getForAccountId() {
		return forAccountId;
	}

	public String getCurrencyOfAccount() {
		return currencyOfAccount;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public String getAccountShortName() {
		return accountShortName;
	}

	public String getAccountOwnership() {
		return accountOwnership;
	}

	public String getSchemeType() {
		return schemeType;
	}

	public String getSchemeCode() {
		return schemeCode;
	}

	public String getGlSubHeadCode() {
		return glSubHeadCode;
	}

	public String getProductGroup() {
		return productGroup;
	}

	public Date getLastTransactionDate() {
		return lastTransactionDate;
	}

	public Date getAccountOpenDate() {
		return accountOpenDate;
	}

	public String getEstimatedMonthlyTurnOver() {
		return estimatedMonthlyTurnOver;
	}

	public String getEstimatedYearlyTurnOver() {
		return estimatedYearlyTurnOver;
	}

	public String getEstimatedMonthlyTransaction() {
		return estimatedMonthlyTransaction;
	}

	public String getEstimatedYearlyTransaction() {
		return estimatedYearlyTransaction;
	}

	public String getSourceOfFund() {
		return sourceOfFund;
	}

	public String getRegularSourceOfIncome() {
		return regularSourceOfIncome;
	}

	public String getNotes() {
		return notes;
	}

	public boolean isChange() {
		return change;
	}

	public String getNatureOfAccount() {
		return natureOfAccount;
	}

	public String getSchemeDescription() {
		return schemeDescription;
	}

	public String getIsBlocked() {
		return isBlocked;
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

	public void setId(Long id) {
		this.id = id;
	}

	public void setKycnBase(KycnBase kycnBase) {
		this.kycnBase = kycnBase;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public void setForAccountId(String forAccountId) {
		this.forAccountId = forAccountId;
	}

	public void setCurrencyOfAccount(String currencyOfAccount) {
		this.currencyOfAccount = currencyOfAccount;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public void setAccountShortName(String accountShortName) {
		this.accountShortName = accountShortName;
	}

	public void setAccountOwnership(String accountOwnership) {
		this.accountOwnership = accountOwnership;
	}

	public void setSchemeType(String schemeType) {
		this.schemeType = schemeType;
	}

	public void setSchemeCode(String schemeCode) {
		this.schemeCode = schemeCode;
	}

	public void setGlSubHeadCode(String glSubHeadCode) {
		this.glSubHeadCode = glSubHeadCode;
	}

	public void setProductGroup(String productGroup) {
		this.productGroup = productGroup;
	}

	public void setLastTransactionDate(Date lastTransactionDate) {
		this.lastTransactionDate = lastTransactionDate;
	}

	public void setAccountOpenDate(Date accountOpenDate) {
		this.accountOpenDate = accountOpenDate;
	}

	public void setEstimatedMonthlyTurnOver(String estimatedMonthlyTurnOver) {
		this.estimatedMonthlyTurnOver = estimatedMonthlyTurnOver;
	}

	public void setEstimatedYearlyTurnOver(String estimatedYearlyTurnOver) {
		this.estimatedYearlyTurnOver = estimatedYearlyTurnOver;
	}

	public void setEstimatedMonthlyTransaction(String estimatedMonthlyTransaction) {
		this.estimatedMonthlyTransaction = estimatedMonthlyTransaction;
	}

	public void setEstimatedYearlyTransaction(String estimatedYearlyTransaction) {
		this.estimatedYearlyTransaction = estimatedYearlyTransaction;
	}

	public void setSourceOfFund(String sourceOfFund) {
		this.sourceOfFund = sourceOfFund;
	}

	public void setRegularSourceOfIncome(String regularSourceOfIncome) {
		this.regularSourceOfIncome = regularSourceOfIncome;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setChange(boolean change) {
		this.change = change;
	}

	public void setNatureOfAccount(String natureOfAccount) {
		this.natureOfAccount = natureOfAccount;
	}

	public void setSchemeDescription(String schemeDescription) {
		this.schemeDescription = schemeDescription;
	}

	public void setIsBlocked(String isBlocked) {
		this.isBlocked = isBlocked;
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
	
}
