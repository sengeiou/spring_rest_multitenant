package com.mult.dataservice.bfibank.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "bfi")

public class Bfi {

	@Id
	@SequenceGenerator(name = "bfi_id_seq", sequenceName = "bfi_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bfi_id_seq")
	private Long id;

	@OneToOne(mappedBy = "bfi", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonProperty("bfi_info")
	private BfiInfo bfiInfo;

	@OneToMany(mappedBy = "bfi", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonProperty("bfi_address")
	private Set<BfiAddress> bfiAddress = new HashSet<>();

	@OneToMany(mappedBy = "bfi", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonProperty("bfi_contact")
	private Set<BfiContact> bfiContact = new HashSet<>();

	@OneToMany(mappedBy = "bfi", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonProperty("bfi_email")
	private Set<BfiEmail> bfiEmail = new HashSet<>();

	private boolean updated;

	@Override
	public String toString() {
		return "Bfi [id=" + id + ", bfiInfo=" + bfiInfo + ", bfiAddress=" + bfiAddress + ", bfiContact=" + bfiContact
				+ ", bfiEmail=" + bfiEmail + ", updated=" + updated + "]";
	}

	public Long getId() {
		return id;
	}

	public BfiInfo getBfiInfo() {
		return bfiInfo;
	}

	public Set<BfiAddress> getBfiAddress() {
		return bfiAddress;
	}

	public Set<BfiContact> getBfiContact() {
		return bfiContact;
	}

	public Set<BfiEmail> getBfiEmail() {
		return bfiEmail;
	}

	public boolean isUpdated() {
		return updated;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setBfiInfo(BfiInfo bfiInfo) {
		this.bfiInfo = bfiInfo;
	}

	public void setBfiAddress(Set<BfiAddress> bfiAddress) {
		this.bfiAddress = bfiAddress;
	}

	public void setBfiContact(Set<BfiContact> bfiContact) {
		this.bfiContact = bfiContact;
	}

	public void setBfiEmail(Set<BfiEmail> bfiEmail) {
		this.bfiEmail = bfiEmail;
	}

	public void setUpdated(boolean updated) {
		this.updated = updated;
	}

}
