package com.mult.dataservice.kycnatural.model;

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
@Table(name = "kycn_financial_info")
public class KycnFinancialInfo {

	@Id
	@SequenceGenerator(name = "kycn_financial_info_id_seq", sequenceName = "kycn_financial_info_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kycn_financial_info_id_seq")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "kycn_base_id")
	@JsonIgnore
	private KycnBase kycnBase;

	@JsonProperty("customer_pan")
	@Column(name = "customer_pan")
	private String customerPan;

	@JsonProperty("customer_currency")
	@Column(name = "customer_currency")
	private String customerCurrency;

	// @JsonProperty("individual_services_subscribed")
	// @Column(name="individual_services_subscribed")
	// private List<String> individualServiceSubscribed;
	//
	// @JsonProperty("individual_cards_subscribed")
	// @Column(name="individual_cards_subscribed")
	// private List<String> individualCardSubscribed;

	@JsonProperty("change")
	@Column(name = "change")
	private boolean change;

	@Override
	public String toString() {
		return "KycnFinancialInfo [id=" + id + ", customerPan=" + customerPan + ", customerCurrency=" + customerCurrency
				+ ", change=" + change + "]";
	}

	public Long getId() {
		return id;
	}

	public KycnBase getKycnBase() {
		return kycnBase;
	}

	public String getCustomerPan() {
		return customerPan;
	}

	public String getCustomerCurrency() {
		return customerCurrency;
	}

	public boolean isChange() {
		return change;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setKycnBase(KycnBase kycnBase) {
		this.kycnBase = kycnBase;
	}

	public void setCustomerPan(String customerPan) {
		this.customerPan = customerPan;
	}

	public void setCustomerCurrency(String customerCurrency) {
		this.customerCurrency = customerCurrency;
	}

	public void setChange(boolean change) {
		this.change = change;
	}

}
