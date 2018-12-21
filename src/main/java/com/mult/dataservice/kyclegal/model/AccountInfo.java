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
@Table(name = "kycl_account_info")
public class AccountInfo {

	@Id
	@SequenceGenerator(name = "kycl_account_info_id_seq", sequenceName = "kycl_account_info_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kycl_account_info_id_seq")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "kycl_id")
	@JsonIgnore
	private Kycl kycl;

	@JsonProperty("account_id")
	@Column(name = "account_id")
	private String accountId;

	@JsonProperty("for_account_id")
	@Column(name = "for_account_id")
	private String forAccountId;

	@JsonProperty("currency_of_account")
	@Column(name = "currency_of_account")
	private String currencyOfAccount;

	@JsonProperty("account_no")
	@Column(name = "account_no")
	private String accountNo;

	@JsonProperty("account_name")
	@Column(name = "account_name")
	private String accountName;

	@JsonProperty("account_short_name")
	@Column(name = "account_short_name")
	private String accountShortName;

	@JsonProperty("account_ownership")
	@Column(name = "account_ownership")
	private String accountOwnership;

	@JsonProperty("scheme_type")
	@Column(name = "scheme_type")
	private String schemeType;

	@JsonProperty("scheme_code")
	private String schemeCode;

	@JsonProperty("gl_sub_head_code")
	@Column(name = "gl_sub_head_code")
	private String glSubHeadCode;

	@JsonProperty("product_group")
	@Column(name = "product_group")
	private String productGroup;

	@JsonProperty("last_transaction_date")
	@Column(name = "last_transaction_date")
	private String lastTransactionDate;

	@JsonProperty("account_open_date")
	@Column(name = "account_open_date")
	private String accountOpenDate;

	@JsonProperty("estimated_yearly_transactions")
	@Column(name = "estimated_yearly_transactions")
	private long estimatedYearlyTransactions;

	@JsonProperty("estimated_monthly_transactions")
	@Column(name = "estimated_monthly_transactions")
	private long estimatedMonthlyTransactions;

	@JsonProperty("estimated_yearly_turnover")
	@Column(name = "estimated_yearly_turnover")
	private long estimatedYearlyTurnover;

	@JsonProperty("estimated_monthly_turnover")
	@Column(name = "estimated_monthly_turnover")
	private long estimatedMonthlyTurnover;

	@JsonProperty("regular_source_of_income")
	@Column(name = "regular_source_of_income")
	private String regularSourceOfIncome;

	@JsonProperty("source_of_fund")
	@Column(name = "source_of_fund")
	private String sourceOfFund;

	@JsonProperty("notes")
	private String notes;

	@JsonProperty("nature_of_account")
	@Column(name = "nature_of_account")
	private String natureOfAccount;

	@JsonProperty("scheme_description")
	@Column(name = "scheme_description")
	private String schemeDescription;

	@JsonProperty("dr_balance_limit")
	@Column(name = "dr_balance_limit")
	private String drBalanceLimit;

	@JsonProperty("deposite_amount")
	@Column(name = "deposite_amount")
	private String depositeAmount;

	@JsonProperty("customer_pan")
	@Column(name = "customer_pan")
	private String customerPan;

	@JsonProperty("customer_currency")
	@Column(name = "customer_currency")
	private String customerCurrency;

	@JsonProperty("is_blocked")
	@Column(name = "is_blocked")
	private String isBlocked;

	@JsonProperty("change")
	boolean change;

	@Override
	public String toString() {
		return "AccountInfo [id=" + id + ", accountId=" + accountId + ", forAccountId=" + forAccountId
				+ ", currencyOfAccount=" + currencyOfAccount + ", accountNo=" + accountNo + ", accountName="
				+ accountName + ", accountShortName=" + accountShortName + ", accountOwnership=" + accountOwnership
				+ ", schemeType=" + schemeType + ", schemeCode=" + schemeCode + ", glSubHeadCode=" + glSubHeadCode
				+ ", productGroup=" + productGroup + ", lastTransactionDate=" + lastTransactionDate
				+ ", accountOpenDate=" + accountOpenDate + ", estimatedYearlyTransactions="
				+ estimatedYearlyTransactions + ", estimatedMonthlyTransactions=" + estimatedMonthlyTransactions
				+ ", estimatedYearlyTurnover=" + estimatedYearlyTurnover + ", estimatedMonthlyTurnover="
				+ estimatedMonthlyTurnover + ", regularSourceOfIncome=" + regularSourceOfIncome + ", sourceOfFund="
				+ sourceOfFund + ", notes=" + notes + ", natureOfAccount=" + natureOfAccount + ", schemeDescription="
				+ schemeDescription + ", drBalanceLimit=" + drBalanceLimit + ", depositeAmount=" + depositeAmount
				+ ", customerPan=" + customerPan + ", customerCurrency=" + customerCurrency + ", isBlocked=" + isBlocked
				+ ", change=" + change + "]";
	}

	public Long getId() {
		return id;
	}

	public Kycl getKycl() {
		return kycl;
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

	public String getLastTransactionDate() {
		return lastTransactionDate;
	}

	public String getAccountOpenDate() {
		return accountOpenDate;
	}

	public long getEstimatedYearlyTransactions() {
		return estimatedYearlyTransactions;
	}

	public long getEstimatedMonthlyTransactions() {
		return estimatedMonthlyTransactions;
	}

	public long getEstimatedYearlyTurnover() {
		return estimatedYearlyTurnover;
	}

	public long getEstimatedMonthlyTurnover() {
		return estimatedMonthlyTurnover;
	}

	public String getRegularSourceOfIncome() {
		return regularSourceOfIncome;
	}

	public String getSourceOfFund() {
		return sourceOfFund;
	}

	public String getNotes() {
		return notes;
	}

	public String getNatureOfAccount() {
		return natureOfAccount;
	}

	public String getSchemeDescription() {
		return schemeDescription;
	}

	public String getDrBalanceLimit() {
		return drBalanceLimit;
	}

	public String getDepositeAmount() {
		return depositeAmount;
	}

	public String getCustomerPan() {
		return customerPan;
	}

	public String getCustomerCurrency() {
		return customerCurrency;
	}

	public String getIsBlocked() {
		return isBlocked;
	}

	public boolean isChange() {
		return change;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setKycl(Kycl kycl) {
		this.kycl = kycl;
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

	public void setLastTransactionDate(String lastTransactionDate) {
		this.lastTransactionDate = lastTransactionDate;
	}

	public void setAccountOpenDate(String accountOpenDate) {
		this.accountOpenDate = accountOpenDate;
	}

	public void setEstimatedYearlyTransactions(long estimatedYearlyTransactions) {
		this.estimatedYearlyTransactions = estimatedYearlyTransactions;
	}

	public void setEstimatedMonthlyTransactions(long estimatedMonthlyTransactions) {
		this.estimatedMonthlyTransactions = estimatedMonthlyTransactions;
	}

	public void setEstimatedYearlyTurnover(long estimatedYearlyTurnover) {
		this.estimatedYearlyTurnover = estimatedYearlyTurnover;
	}

	public void setEstimatedMonthlyTurnover(long estimatedMonthlyTurnover) {
		this.estimatedMonthlyTurnover = estimatedMonthlyTurnover;
	}

	public void setRegularSourceOfIncome(String regularSourceOfIncome) {
		this.regularSourceOfIncome = regularSourceOfIncome;
	}

	public void setSourceOfFund(String sourceOfFund) {
		this.sourceOfFund = sourceOfFund;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setNatureOfAccount(String natureOfAccount) {
		this.natureOfAccount = natureOfAccount;
	}

	public void setSchemeDescription(String schemeDescription) {
		this.schemeDescription = schemeDescription;
	}

	public void setDrBalanceLimit(String drBalanceLimit) {
		this.drBalanceLimit = drBalanceLimit;
	}

	public void setDepositeAmount(String depositeAmount) {
		this.depositeAmount = depositeAmount;
	}

	public void setCustomerPan(String customerPan) {
		this.customerPan = customerPan;
	}

	public void setCustomerCurrency(String customerCurrency) {
		this.customerCurrency = customerCurrency;
	}

	public void setIsBlocked(String isBlocked) {
		this.isBlocked = isBlocked;
	}

	public void setChange(boolean change) {
		this.change = change;
	}

}
