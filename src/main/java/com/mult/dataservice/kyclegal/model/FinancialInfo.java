package com.mult.dataservice.kyclegal.model;

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
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "kycl_financial_info")
public class FinancialInfo {

	@Id
	@SequenceGenerator(name = "kycl_financial_info_id_seq", sequenceName = "kycl_financial_info_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kycl_financial_info_id_seq")
	private Long id;

	@OneToOne
	@JoinColumn(name = "kycl_id")
	@JsonIgnore
	private Kycl kycl;

	@JsonProperty("customer_pan")
	@Column(name = "customer_pan")
	private String customerPan;

	@JsonProperty("customer_currency")
	@Column(name = "customer_currency")
	private String customerCurrency;

	// @JsonProperty("individual_services_subscribed")
	// @Column(name="individual_servies_subscribed")
	// private List<String> individualServiceSubscribed = new ArrayList<>();
	//
	// @JsonProperty("individual_cards_subscribed")
	// @Column(name="individual_cards_subscribed")
	// private List<String> individualCardSubscribed;

	@JsonProperty("change")
	private boolean change;

	@JsonProperty("notes")
	private String notes;

	@Override
	public String toString() {
		return "FinancialInfo [id=" + id + ", customerPan=" + customerPan + ", customerCurrency=" + customerCurrency
				+ ", change=" + change + ", notes=" + notes + "]";
	}

	public Long getId() {
		return id;
	}

	public Kycl getKycl() {
		return kycl;
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

	public String getNotes() {
		return notes;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setKycl(Kycl kycl) {
		this.kycl = kycl;
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

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
