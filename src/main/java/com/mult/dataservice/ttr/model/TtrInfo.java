package com.mult.dataservice.ttr.model;

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
@Table(name = "ttr_info")
public class TtrInfo {

	@Id
	@SequenceGenerator(name = "ttr_info_id_seq", sequenceName = "ttr_info_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ttr_info_id_seq")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "natural_id")
	@JsonIgnore
	private TtrNatural natural;

	@ManyToOne
	@JoinColumn(name = "legl_id")
	@JsonIgnore
	private TtrLegal legal;

	@JsonProperty("branch_sol_id")
	@Column(name = "branch_sol_id")
	private String branchSolId;

	@JsonProperty("account_type")
	@Column(name = "acount_type")
	private String accountType;

	@JsonProperty("trans_date")
	@Column(name = "trans_date")
	private String transDate;

	@JsonProperty("notes")
	private String notes;
	@JsonProperty("description")
	private String description;

	@Column(name = "city_code")
	@JsonProperty("city_code")
	private String cityCode;

	@Column(name = "trans_id")
	@JsonProperty("trans_id")
	private String transId;

	@Column(name = "kyc_id")
	@JsonProperty("kyc_id")
	private String kycId;

	@JsonProperty("account_no")
	@Column(name = "account_no")
	private String accountNo;

	@Column(name = "rate_code")
	@JsonProperty("rate_code")
	private String rateCode;

	@Column(name = "currency_code")
	@JsonProperty("currency_code")
	private String currencyCode;

	@Column(name = "extra_cheque_no")
	@JsonProperty("extra_cheque_no")
	private String extraChequeNo;

	@Column(name = "account_type_type")
	@JsonProperty("account_type_type")
	private String accountTypeType;

	@Column(name = "entered_by")
	@JsonProperty("entered_by")
	private String enteredBy;

	@Column(name = "trans_detail")
	@JsonProperty("trans_detail")
	private String transDetail;

	@JsonProperty("nostro_branch_id")
	@Column(name = "nostro_branch_id")
	private String nostroBranchId;

	@JsonProperty("local_currency_amount")
	@Column(name = "local_currency_amount")
	private Double localCurrencyAmount;

	@Column(name = "trans_type")
	@JsonProperty("trans_type")
	private String transType;

	@JsonProperty("notice")
	private String notice;

	@JsonProperty("amount")
	private Double amount;

	@JsonProperty("trans_instrument")
	@Column(name = "trans_instrument")
	private String transInstrument;

	@JsonProperty("cheque_no")
	@Column(name = "cheque_no")
	private String chequeNo;

	@Column(name = "trans_category")
	@JsonProperty("trans_category")
	private String transCategory;

	@Column(name = "trans_source")
	@JsonProperty("trans_source")
	private String transSource;

	@JsonProperty("trans_currency_code")
	@Column(name = "trans_currency_code")
	private String transCurrencyCode;

	@JsonProperty("abbs_code")
	@Column(name = "abbs_code")
	private String avvsCode;

	@Column(name = "cust_code")
	@JsonProperty("cust_code")
	private String custCode;

	@JsonProperty("trans_sub_category")
	@Column(name = "trans_sub_category")
	private String transSubCategory;

	@Column(name = "approved_by")
	@JsonProperty("approved_by")
	private String approvedBy;

	@Column(name = "source_of_fund")
	@JsonProperty("source_of_fund")
	private String sourceOfFund;

	@Column(name = "reference_no")
	@JsonProperty("reference_no")
	private String referenceNo;

	@Column(name = "sequence_no")
	@JsonProperty("sequence_no")
	private String sequenceNo;

	@Column(name = "trans_dest")
	@JsonProperty("trans_dest")
	private String transDest;

	@JsonProperty("status")
	private String status;

	@Override
	public String toString() {
		return "TtrInfo [id=" + id + ", branchSolId=" + branchSolId + ", accountType=" + accountType + ", transDate="
				+ transDate + ", notes=" + notes + ", description=" + description + ", cityCode=" + cityCode
				+ ", transId=" + transId + ", kycId=" + kycId + ", accountNo=" + accountNo + ", rateCode=" + rateCode
				+ ", currencyCode=" + currencyCode + ", extraChequeNo=" + extraChequeNo + ", accountTypeType="
				+ accountTypeType + ", enteredBy=" + enteredBy + ", transDetail=" + transDetail + ", nostroBranchId="
				+ nostroBranchId + ", localCurrencyAmount=" + localCurrencyAmount + ", transType=" + transType
				+ ", notice=" + notice + ", amount=" + amount + ", transInstrument=" + transInstrument + ", chequeNo="
				+ chequeNo + ", transCategory=" + transCategory + ", transSource=" + transSource
				+ ", transCurrencyCode=" + transCurrencyCode + ", avvsCode=" + avvsCode + ", custCode=" + custCode
				+ ", transSubCategory=" + transSubCategory + ", approvedBy=" + approvedBy + ", sourceOfFund="
				+ sourceOfFund + ", referenceNo=" + referenceNo + ", sequenceNo=" + sequenceNo + ", transDest="
				+ transDest + ", status=" + status + "]";
	}

	public Long getId() {
		return id;
	}

	public TtrNatural getNatural() {
		return natural;
	}

	public TtrLegal getLegal() {
		return legal;
	}

	public String getBranchSolId() {
		return branchSolId;
	}

	public String getAccountType() {
		return accountType;
	}

	public String getTransDate() {
		return transDate;
	}

	public String getNotes() {
		return notes;
	}

	public String getDescription() {
		return description;
	}

	public String getCityCode() {
		return cityCode;
	}

	public String getTransId() {
		return transId;
	}

	public String getKycId() {
		return kycId;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public String getRateCode() {
		return rateCode;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public String getExtraChequeNo() {
		return extraChequeNo;
	}

	public String getAccountTypeType() {
		return accountTypeType;
	}

	public String getEnteredBy() {
		return enteredBy;
	}

	public String getTransDetail() {
		return transDetail;
	}

	public String getNostroBranchId() {
		return nostroBranchId;
	}

	public Double getLocalCurrencyAmount() {
		return localCurrencyAmount;
	}

	public String getTransType() {
		return transType;
	}

	public String getNotice() {
		return notice;
	}

	public Double getAmount() {
		return amount;
	}

	public String getTransInstrument() {
		return transInstrument;
	}

	public String getChequeNo() {
		return chequeNo;
	}

	public String getTransCategory() {
		return transCategory;
	}

	public String getTransSource() {
		return transSource;
	}

	public String getTransCurrencyCode() {
		return transCurrencyCode;
	}

	public String getAvvsCode() {
		return avvsCode;
	}

	public String getCustCode() {
		return custCode;
	}

	public String getTransSubCategory() {
		return transSubCategory;
	}

	public String getApprovedBy() {
		return approvedBy;
	}

	public String getSourceOfFund() {
		return sourceOfFund;
	}

	public String getReferenceNo() {
		return referenceNo;
	}

	public String getSequenceNo() {
		return sequenceNo;
	}

	public String getTransDest() {
		return transDest;
	}

	public String getStatus() {
		return status;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNatural(TtrNatural natural) {
		this.natural = natural;
	}

	public void setLegal(TtrLegal legal) {
		this.legal = legal;
	}

	public void setBranchSolId(String branchSolId) {
		this.branchSolId = branchSolId;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public void setTransDate(String transDate) {
		this.transDate = transDate;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public void setTransId(String transId) {
		this.transId = transId;
	}

	public void setKycId(String kycId) {
		this.kycId = kycId;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public void setRateCode(String rateCode) {
		this.rateCode = rateCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public void setExtraChequeNo(String extraChequeNo) {
		this.extraChequeNo = extraChequeNo;
	}

	public void setAccountTypeType(String accountTypeType) {
		this.accountTypeType = accountTypeType;
	}

	public void setEnteredBy(String enteredBy) {
		this.enteredBy = enteredBy;
	}

	public void setTransDetail(String transDetail) {
		this.transDetail = transDetail;
	}

	public void setNostroBranchId(String nostroBranchId) {
		this.nostroBranchId = nostroBranchId;
	}

	public void setLocalCurrencyAmount(Double localCurrencyAmount) {
		this.localCurrencyAmount = localCurrencyAmount;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public void setTransInstrument(String transInstrument) {
		this.transInstrument = transInstrument;
	}

	public void setChequeNo(String chequeNo) {
		this.chequeNo = chequeNo;
	}

	public void setTransCategory(String transCategory) {
		this.transCategory = transCategory;
	}

	public void setTransSource(String transSource) {
		this.transSource = transSource;
	}

	public void setTransCurrencyCode(String transCurrencyCode) {
		this.transCurrencyCode = transCurrencyCode;
	}

	public void setAvvsCode(String avvsCode) {
		this.avvsCode = avvsCode;
	}

	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}

	public void setTransSubCategory(String transSubCategory) {
		this.transSubCategory = transSubCategory;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	public void setSourceOfFund(String sourceOfFund) {
		this.sourceOfFund = sourceOfFund;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public void setSequenceNo(String sequenceNo) {
		this.sequenceNo = sequenceNo;
	}

	public void setTransDest(String transDest) {
		this.transDest = transDest;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
