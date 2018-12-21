package com.mult.dataservice.str.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "str_natural")
public class StrNatural {
	@Id
	@SequenceGenerator(name = "str_natural_id_seq", sequenceName = "str_natural_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "str_natural_id_seq")
	private Long id;

	private String description;
	private Double frequency;
	private String type;
	private Double duration;

	@Column(name = "account_number")
	@JsonProperty("account_number")
	private String accountNumber;

	@Column(name = "amount_max")
	@JsonProperty("amount_max")
	private Double amountMax;

	@Column(name = "amount_min")
	@JsonProperty("amount_min")
	private Double amountMin;

	@OneToMany(mappedBy = "legal", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonProperty("str_info")
	private Set<StrInfo> strInfo = new HashSet<>();

	@OneToOne
	@JoinColumn(name = "str_id")
	@JsonIgnore
	private Str str;

	@Override
	public String toString() {
		return "StrNatural [id=" + id + ", description=" + description + ", frequency=" + frequency + ", type=" + type
				+ ", duration=" + duration + ", accountNumber=" + accountNumber + ", amountMax=" + amountMax
				+ ", amountMin=" + amountMin + ", strInfo=" + strInfo + "]";
	}

	public Long getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public Double getFrequency() {
		return frequency;
	}

	public String getType() {
		return type;
	}

	public Double getDuration() {
		return duration;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public Double getAmountMax() {
		return amountMax;
	}

	public Double getAmountMin() {
		return amountMin;
	}

	public Set<StrInfo> getStrInfo() {
		return strInfo;
	}

	public Str getStr() {
		return str;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setFrequency(Double frequency) {
		this.frequency = frequency;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setDuration(Double duration) {
		this.duration = duration;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setAmountMax(Double amountMax) {
		this.amountMax = amountMax;
	}

	public void setAmountMin(Double amountMin) {
		this.amountMin = amountMin;
	}

	public void setStrInfo(Set<StrInfo> strInfo) {
		this.strInfo = strInfo;
	}

	public void setStr(Str str) {
		this.str = str;
	}

}
