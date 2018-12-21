package com.mult.dataservice.ttr.model;

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
@Table(name = "ttr_natural")

public class TtrNatural {
	@Id
	@SequenceGenerator(name = "ttr_natural_id_seq", sequenceName = "ttr_natural_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ttr_natural_id_seq")
	private Long id;

	private String description;
	private Double threshold;
	private String type;

	@Column(name = "account_number")
	@JsonProperty("account_number")
	private String accountNumber;

	@OneToMany(mappedBy = "natural", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonProperty("ttr_info")
	private Set<TtrInfo> ttrInfo = new HashSet<>();

	@OneToOne
	@JoinColumn(name = "ttr_id")
	@JsonIgnore
	private Ttr ttr;

	@Override
	public String toString() {
		return "Natural [id=" + id + ", description=" + description + ", threshold=" + threshold + ", type=" + type
				+ ", accountNumber=" + accountNumber + ", ttrInfo=" + ttrInfo + "]";
	}

	public Long getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public Double getThreshold() {
		return threshold;
	}

	public String getType() {
		return type;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public Set<TtrInfo> getTtrInfo() {
		return ttrInfo;
	}

	public Ttr getTtr() {
		return ttr;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setThreshold(Double threshold) {
		this.threshold = threshold;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setTtrInfo(Set<TtrInfo> ttrInfo) {
		this.ttrInfo = ttrInfo;
	}

	public void setTtr(Ttr ttr) {
		this.ttr = ttr;
	}

}
